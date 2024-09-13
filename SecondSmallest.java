package com.Accenture;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr={5,4,0,0,3};
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int x:arr){
            if(x<min1){
                min2=min1;
                min1=x;
            }
            else if (x<min2&&x!=min1){
                min2=x;
            }
            else{
                continue;
            }
        }
        System.out.println(min2);
    }
}
