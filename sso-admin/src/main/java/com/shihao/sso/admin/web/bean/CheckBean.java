/**
 * 
 */
package com.shihao.sso.admin.web.bean;

import java.io.Serializable;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午11:16:16
 */
public class CheckBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 504786069094371732L;
	private String token;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	

}
