package com.wt.homepage.redis;

/**
 * 实现Redis分布式锁
 *
 * @author tao.wang
 * @date 2020/1/16
 */
public interface DistributedLock {
  /**
   * 获取锁
   *
   * @return 锁标识
   */
  String acquire();

  /**
   * 释放锁
   */
  boolean release(String indentifier);
}
