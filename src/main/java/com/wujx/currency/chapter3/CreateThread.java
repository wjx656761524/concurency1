package com.wujx.currency.chapter3;

import java.util.Arrays;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 10:27
 */
public class CreateThread {

    public static void main(String[] args) {
        Thread t =new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
       // t.getThreadGroup();
//        System.out.println(t.getThreadGroup());
//        System.out.println(Thread.currentThread().getThreadGroup().getName());
//        System.out.println(Thread.currentThread().getName());
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
//        System.out.println(threadGroup.activeCount());
       Thread[] threads= new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        Arrays.asList(threads).forEach(System.out::println);


    }
}
