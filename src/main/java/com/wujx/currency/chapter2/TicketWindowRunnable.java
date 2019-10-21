package com.wujx.currency.chapter2;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 9:48
 */
public class TicketWindowRunnable implements Runnable {
    private static final int MAX =50;

    private static int index=1;

    public void run() {
        while(index<=MAX){
            System.out.println(Thread.currentThread()+"的号码是: "+(index++));
        }

    }
}
