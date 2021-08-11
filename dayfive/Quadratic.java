package com.blz.assignment.dayfive;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static int a, b, c, x1, x2, delta;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax^2 + bx+ c = 0");
        System.out.println("Enter value for a : ");
        a = sc.nextInt();
        System.out.println("Enter value for b : ");
        b = sc.nextInt();
        System.out.println("Enter value for c : ");
        c = sc.nextInt();

        Quadratic call = new Quadratic();
        System.out.println(call.Operation());
        System.out.println(call.delta());
        System.out.println(call.RootXOne());
        System.out.println(call.RootXTwo());
    }

    public double Operation() {
        double Quadratic = Math.sqrt(a * x1 * x2) + (b * x1) + c;
        return Quadratic;
    }

        public double delta () {
            double delta = (b * b) + (4 * a * c);
            return delta;
        }
        public double RootXOne () {
            double x1 = (-b + sqrt(delta())) / (2 * a);
            return x1;
        }
        public double RootXTwo () {
            double x2 = (-b - sqrt(delta())) / (2 * a);
            return x2;
        }

}