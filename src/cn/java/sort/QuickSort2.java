package cn.java.sort;

import java.util.Arrays;

/**
 * @ClassName QuickSort2
 * @Description ToDo
 * @Author zhy
 * @Date 2019/4/2
 */
public class QuickSort2 {

    public static void main(String[] args) {
        int a[] = {3,4,2,1,7,0};
        quick_sort(a,0,a.length-1);
        System.out.println(Arrays.toString(Arrays.toString(a).split(",")));
    }

    static int getPartten(int a[], int left, int right) {
        int j = left;
        for (int i = j + 1; i <= right; i++) {
            if (a[i] <= a[j]) {
                int temp;
                temp = a[i];
                a[i] = a[j + 1];
                a[j + 1] = temp;
                j++;
            }
        }
        int temp2;
        temp2 = a[left];
        a[left] = a[j];
        a[j] = temp2;
        return j;
    }

    static void quick_sort(int a[], int left, int right) {
        if (left >= right) {
            return;
        }
        int p = getPartten(a, left, right);
        quick_sort(a, left, p - 1);
        quick_sort(a, p + 1, right);
    }


}
