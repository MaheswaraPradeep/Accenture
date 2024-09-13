package com.Accenture;

public class LongestConsecutiveTempDrop {
    public static void main(String[] args) {
        int[] arr={2,3,2,1,0};
        int c=0;
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                c++;
            }
            else{
                max=Math.max(c,max);
                c=0;
            }
        }
        max=Math.max(c,max);
        System.out.println(max);
    }
}
