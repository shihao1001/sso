/**
 * 
 */
package com.shihao.sso.admin.controller;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shihao.sso.admin.dao.bean.AppDO;
import com.shihao.sso.admin.dao.bean.TokenDO;
import com.shihao.sso.admin.dao.bean.UserDO;
import com.shihao.sso.admin.mapper.AppMapper;
import com.shihao.sso.admin.mapper.TokenMapper;
import com.shihao.sso.admin.service.UserService;
import com.shihao.sso.admin.web.bean.CheckBean;
import com.shihao.sso.admin.web.bean.JsonResult;
import com.shihao.sso.admin.web.bean.LoginBean;
import com.shihao.sso.admin.web.cache.LocalCache;



/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午6:54:49
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userSerivice;
	@Autowired
	private AppMapper appMapper;
	@Autowired
	private TokenMapper tokenMapper;
	
	@RequestMapping(value = "/login")
	public Object login(HttpServletResponse response, 
			@CookieValue(value= "sessionID",defaultValue = "") String sessionID, 
			LoginBean loginBean) throws Exception {
		if (loginBean == null) {
			throw new Exception();
		}
		boolean isLogined = false;
		TokenDO token = null;
		//1，判断用户是否已经登录过
		if (StringUtils.isNotBlank(sessionID)) {
			Pair<TokenDO, UserDO> pair = LocalCache.get(sessionID);
			if (pair != null && pair.getLeft().getExpireTime().after(new Date())) {
				token = pair.getLeft();
				isLogined = true;
			}
		} 
		//2，如果没有登录，则开始登录。用户登录成功后，生成token，并设置cookie和session
		if (!isLogined) {
			if (StringUtils.isBlank(loginBean.getName()) || StringUtils.isBlank(loginBean.getPassword())) {
				//如果用户名 密码为空，重定向到登录页面 ,否则则是提交登录信息的
				return "login";
			}
			token = userSerivice.login(loginBean.getName(), loginBean.getPassword());
			if (token != null) {
				setCookieAndSession(response, token, loginBean.getName());
			}
		}
		//如果登录成功，拿到token，则开始判断系统重定向的地址
		if (token != null) {	
			if (StringUtils.isNotBlank(loginBean.getAppId()) && StringUtils.isNotBlank(loginBean.getDesUrl())) {
				//从其他系统重定向过来登录的，需要跳转到相应的系统
				AppDO appInfo = appMapper.getByCode(loginBean.getAppId());
				return "redirect:" + appInfo.getCallback() + "?token=" + token.getToken() + "&desUrl=" + loginBean.getDesUrl();
				//return "redirect:http://127.0.0.1:8080/sso-sub-one/callback/check?token=" + token.getToken() + "&desUrl=http://127.0.0.1:8080/sso-sub-one";
			} else {
				//直接登录sso系统的，登录后跳转的工作台
				return "index";
			}			
		} else {
			return "loginError";
		}
	}
	
	
	@RequestMapping(value = "/checkToken", method =RequestMethod.POST)
	@ResponseBody
	public Object checkToken(CheckBean loginBean) throws Exception {
		TokenDO token = tokenMapper.getByTokenStr(loginBean.getToken());
		JsonResult resp = new JsonResult();
		if (token != null && token.getExpireTime().after(new Date())) {
			resp.setCode(0);
			resp.setMsg("success");
			resp.setData("");
			return resp;
		} else {
			resp.setCode(999999);
			resp.setMsg("error");
			resp.setData("");
			return resp;
		}
	}
	
	
	/**
	 * @param name
	 */
	private void setCookieAndSession(HttpServletResponse response, TokenDO token, String name) {
		UserDO user = new UserDO();
		user.setName(name);
		String sessionID = UUID.randomUUID().toString();
		Cookie cookie = new Cookie("sessionID", sessionID);  
        cookie.setMaxAge(24 * 60 * 60);// 设置为24h 
        cookie.setPath("/");  
        response.addCookie(cookie);  
        LocalCache.put(sessionID, token, user);
	}
	

}
