package com.wujx.currency.chapter7;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 9:48
 */
public class TicketWindowRunnable2 implements Runnable {
    private static final int MAX =500;

    private static int index=1;

    private final Object MONITOR =new Object();
//同步代码块
    public void run() {
        while(true){
            synchronized (MONITOR){
            if (index>MAX){
                break;
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"的号码是: "+(index++));
        }
    }

    }
}
