package com.example.hotcachecenter.domain.repository;

public interface CacheRepository {
    void set(String key, String value);
    String get(String key);
    void delete(String key);
    // ... 其他缓存操作方法 ...
}
