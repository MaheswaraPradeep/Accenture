package com.Accenture;

import java.util.Arrays;

public class MaxProductTarget {
    public static void main(String[] args) {
        int[] a={11,1,2,8,10,11,15,7};
        int t=22;
        int[] res=new int[2];
        int max=0;
        Arrays.sort(a);
        reverse1(a);
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]+a[j]==t&&a[i]*a[j]>max&&a[i]>a[j]){
                res[0]=a[i];
                res[1]=a[j];
                max=a[i]*a[j];
                i++;
                j--;

            } else if (a[i]+a[j]<t) {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(res));


    }

    private static void reverse1(int[] a) {
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
