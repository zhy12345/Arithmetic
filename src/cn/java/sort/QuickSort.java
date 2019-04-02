package cn.java.sort;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/28
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {3,4,2,1,7,0};
        quick_sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    private static void quick_sort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = getPartten(a, left, right);
        System.out.println("***********"+p);
        System.out.println(Arrays.toString(a));
        System.out.println("***********"+p);
        quick_sort(a, left, p - 1);
        quick_sort(a, p + 1, right);

    }

    private static int getPartten(int a[], int left, int right) {
        int j = left;
        int v = a[j];
        for (int i = left + 1; i <= right; i++) {
            if (a[i] < v) {
                int temp;
                temp = a[i];
                a[i] = a[j + 1];
                a[j + 1] = temp;
                j++;
            }
        }


        int temp2;
        temp2 = a[j];
        a[j] = a[left];
        a[left] = temp2;
        return j;
    }


}
