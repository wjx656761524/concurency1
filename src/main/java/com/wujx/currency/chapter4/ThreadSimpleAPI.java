package com.wujx.currency.chapter4;

import java.util.Optional;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 13:33
 */
public class ThreadSimpleAPI {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            Optional.of("Hello").ifPresent(System.out::println);
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"t1");
        Optional.of(t.getName()).ifPresent(System.out::println);
        Optional.of(t.getId()).ifPresent(System.out::println);
        Optional.of(t.getPriority()).ifPresent(System.out::println);

    }
}
