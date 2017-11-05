//package com.jeff.config;
//
//
//import org.ehcache.Cache;
//import org.ehcache.config.CacheConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by liuren on 2017/11/5.
// */
//@Configuration
//@EnableAutoConfiguration
//public class SpringCacheConfiger {
//
//    /**
//     * 创建缓存对象
//     * @return
//     */
//    @Bean
//    public Cache cacheOfComm(){
//        Cache cache = new Cache(
//                new CacheConfiguration("cacheOfComm", 1000)
//                        .memoryStoreEvictionPolicy(MemoryStoreEvictionPolicy.LFU)
//                        .overflowToDisk(true)
//                        .eternal(false)
//                        .timeToLiveSeconds(3600)
//                        .timeToIdleSeconds(3600)
//                        .diskPersistent(false)
//                        .diskExpiryThreadIntervalSeconds(0));
//        return cache;
//    }
//}
