package com.wt.homepage.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DisappearRequest implements Runnable {

  static DisappearRequest instance = new DisappearRequest();

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(instance);
    Thread t2 = new Thread(instance);
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    executorService.execute(t1);
    executorService.execute(t2);
    System.out.println(i);
  }

  static int i = 0;

  @Override
  public void run() {
    for (int j = 0; j < 100000; j++) {
      i++;
    }
  }
}
