/**
 * 
 */
package com.shihao.sso.sub.two.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shihao.common.utils.HttpUtils;
import com.shihao.common.utils.JsonUtils;
import com.shihao.sso.sub.two.web.bean.JsonResult;
import com.shihao.sso.sub.two.web.cache.LocalCache;

/**
 * 
 * @author beidou
 * @date 2017年6月21日 上午11:43:42
 */
@Controller
@RequestMapping("/callback")
public class CallbackController extends BaseController {
	
	private static final String SSO_TOKEN_CHECK = "http://localhost:8080/sso-admin/user/checkToken";
	
	@RequestMapping("/check")
	public Object callback(HttpServletResponse response,
			@RequestParam(value= "token",defaultValue = "") String token, 
			@RequestParam(value= "desUrl",defaultValue = "") String desUrl
			) {
		LOGGER.info("callback check token, token = {}, desUrl = {}", token, desUrl);
		//1,验证token
		CloseableHttpClient httpClient = HttpUtils.getPoolingClient(10, 10);
		Map<String, String> param= new HashMap<String, String>();
		param.put("token", token);
		try {
			String content = HttpUtils.post(httpClient, SSO_TOKEN_CHECK, param);
			JsonResult result = JsonUtils.toBean(content, JsonResult.class);
			if (result != null && result.getCode() == 0) {
				//2,设置cookie session
				setCookieAndSession(response);
				//3,重定向到目标地址	
				return "redirect:" + desUrl;
				
			}	
		} catch (Exception e) {
			LOGGER.warn("callback check token error", e);
		} 
		return "error";	
	}
	
	private void setCookieAndSession(HttpServletResponse response) {		
		String sessionID = UUID.randomUUID().toString();
		Cookie cookie = new Cookie("sessionId", sessionID);  
        cookie.setMaxAge(24 * 60 * 60);// 设置为24h 
        cookie.setPath("/");  
        response.addCookie(cookie);  
        LocalCache.put(sessionID, new ArrayList<String>());
	}

}
