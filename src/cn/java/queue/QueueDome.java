package cn.java.queue;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName QueueDome
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/8
 */
interface Mathoperation{

    int operation(int a,int b);
}
public class QueueDome {

    TreeSet set = new TreeSet();

    public static void main(String[] args) {
//        QueueDome queueDome = new QueueDome();
//      //带有类型声明的表达式
//        Mathoperation add = (int a,int b)->a + b;
//        System.out.println(add);
//        new Thread(()->System.out.println("是是是"));
//        String str = new String("sd，sada，啥的股份购买，捱三顶五，uu");
//        String[] strArry = str.split("，");
//        Arrays.sort(strArry);

        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(()-> {
            System.out.println("Executors");
        });
        pool.shutdown();
    }


}
