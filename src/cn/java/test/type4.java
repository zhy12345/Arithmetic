package cn.java.test;

import java.util.Scanner;

/**
 * @ClassName type4
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/16
 */
public class type4 {
    static int n, m;
    static double line[] = new double[1000000];

    static boolean OK(double len) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += line[i] / len;
        }
        return sum >= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        double l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            double v = sc.nextDouble();
            line[i] = v;
            r = r > line[i] ? r : line[i];
        }
        while (Math.abs(r - l) > 0.0001) {
            double mid = (r + l) / 2;
            if (OK(mid)) {
                l = mid;
            } else {
                r = mid;
            }

        }
        String fmv = String.format("%.2f", r);
        System.out.println(fmv);
    }
}

