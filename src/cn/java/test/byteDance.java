package cn.java.test;


import java.util.Scanner;


public class byteDance {
    static int mon[] = {64, 16, 4, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        n = 1024 - n;
        for (int i = 0; i < 4; i++) {
            ans += n / mon[i];
            n -= n / mon[i] * mon[i];
        }

        System.out.println(ans);
    }
}

