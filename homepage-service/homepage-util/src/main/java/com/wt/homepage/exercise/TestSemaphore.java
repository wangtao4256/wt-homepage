package com.wt.homepage.exercise;

import javax.swing.plaf.SeparatorUI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class TestSemaphore {
    private static Semaphore semaphore = new Semaphore(4);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("抢占车位开始");
                        semaphore.acquire();
                        System.out.println("抢占车位成功");
                        Thread.sleep(1000);
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
