package com.wujx.currency.chapter6;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 8:58
 */
public class ThreadCloseforce {
    public static void main(String[] args) {
        ThreadService service= new ThreadService();
        long start=System.currentTimeMillis();
        service.execute(()->{
            //load a very heavy resource
//           while(true){
//
//           }
            //如果执行任务结束,自动完成
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        service.shutdown(10000);
        long end=System.currentTimeMillis();
        System.out.println(end -start);

    }
}
