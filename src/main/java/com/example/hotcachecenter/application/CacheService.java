package com.example.hotcachecenter.application;

import com.example.hotcachecenter.domain.repository.CacheRepository;
import org.springframework.stereotype.Service;

/**
 * 缓存服务类
 * 提供基本的缓存操作，如获取、设置和删除缓存
 */
@Service
public class CacheService {

    private final CacheRepository cacheRepository;

    public CacheService(CacheRepository cacheRepository) {
        this.cacheRepository = cacheRepository;
    }

    /**
     * 从缓存中获取值
     * @param key 缓存的键
     * @return 缓存的值，如果不存在则返回null
     */
    public String get(String key) {
        return cacheRepository.get(key);
    }

    /**
     * 将值存入缓存
     * @param key 缓存的键
     * @param value 要存储的值
     */
    public void set(String key, Object value) {
        cacheRepository.set(key, String.valueOf(value));
    }

    /**
     * 从缓存中删除指定的键
     * @param key 要删除的缓存键
     */
    public void delete(String key) {
        cacheRepository.delete(key);
    }
}
