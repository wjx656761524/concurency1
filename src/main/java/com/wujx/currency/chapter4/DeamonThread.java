package com.wujx.currency.chapter4;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 12:14
 */
public class DeamonThread {
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+"running");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.setDaemon(true);//设置为守护线程
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
