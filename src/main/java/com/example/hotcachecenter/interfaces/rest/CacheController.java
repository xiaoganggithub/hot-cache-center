package com.example.hotcachecenter.interfaces.rest;

import com.example.hotcachecenter.application.CacheService;
import org.springframework.web.bind.annotation.*;

/**
 * 缓存控制器
 * 提供缓存操作的REST API
 */
@RestController
@RequestMapping("/cache")
public class CacheController {

    private final CacheService cacheService;

    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("/{key}")
    public Object get(@PathVariable String key) {
        return cacheService.get(key);
    }

    @PostMapping("/{key}")
    public void set(@PathVariable String key, @RequestBody Object value) {
        cacheService.set(key, value);
    }

    @DeleteMapping("/{key}")
    public void delete(@PathVariable String key) {
        cacheService.delete(key);
    }
}