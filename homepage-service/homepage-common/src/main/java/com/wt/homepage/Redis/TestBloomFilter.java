package com.wt.homepage.Redis;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class TestBloomFilter {
  private static int total = 1000000;
  private static BloomFilter<Integer> bf = BloomFilter.create(Funnels.integerFunnel(), total);

  public static void main(String[] args) {
    for (int i = 0; i < total; i++) {
      bf.put(i);
    }
    //匹配已在过滤器中的值，看是否有匹配不上的
    for (int i = 0; i < total; i++) {
      if (!bf.mightContain(i)) {
        System.out.println("有数值逃脱消失了~~~");
      }
    }
    int count = 0;
    for (int i = total; i < total + 10000; i++) {
      if (bf.mightContain(i)) {
        count++;
      }
    }
    System.out.println("误伤的数量" + count);
  }
}
