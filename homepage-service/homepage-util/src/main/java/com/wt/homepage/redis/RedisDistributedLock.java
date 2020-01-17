package com.wt.homepage.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.UUID;

/**
 * 分布式锁实现类
 *
 * @author tao.wang
 * @date 2020/1/16
 */
@Slf4j
public class RedisDistributedLock implements DistributedLock {
  private static final String LOCK_SUCCESS = "OK";
  private static final Long RELEASE_SUCCESS = 1L;
  private static final String SET_IF_NOT_EXIST = "NX";
  private static final String SET_WITH_EXPIRE_TIME = "PX";

  /**
   * redis客户端
   */
  private Jedis jedis;

  /**
   * 分布式锁的键值
   */
  private String lockKey;

  /**
   * 锁超时的时间
   */
  int expireTime = 10 * 1000;

  /**
   * 锁等待 防止线程饥饿
   */
  int acquireTimeout = 1 * 1000;

  /**
   * 获取指定键值的锁
   *
   * @author tao.wang
   * @date 2020/1/16
   */
  public RedisDistributedLock(Jedis jedis, String lockKey) {
    this.jedis = jedis;
    this.lockKey = lockKey;
  }

  /**
   * 获取指定键值的锁，同时设置获取锁的超时时间
   *
   * @author tao.wang
   * @date 2020/1/16
   */
  public RedisDistributedLock(Jedis jedis, String lockKey, int acquireTimeout) {
    this.jedis = jedis;
    this.lockKey = lockKey;
    this.acquireTimeout = acquireTimeout;
  }

  /**
   * 获取指定键值的锁，同时设置获取锁超时时间和锁过期时间
   *
   * @author tao.wang
   * @date 2020/1/16
   */
  public RedisDistributedLock(Jedis jedis, String lockKey, int acquireTimeout, int expireTime) {
    this.jedis = jedis;
    this.lockKey = lockKey;
    this.acquireTimeout = acquireTimeout;
    this.expireTime = expireTime;
  }

  @Override
  public String acquire() {
    //获取锁的超时时间，超过这个时间则放弃获取锁
    long end = System.currentTimeMillis() + acquireTimeout;
    //随机生成一个唯一标示的value
    String requireToken = UUID.randomUUID().toString();
    while (System.currentTimeMillis() < end) {
    }
    return null;
  }

  @Override
  public boolean release(String indentifier) {
    return false;
  }
}
