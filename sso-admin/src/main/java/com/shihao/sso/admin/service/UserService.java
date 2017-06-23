/**
 * 
 */
package com.shihao.sso.admin.service;

import com.shihao.sso.admin.dao.bean.TokenDO;
import com.shihao.sso.admin.dao.bean.UserDO;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午7:00:08
 */
public interface UserService {
	
	UserDO getUserByName(String name);
	
	TokenDO login(String name, String password);

}
