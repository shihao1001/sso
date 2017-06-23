/**
 * 
 */
package com.shihao.sso.admin.controller;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午7:20:27
 */
public class BaseController {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	@ExceptionHandler({ Exception.class })
	@ResponseBody
	public Object exception(Exception e) {
		
		return null;

//		WacaiResult r = new WacaiResult();
//
//		if (e instanceof SException) {
//			SException ee = (SException) e;
//			r.setReturnCode(ee.getErrorCode() + "");
//			r.setMessage(ee.getBizErrorMessage());
//			r.setDetailMessage(ee.getMessage());
//			logger.error(ee.getMessage());
//		} else {
//
//			String eclsName = ClassUtils.getShortClassName(e.getClass());
//
//			r.setReturnCode("00002");
//			r.setMessage("ERROR:" + eclsName);
//			String err = WaUtil.stringifyException(e);
//			if (!StringUtils.isBlank(e.getMessage())) {
//				r.setDetailMessage(e.getMessage());
//			} else {
//				r.setDetailMessage(err);
//			}
//			logger.error(err);
//		}
//		return r;
	}

}
