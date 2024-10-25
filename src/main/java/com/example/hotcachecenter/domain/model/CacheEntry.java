package com.example.hotcachecenter.domain.model;

import java.io.Serializable;

/**
 * 缓存条目领域模型
 * 代表缓存系统中的一个键值对
 * 实现Serializable接口以支持序列化
 */
public class CacheEntry implements Serializable {
    
    /**
     * 缓存键
     */
    private String key;
    
    /**
     * 缓存值
     */
    private Object value;

    /**
     * 构造函数
     * @param key 缓存键
     * @param value 缓存值
     */
    public CacheEntry(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 获取缓存键
     * @return 缓存键
     */
    public String getKey() {
        return key;
    }

    /**
     * 获取缓存值
     * @return 缓存值
     */
    public Object getValue() {
        return value;
    }
}
