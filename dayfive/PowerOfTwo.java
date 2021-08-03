package com.assignment.dayfive;

import java.util.Scanner;
import java.lang.Math;

public class PowerOfTwo {
	static int power;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Power of 2 : ");
		power = sc.nextInt();

		@SuppressWarnings("unused")
		PowerOfTwo print = new PowerOfTwo();
		Loop();

	}

	public static void Loop() {
		int a = 2;
		
		if (power >= 0) {

			if (power <= 31) {
				for (int i = 1; i <= power; i++) {
					System.out.println("2 to the power " + i + " : " + Math.pow(a, i));
				}
				
				
			} else {
				System.out.println("Enter a number between 0 to 31");

			}
		} else {
			System.out.println("Enter a number between 0 to 31");

		}

	}
}
