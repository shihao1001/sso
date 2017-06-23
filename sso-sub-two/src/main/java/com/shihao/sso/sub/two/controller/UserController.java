/**
 * 
 */
package com.shihao.sso.sub.two.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shihao.sso.sub.two.web.bean.JsonResult;
import com.shihao.sso.sub.two.web.bean.UserVO;

/**
 * 
 * @author beidou
 * @date 2017年6月21日 下午2:13:53
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@RequestMapping("/showMe")
	@ResponseBody
	public Object showMe(HttpServletRequest request, HttpServletResponse response,
			@CookieValue(value= "sessionId",defaultValue = "") String sessionId) {
		JsonResult result = new JsonResult();
		UserVO user = new UserVO();
		user.setName("shihao");
		user.setPassword("123");
		result.setCode(0);
		result.setMsg("ok");
		result.setData(user);
		return result;
	}

}
