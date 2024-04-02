package com.cache.redis.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class RedisCacheService {

    private final RedisTemplate<Object, Object> redisTemplate;


    public RedisCacheService(RedisTemplate<Object, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public <T> T get(Object hashKey, Object key) {
        return (T) redisTemplate.opsForHash().get(hashKey, key);
    }

    public void put(Object hashKey, Object key, Object value) {
        redisTemplate.opsForHash().put(hashKey, key, value);
    }

    public Long delete(Object hashKey, Object key) {
        return redisTemplate.opsForHash().delete(hashKey, key);
    }
}
