package com.Accenture;

public class canopy {
    public static void main(String[] args) {
        int r=5;
        float a= (float) (3.14*r*r);
        int a1=(int) a;
        if(a-a1<=0.5){
            System.out.println(Math.floor(a));
        }
        else{
            System.out.println(Math.ceil(a));
        }
    }
}
