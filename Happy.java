package com.Accenture;

public class Happy {
    public static void main(String[] args) {
        int n=17;
        boolean res=isHappy(n);
        System.out.println(res);
    }

    private static boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        while(n!=1&&n!=89){
            int sum=square(n);
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }

    private static int square(int n) {
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;
    }

}
