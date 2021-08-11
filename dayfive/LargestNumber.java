package com.blz.assignment.dayfive;

import java.util.Scanner;

public class LargestNumber {
    public static int uFirst, uSecond, uThird;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Three Numbers");
        System.out.print("Enter first number : ");
        uFirst = sc.nextInt();
        System.out.print("Enter second number : ");
        uSecond = sc.nextInt();
        System.out.print("Enter Third number : ");
        uThird = sc.nextInt();
        LargestNumber LN = new LargestNumber();
        LN.LargeNum();
    }

    public void LargeNum() {

        if(uFirst < uThird && uSecond < uThird ){
            System.out.println("Largest Number is : " + uThird);
        }
        else if (uFirst> uSecond && uFirst>uThird){
            System.out.println("Largest Number is : " +uFirst);

        } else{
            System.out.println("Largest Number is : " +uSecond);
        }

    }
}


