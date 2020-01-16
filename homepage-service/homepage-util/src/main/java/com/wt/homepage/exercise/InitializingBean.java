package com.wt.homepage.exercise;

import org.springframework.beans.factory.annotation.Autowired;

public class InitializingBean {
  @Autowired
  SynchronizedObjectCodeBlock codeBlock;

  public static void main(String[] args) {
  }
}
