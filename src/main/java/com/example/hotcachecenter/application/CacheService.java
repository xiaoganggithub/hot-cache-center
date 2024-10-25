package com.example.hotcachecenter.application;

import com.example.hotcachecenter.domain.model.CacheEntry;
import com.example.hotcachecenter.domain.repository.CacheRepository;
import org.springframework.stereotype.Service;

/**
 * 缓存服务类
 * 应用层服务，处理缓存的业务逻辑
 * 实现了缓存的基本操作：获取、设置和删除
 */
@Service
public class CacheService {

    private final CacheRepository cacheRepository;

    /**
     * 构造函数，通过依赖注入获取CacheRepository实例
     * @param cacheRepository 缓存仓储接口的实现类
     */
    public CacheService(CacheRepository cacheRepository) {
        this.cacheRepository = cacheRepository;
    }

    /**
     * 获取缓存值
     * @param key 缓存键
     * @return 缓存值，如果不存在则返回null
     */
    public Object get(String key) {
        CacheEntry entry = cacheRepository.get(key);
        return entry != null ? entry.getValue() : null;
    }

    /**
     * 设置缓存
     * @param key 缓存键
     * @param value 缓存值
     */
    public void set(String key, Object value) {
        cacheRepository.set(new CacheEntry(key, value));
    }

    /**
     * 删除缓存
     * @param key 要删除的缓存键
     */
    public void delete(String key) {
        cacheRepository.delete(key);
    }
}
