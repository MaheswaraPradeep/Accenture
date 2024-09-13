package com.Accenture;

public class MaxFileVersion {
    public static void main(String[] args) {
        //code to find max version of file
        String[] arr={"File_10","File_","File_17"};
        int max=-1;
        for(String s:arr){
            if(s.length()>=6&& s.startsWith("File_")){
                int idx=5;
                int ver=0;
                int val=1;
                while(idx<s.length()){
                    if(s.charAt(idx)>=48&&s.charAt(idx)<=57){
                        ver=ver*10+(s.charAt(idx)-'0');
                        idx++;
                    }
                    else{
                        val=0;
                        break;
                    }
                }
                if(val==1){
                    max=Math.max(max,ver);}
            }}

        System.out.println(max);}
}
