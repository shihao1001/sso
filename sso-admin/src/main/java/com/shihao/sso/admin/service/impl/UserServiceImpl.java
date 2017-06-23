/**
 * 
 */
package com.shihao.sso.admin.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shihao.sso.admin.dao.bean.TokenDO;
import com.shihao.sso.admin.dao.bean.UserDO;
import com.shihao.sso.admin.mapper.TokenMapper;
import com.shihao.sso.admin.mapper.UserMapper;
import com.shihao.sso.admin.service.UserService;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午7:01:24
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper useMapper;
	@Autowired
	private TokenMapper tokenMapper;
	

	/* (non-Javadoc)
	 * @see com.shihao.sso.admin.service.UserService#getUserByName(java.lang.String)
	 */
	@Override
	public UserDO getUserByName(String name) {
		UserDO user = useMapper.getByName(name);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.shihao.sso.admin.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public TokenDO login(String name, String password) {
		UserDO user = useMapper.getByName(name);
		if (user != null && user.getPassword().equals(password)) {
			Date exprieTiem = DateUtils.addDays(new Date(), 1);
			TokenDO tokenDO = new TokenDO();
			String tokenStr = UUID.randomUUID().toString();
			tokenDO.setUserId(user.getId());
			tokenDO.setToken(tokenStr);
			tokenDO.setExpireTime(exprieTiem);
			tokenDO.setIsActive(Byte.valueOf("1"));
			tokenMapper.save(tokenDO);
			return tokenDO;
		}
		return null;
	}

}
