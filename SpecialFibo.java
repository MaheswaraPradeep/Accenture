package com.Accenture;

public class SpecialFibo {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int n=5;
        for(int i=2;i<=n;i++){
            int c=a*a+b*b;
            a=b;
            b=c;
        }
        System.out.println(b%47);
    }
}
