package com.Accenture;

public class ArrayIndexOps {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,1};
        int sum=arr[0];
        int xor=arr[1];
        for (int i = 2; i < arr.length; i++) {
            if(i%2==0){
                sum+=arr[i];
            }
            else{
                xor^=arr[i];
            }
        }
        System.out.println(sum+xor);
    }
}
