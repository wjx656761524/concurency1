package com.wujx.currency.chapter7;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 10:20
 */
public class SynchronizedStatic {
    static{

        synchronized (SynchronizedStatic.class){
            System.out.println("static"+Thread.currentThread().getName());
            try {
                Thread.sleep(10_000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized static void m1(){
        System.out.println("m1"+Thread.currentThread().getName());
        try {
            Thread.sleep(10_000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public synchronized static void m2(){
        System.out.println("m1"+Thread.currentThread().getName());
        try {
            Thread.sleep(10_000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public static void m3(){
        System.out.println("m1"+Thread.currentThread().getName());
        try {
            Thread.sleep(10_000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
