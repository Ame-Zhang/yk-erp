package com.yk.ykerp.cache;

import java.util.Collection;
import java.util.Map;

public interface CacheOperator<T> {

    /**
     * 添加缓存
     * @param key
     * @param value
     */
    void put(String key, T value);

    /**
     * 添加缓存，带过期时间
     * @param key
     * @param value
     * @param TimeOutSeconds
     */
    void put(String key, T value, Long TimeOutSeconds);

    /**
     * 获取缓存
     * @param key
     * @return
     */
    T get(String key);

    /**
     * 获取缓存,是否更新缓存有效期
     * @param key
     * @return
     */
    T get(String key,boolean isUpdateLastAccess);

    /**
     * 移除缓存
     * @param key
     */
    void remove(String... key);

    /**
     * 判断key是否存在于缓存
     * @param key
     * @return
     */
    boolean contains(String key);

    /**
     * 获取缓存中所有key
     * @return
     */
    Collection<String> getAllKeys();

    /**
     * 获取缓存中所有value
     * @return
     */
    Collection<T> getAllValues();

    /**
     * 获取缓存中所有key和value
     * @return
     */
    Map<String, T> getAllKeyValues();
}
