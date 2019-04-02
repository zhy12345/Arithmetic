package cn.java.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/16
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            String str = sc.next();
            int len = str.length();
            char[] S = str.toCharArray();
            for (int i = 1; i < len; i++) {
                if (S[i] == S[i - 1]) {//前两个相等
                    if (i + 1 < len) {
                        if (S[i + 1] == S[i]) {
                            S[i - 1] = '0';
                        } else {
                            i++;
                            char now = S[i];
                            while (i + 1 < len && S[i + 1] == now) {
                                S[i] = '0';
                                i++;
                            }
                        }
                    }
                }
            }
            for (int i = 0;i<len;i++){
                if(S[i]!='0'){
                    System.out.print(S[i]);
                }
            }
            System.out.println();
        }

    }
}
