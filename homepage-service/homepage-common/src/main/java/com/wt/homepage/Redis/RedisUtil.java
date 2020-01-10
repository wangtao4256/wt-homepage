package com.wt.homepage.Redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RedisUtil {
  private RedisUtil() {
  }

  private StringRedisTemplate redisTemplate;

  public void setRedisTemplate(StringRedisTemplate redisTemplate) {
    this.redisTemplate = redisTemplate;
  }

  public StringRedisTemplate getRedisTemplate() {
    return this.redisTemplate;
  }
  /** -------------------key相关操作--------------------- */

  /**
   * 删除key
   */
  public void delete(String key) {
    redisTemplate.delete(key);
  }

  public void delete(Collection<String> keys) {
    redisTemplate.delete(keys);
  }

  /**
   * 序列化key
   *
   * @param key
   * @return
   */
  public byte[] dump(String key) {
    return redisTemplate.dump(key);
  }

  /**
   * 是否存在key exists命令
   */
  public Boolean hasKey(String key) {
    return redisTemplate.hasKey(key);
  }

  /**
   * 设置过期时间
   */
  public Boolean expire(String key, long timeout, TimeUnit unit) {
    return redisTemplate.expire(key, timeout, unit);
  }

  /**
   * 查找匹配的key
   */
  public Set<String> keys(String pattern){
    return redisTemplate.keys(pattern);
  }
}
