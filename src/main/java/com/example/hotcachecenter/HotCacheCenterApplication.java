package com.example.hotcachecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 热缓存中心应用程序的主类
 * 这个类是Spring Boot应用程序的入口点
 */
@SpringBootApplication // 标记这个类为Spring Boot应用程序
public class HotCacheCenterApplication {

    /**
     * 应用程序的主方法
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        SpringApplication.run(HotCacheCenterApplication.class, args);
    }
}
