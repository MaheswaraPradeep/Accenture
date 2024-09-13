package com.Accenture;

public class FootballMatch {
    public static void main(String[] args) {
        String s="TeamA TeamB TeamA TeamA TeamB TeamA";
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                c1++;
            }
            if(s.charAt(i)=='B'){
                c2++;
            }
        }
        System.out.println(c1>c2?"TeamA":"TeamB");
    }
}
