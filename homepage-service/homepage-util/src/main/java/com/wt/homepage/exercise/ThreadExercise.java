package com.wt.homepage.exercise;

import com.google.common.util.concurrent.ExecutionError;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadExercise {
    //初始值为0 实现加一减一 共五轮
    //生产者消费者模式实现
    private int number=0;
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private void increment() throws Exception {
        lock.lock();
        while (number!=0){
condition.await();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"/t"+number);
        condition.signalAll();
        lock.unlock();
    }
    private void decrement() throws Exception {
        lock.lock();
        while (number==0){
            condition.await();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"/t"+number);
        condition.signalAll();
        lock.unlock();
    }

    public static void main(String[] args) {
ThreadExercise exercise=new ThreadExercise();
for(int i=0;i<5;i++){

    new Thread(()->{
    try {
        exercise.increment();
    } catch (Exception e) {
        e.printStackTrace();
    }
    },String.valueOf("aaa")).start();
    new Thread(()->{
    try {
        exercise.decrement();
    } catch (Exception e) {
        e.printStackTrace();
    }
    },String.valueOf("bbb")).start();

}



    }




}
