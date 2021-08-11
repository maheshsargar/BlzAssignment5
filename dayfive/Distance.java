package com.blz.assignment.dayfive;

import java.util.Scanner;

public class Distance {


    public static void main(String[] args) {
          int x1,y1,x2,y2;
        double  distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of X : ");
        x1 = sc.nextInt();
        System.out.println("Enter Value of Y : ");
        y1 = sc.nextInt();
        System.out.println("Enter Value of X : ");
        x2 = sc.nextInt();
        System.out.println("Enter Value of Y : ");
        y2 = sc.nextInt();

        distance =Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println(distance);
    }

}
