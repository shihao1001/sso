/**
 * 
 */
package com.shihao.sso.admin.web.bean;

import java.io.Serializable;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午7:12:38
 */
public class LoginBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2210842666267224825L;
	private String name;
	private String password;
	private String appId;
	private String desUrl;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * @return the desUrl
	 */
	public String getDesUrl() {
		return desUrl;
	}

	/**
	 * @param desUrl the desUrl to set
	 */
	public void setDesUrl(String desUrl) {
		this.desUrl = desUrl;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginBean [name=" + name + ", password=" + password
				+ ", desUrl=" + desUrl + "]";
	}
	
	

}
