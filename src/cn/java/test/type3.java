package cn.java.test;

import java.util.Scanner;

/**
 * @ClassName type3
 * @Description ToDo
 * @Author zhy
 * @Date 2019/3/16
 */
public class type3 {
    static int n ;
    int []N = new int[100005];

    int []xia  = new int[100005];

    int []ans  = new int[100005];

    boolean cmp(int a,int b){
        return N[a]<N[b];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int t ;
        t =   sc.nextInt();
        for (int tt = 0;tt<t;++t){
        }
    }
}
/*
#include <bits/stdc++.h>

        using namespace std;

        int n;
        int N[100005], xia[100005], ans[100005];
        bool cmp(int a, int b) {
        return N[a]<N[b];
        }
        int main() {
        int t;
        scanf("%d", &t);
        for(int tt = 0; tt < t; ++tt) {
        memset(ans,0,sizeof(ans));
        scanf("%d", &n);
        for (int i = 0; i < n; ++i) {
        scanf("%d", &N[i]);
        xia[i] = i;
        }
        sort(xia,xia+n,cmp);
        for (int i = 0; i < n; ++i) {
        if (N[(xia[i]+1)%n]>=N[xia[i]] && N[xia[i]]<=N[(xia[i]+n-1)%n]) {//当前最小值左右都很大
        ans[xia[i]] = 1;
        } else if (N[(xia[i]+1)%n]==N[xia[i]] || N[xia[i]]==N[(xia[i]+n-1)%n]){
        if (N[(xia[i]+1)%n]==N[xia[i]])    ans[xia[i]] = ans[(xia[i]+n-1)%n]+1;
        else ans[xia[i]] = ans[(xia[i]+1)%n]+1;
        } else ans[xia[i]] = max(ans[(xia[i]+1)%n], ans[(xia[i]+n-1)%n])+1;
        }
        long long ans1 = 0;
        for (int i = 0; i < n; ++i)    ans1 += ans[i];
        printf("%lld\n", ans1);
        }
        return 0;
        }
*/
