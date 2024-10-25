package com.example.hotcachecenter.domain.model;

import java.io.Serializable;

/**
 * 缓存条目领域模型
 */
public class CacheEntry implements Serializable {
    private String key;
    private Object value;

    public CacheEntry(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    // Getters and setters
    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
