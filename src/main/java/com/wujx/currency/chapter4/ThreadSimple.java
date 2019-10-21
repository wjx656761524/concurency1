package com.wujx.currency.chapter4;

import java.util.Optional;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 13:46
 */
//优先级
public class ThreadSimple {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);

            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
                Thread t2=new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);

            }
        });
                t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3=new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);

            }
        });
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
        t2.start();
        t1.start();

    };

}
