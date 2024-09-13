package com.Accenture;

public class ProductPair{
    public static void main(String[] args) {
        int[] a={3,6,9,2};
        int count=0;
        int n=a.length;
        int p=(n*(n-1))/2;
        int nc=0;
        for (int j : a) {
            if (j % 3 != 0) {
                nc++;
            }
        }
        int np=(nc*(nc-1))/2;
        System.out.println(p-np);
    }
}
