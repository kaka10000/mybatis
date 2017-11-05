package com.jeff.web.util;

import java.net.URL;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

/**
 * »º´æ¹¤¾ß
 */
public class CacheBLL {

	private static String filename = "ehcache.xml";
	
	private static CacheManager cacheManager = null;
	
	static{
		URL url = CacheBLL.class.getClassLoader().getResource(filename);
		cacheManager = CacheManager.create(url);
	}
	
	public static CacheManager getCacheManager() {
		return cacheManager;
	}

	public static Cache getCache(String name){
		Cache cache = CacheBLL.getCacheManager().getCache(name);
		return cache;
	}

	public static Cache getCache(){
		Cache cache = CacheBLL.getCacheManager().getCache("comm");
		return cache;
	}
}
