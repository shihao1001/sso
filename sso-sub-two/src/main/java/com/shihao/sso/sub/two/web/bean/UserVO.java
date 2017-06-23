/**
 * 
 */
package com.shihao.sso.sub.two.web.bean;

import java.io.Serializable;

/**
 * 
 * @author beidou
 * @date 2017年6月21日 下午2:19:05
 */
public class UserVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4728886803569807135L;
	private String name;
	private String password;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", password=" + password + "]";
	}
	

}
