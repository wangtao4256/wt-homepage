package com.wt.homepage.exercise;

class Resource implements Runnable {
    private String lockA;
    private String lockB;

    public Resource(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }


    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "尝试获取lockB");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "已获取lockB 尝试获取lockA");
            }
        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
byte[] b=new byte[1024*1024*30];
    }
}
