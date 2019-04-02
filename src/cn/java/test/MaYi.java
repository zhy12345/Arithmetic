package cn.java.test;

/**
 * @ClassName MaYi
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/11
 */
public class MaYi {
    public static void main(String[] args) {
        int gan_len = 27;
        int position[] = {3, 7, 11, 17, 23};

        int max = 0;
        int min = 0;

        int Lmin = 0;
        int Lmax = 0;

        int Rmin = 0;
        int Rmax = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] < gan_len / 2) {
                Lmax = (gan_len - position[i]) / 1;
                Lmin = position[i] / 1;
            } else {
                Rmax = position[i] / 1;
                Rmin = (gan_len - position[i]) / 1;
            }
            max = (Lmax > Rmax) ? Lmax : Rmax;
            min = (Lmin < Rmin) ? Rmin : Lmin;
        }
        System.out.println("最大时间" + max);
        System.out.println("最小时间" + min);

    }
}
