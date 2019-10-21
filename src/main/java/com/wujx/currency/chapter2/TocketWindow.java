package com.wujx.currency.chapter2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 9:34
 */
public class TocketWindow extends Thread {
    private String name;

    private static final int MAX =50;

    private static int index=1;

    public TocketWindow() {
    }

    public TocketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(index<=MAX){
            System.out.println("柜台"+name+"当前的号码是: "+index++);
        }
    }
}
