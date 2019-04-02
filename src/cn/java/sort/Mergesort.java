package cn.java.sort;

/**
 * @ClassName Mergesort
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/27
 */
public class Mergesort {
    static int[] temp = new int[5000];

    public static void main(String[] args) {
//        int[] a = {7, 5, 2, 1, 9, 4, 0};
//        mergesort(a, 0, a.length - 1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(temp[i]);
//        }

    }

    public static void mergesort(int a[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergesort(a, left,mid);
        mergesort(a,mid + 1, right);
        mergearray(a, left, mid, right);

    }

    public static void mergearray(int a[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i < mid && j < right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i < mid) {
            temp[k++] = a[i++];
        }
        while (j < right) {
            temp[k++] = a[j++];
        }
        for (int h = 0; h < k; h++) {
            a[left + h] = temp[h];
        }
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] newNums = new int[m + n + 1];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < m && j < n) {
//            if (nums1[i] <= nums2[j]) {
//                newNums[k++] = nums1[i];
//                i++;
//            }
//            if (nums1[i] >= nums2[j]) {
//                newNums[k++] = nums2[j];
//                j++;
//            }
//        }
//
//        while (i < m) {
//            newNums[k++] = nums1[i];
//            i++;
//        }
//        while (j <= n) {
//            newNums[k++] = nums2[j];
//            j++;
//        }
//        for (int h = 0; h <nums1.length && h < k  ; h++) {
//            nums1[h] = newNums[h];
//        }
//    }

}

