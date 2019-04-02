package cn.java.test;

/**
 * @ClassName TryCatch
 * @Description ToDo
 * @Author zhy
 * @Date 2019/4/2
 */
public class TryCatch {
    public static void main(String[] args) {
        System.out.println(new TryCatch().test());
    }
    public int test() {
        int x = 1;
        try {
            System.out.println("return。。。。");
            return x;
        } finally {
            x++;
            System.out.println("这是Finally"+x);
        }
    }

}
