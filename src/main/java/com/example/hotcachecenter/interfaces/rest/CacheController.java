package com.example.hotcachecenter.interfaces.rest;

import com.example.hotcachecenter.application.CacheService;
import org.springframework.web.bind.annotation.*;

/**
 * 缓存控制器
 * 提供缓存操作的REST API接口
 */
@RestController
@RequestMapping("/cache")
public class CacheController {

    private final CacheService cacheService;

    /**
     * 构造函数，通过依赖注入获取CacheService实例
     * @param cacheService 缓存服务类
     */
    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    /**
     * 获取缓存值
     * @param key 缓存键
     * @return 缓存值
     */
    @GetMapping("/{key}")
    public Object get(@PathVariable String key) {
        return cacheService.get(key);
    }

    /**
     * 设置缓存
     * @param key 缓存键
     * @param value 缓存值
     */
    @PostMapping("/{key}")
    public void set(@PathVariable String key, @RequestBody Object value) {
        cacheService.set(key, value);
    }

    /**
     * 删除缓存
     * @param key 要删除的缓存键
     */
    @DeleteMapping("/{key}")
    public void delete(@PathVariable String key) {
        cacheService.delete(key);
    }
}
