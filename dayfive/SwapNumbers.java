package com.blz.assignment.dayfive;

import java.util.Scanner;

public class SwapNumbers {
    public static long fInput, sInput;

    public static void main(String[] args) {
        System.out.println("Enter numbers that you want to Swap");
        System.out.print("\n Enter first number : ");
        Scanner firstInput = new Scanner(System.in);
        fInput = firstInput.nextLong();
        System.out.print("Enter Second number : ");
        Scanner secondInput = new Scanner(System.in);
        sInput = secondInput.nextLong();
        SwapNumbers sw = new SwapNumbers();
        System.out.println("First Number : " + sw.swapNo()+ " " +sw.swapNoS());
       // System.out.println("Second Number : " + sw.swapNoS());
    }

    public long swapNo(){
        long swap = sInput ;
        return swap;
    }

    public long swapNoS(){
        long swap = fInput;
        return swap;
    }
}
