package com.Accenture;

import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String i=obj.next();
        System.out.println(rps(i));
    }

    private static String rps(String i) {
        return switch (i) {
            case "rock" -> "paper";
            case "paper" -> "scissor";
            case "scissor" -> "rock";
            default -> "invalid input";
        };
    }
}
