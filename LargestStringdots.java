package com.Accenture;

public class LargestStringdots {
    public static void main(String[] args) {
        //code for finding largest string length between the dots
        String s="hello.my.name.is.pradeep";
        int maxi=Integer.MIN_VALUE;
        int i=0;
        int count=0;
        int n=s.length();
        while(i<n){
            if(s.charAt(i)!='.'){
                i++;
                count++;
            }
            else{
                maxi=Math.max(maxi,count);
                count=0;
                i++;
            }


        }
        maxi=count;
        System.out.println(maxi);

    }
}
