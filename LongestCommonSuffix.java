package com.Accenture;



public class LongestCommonSuffix {
    public static void main(String[] args) {
        //code for longest common suffix
        String s="thunder";
        String[] arr={"genders","blenders","blunder","under"};
        int msl=0;
        String ans="";
        for(String s1:arr){
            int csl=lcsl(s,s1);
            if(csl>msl||(csl==msl&&s1.length()<ans.length())){
                msl=csl;
                ans=s1;
            }
        }
        System.out.println(ans);
    }
    static int lcsl(String s,String s1){
        int i=s.length()-1;
        int j=s1.length()-1;
        int c=0;
        while(i>=0&&j>=0){
            if(s.charAt(i)==s1.charAt(j)){
                c++;
            }
            else{
                return c;
            }
            i--;
            j--;
        }
        return c;
    }
}
