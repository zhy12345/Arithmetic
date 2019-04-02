package cn.java.queue;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName LockDemo
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/26
 */
public class LockDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            final int  index = i;
            pool.execute(()->{
                System.out.println(index + "开始");
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000*(index+1));
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(index + "结束");
            });
        }
        pool.shutdown();

    }
}
