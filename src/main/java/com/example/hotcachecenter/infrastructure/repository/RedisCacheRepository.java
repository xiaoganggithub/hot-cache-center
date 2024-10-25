package com.example.hotcachecenter.infrastructure.repository;

import org.springframework.stereotype.Repository;
import com.example.hotcachecenter.domain.repository.CacheRepository;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Redis缓存仓储实现
 */
@Repository
public class RedisCacheRepository implements CacheRepository {
    private final RedisTemplate<String, Object> redisTemplate;

    public RedisCacheRepository(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override 
    public String get(String key) {
        Object value = redisTemplate.opsForValue().get(key);
        return value != null ? value.toString() : null;
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }
 
    // ... 实现接口方法 ...
}
