package com.wujx.currency.chapter6;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 8:50
 */
public class ThreadCloseGraceful2 {

    private static class Worker extends Thread{
        @Override
        public void run() {
            while (true) {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    break;
//                }
                //第二种方式
                if(Thread.interrupted()){
                    break;
                }


            }
        }
        public static void main(String[] args)  {
            ThreadCloseGraceful2.Worker worker=new ThreadCloseGraceful2.Worker();
            worker.start();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            worker.interrupt();
        }

    }


}
