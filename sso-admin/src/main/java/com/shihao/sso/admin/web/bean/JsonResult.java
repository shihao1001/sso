/**
 * 
 */
package com.shihao.sso.admin.web.bean;

import java.io.Serializable;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午11:26:02
 */
public class JsonResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2590920209513709793L;
	private Integer code;
	private String msg;
	private Object data;
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	

}
