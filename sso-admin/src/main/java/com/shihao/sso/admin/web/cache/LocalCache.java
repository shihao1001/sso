/**
 * 
 */
package com.shihao.sso.admin.web.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

import com.shihao.sso.admin.dao.bean.TokenDO;
import com.shihao.sso.admin.dao.bean.UserDO;

/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午11:45:31
 */
public class LocalCache {
	
	private static final ConcurrentMap<String, Pair<TokenDO, UserDO>> map = new ConcurrentHashMap<String, Pair<TokenDO, UserDO>>();
	
	public static void put(String key, TokenDO token, UserDO user) {
		map.put(key, new MutablePair(token, user));
	}
	
	public static void delete(String key) {
		map.remove(key);
	}
	
	public static Pair<TokenDO, UserDO> get(String key) {
		return map.get(key);
	}

}
