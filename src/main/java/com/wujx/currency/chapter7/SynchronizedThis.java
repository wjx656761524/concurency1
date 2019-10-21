package com.wujx.currency.chapter7;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 10:11
 */
public class SynchronizedThis {

    public static void main(String[] args) {

        Thisclock thisclock=new Thisclock();
        new Thread("T1"){

            @Override
            public void run() {
                thisclock.m1();
            }
        }.start();
        new Thread("T2"){

            @Override
            public void run() {
                thisclock.m2();
            }
        }.start();

    }
}
class Thisclock {

    private final Object LOCK=new Object();
   public synchronized void m1(){
       synchronized (LOCK){
       System.out.println(Thread.currentThread().getName());
       try {
           Thread.sleep(10_000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       }

   }
    public   void m2(){
       synchronized (LOCK){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }

    }


}
