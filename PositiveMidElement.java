package com.Accenture;

public class PositiveMidElement {
    public static void main(String[] args) {
        //positve mid element
        int[] arr={-12,-3,14,15,-56,77,13};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                count++;
            }
        }
        int mid=(int) Math.floor((count-1)/2);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(mid==0){
                    System.out.println(arr[i]);
                }
                mid--;
}
}
    }
}
