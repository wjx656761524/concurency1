package com.wujx.currency.chapter6;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 14:13
 */

public class ThreadInterupt {
    private static final Object MONITOR=new Object();
    public static void main(String[] args) throws InterruptedException {

        Thread t =new Thread(){
            @Override
            public void run() {
                while(true) {
//                    try {
//                        Thread.sleep(10);//wait()   join()
//                    } catch (InterruptedException e) {
//                        System.out.println("收到打断信号");
//                        e.printStackTrace();
//                    }
                    //System.out.println(">>"+this.isInterrupted());
                    synchronized (MONITOR)
                    {
                        try {
                            MONITOR.wait(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        };
        t.start();
        Thread.sleep(100);
        System.out.println(t.isInterrupted());
        t.interrupt();
        System.out.println(t.isInterrupted());


    }



}
