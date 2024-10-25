package com.example.hotcachecenter.infrastructure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.time.Duration;

/**
 * Redis配置属性类
 * 用于映射application.yml中的Redis相关配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {
    /**
     * Redis服务器主机地址
     */
    private String host;
    
    /**
     * Redis服务器端口
     */
    private int port;
    
    /**
     * Redis访问密码
     */
    private String password;
    
    /**
     * Redis数据库索引
     */
    private Integer database;
    
    /**
     * 操作超时时间
     */
    private Duration timeout;
    
    /**
     * 连接池配置
     */
    private Pool pool = new Pool();

    /**
     * 连接池配置内部类
     */
    public static class Pool {
        /**
         * 最大活动连接数
         */
        private int maxActive;
        
        /**
         * 最大空闲连接数
         */
        private int maxIdle;
        
        /**
         * 最小空闲连接数
         */
        private int minIdle;
        
        /**
         * 获取连接最大等待时间
         */
        private Duration maxWait;

        // getters and setters
        public int getMaxActive() {
            return maxActive;
        }

        public void setMaxActive(int maxActive) {
            this.maxActive = maxActive;
        }

        public int getMaxIdle() {
            return maxIdle;
        }

        public void setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
        }

        public int getMinIdle() {
            return minIdle;
        }

        public void setMinIdle(int minIdle) {
            this.minIdle = minIdle;
        }

        public Duration getMaxWait() {
            return maxWait;
        }

        public void setMaxWait(Duration maxWait) {
            this.maxWait = maxWait;
        }
    }

    // getters and setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDatabase() {
        return database;
    }

    public void setDatabase(Integer database) {
        this.database = database;
    }

    public Duration getTimeout() {
        return timeout;
    }

    public void setTimeout(Duration timeout) {
        this.timeout = timeout;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }
}
