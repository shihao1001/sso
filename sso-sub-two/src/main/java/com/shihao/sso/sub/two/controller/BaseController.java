/**
 * 
 */
package com.shihao.sso.sub.two.controller;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shihao.sso.sub.two.web.bean.JsonResult;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午7:20:27
 */
public class BaseController {

	protected Logger LOGGER = LoggerFactory.getLogger(getClass());

	@ExceptionHandler({ Exception.class })
	@ResponseBody
	public Object exception(Exception e) {
		
		JsonResult result = new JsonResult();
		result.setCode(123);
		result.setMsg(e.getMessage());
		
		return result;
	}

}
