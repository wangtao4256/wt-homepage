package com.wt.homepage.exercise;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SynchronizedObjectCodeBlock implements InitializingBean {
  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println(1111);
  }
}
