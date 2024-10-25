package com.example.hotcachecenter.domain.repository;

import com.example.hotcachecenter.domain.model.CacheEntry;

/**
 * 缓存仓储接口
 * 定义了缓存操作的基本方法
 * 遵循领域驱动设计中的仓储模式
 */
public interface CacheRepository {
    
    /**
     * 获取缓存条目
     * @param key 缓存键
     * @return 缓存条目，如果不存在返回null
     */
    CacheEntry get(String key);

    /**
     * 设置缓存条目
     * @param entry 要存储的缓存条目
     */
    void set(CacheEntry entry);

    /**
     * 删除缓存条目
     * @param key 要删除的缓存键
     */
    void delete(String key);
}
