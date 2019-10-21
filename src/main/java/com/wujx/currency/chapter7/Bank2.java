package com.wujx.currency.chapter7;

import com.wujx.currency.chapter2.TicketWindowRunnable;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 9:50
 */
public class Bank2 {
    public static void main(String[] args) {
        final TicketWindowRunnable2 ticketwindow=new TicketWindowRunnable2();
        Thread windowThread1=new Thread(ticketwindow,"一号窗口");
        Thread windowThread2=new Thread(ticketwindow,"二号窗口");
        Thread windowThread3=new Thread(ticketwindow,"三号窗口");
        windowThread1.start();
        windowThread2.start();
        windowThread3.start();


    }
}
