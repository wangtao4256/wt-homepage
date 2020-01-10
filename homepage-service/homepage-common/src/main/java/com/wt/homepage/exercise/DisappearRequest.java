package com.wt.homepage.exercise;

public class DisappearRequest implements Runnable {

  static DisappearRequest instance = new DisappearRequest();

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(instance);
    Thread t2 = new Thread(instance);
    t1.start();
    t1.join();
    t2.join();
    t2.start();
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
