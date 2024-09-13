package com.Accenture;

import java.util.HashMap;
import java.util.Map;

public class VowelPermutation {
    public static void main(String[] args) {
        String s="abccedd";
        int c=0;
        HashMap<Character,Integer> h=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(!isVowel(s.charAt(i))){
                c++;
                h.put(s.charAt(i), h.getOrDefault(s.charAt(i),0)+1);
            }
        }
        c=factorial(c);
        int r=1;
        for(Map.Entry<Character,Integer> e:h.entrySet()){
            int q=factorial(e.getValue());
            r*=q;
        }
        System.out.println(c/r);
    }

    private static int factorial(int c) {
        int fact=1;
        for(int i=1;i<=c;i++){
            fact*=i;
        }
        return fact;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
