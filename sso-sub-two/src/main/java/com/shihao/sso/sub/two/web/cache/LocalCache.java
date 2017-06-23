/**
 * 
 */
package com.shihao.sso.sub.two.web.cache;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;



/**
 * 
 * @author beidou
 * @date 2017年6月20日 下午11:45:31
 */
public class LocalCache {
	
	private static final ConcurrentMap<String, List<String>> map = new ConcurrentHashMap<String, List<String>>();
	
	public static void put(String key, List<String> list) {
		map.put(key, list);
	}
	
	public static void delete(String key) {
		map.remove(key);
	}
	
	public static List<String> get(String key) {
		return map.get(key);
	}

}
