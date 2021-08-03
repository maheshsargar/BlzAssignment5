package com.assignment.dayfive;

import java.util.Scanner;

public class LeapYear {
	static int year;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		year = sc.nextInt();

		@SuppressWarnings("unused")
		LeapYear ly = new LeapYear();
		yearCheck();

	}

	public static void yearCheck() {
		if (year < 9999) {
			if (year > 1000) {
				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							System.out.println("Leap year");
						} else {
							System.out.println("Not a Leap year ");
						}
					} else {
						System.out.println("Leap year ");
					}
				} else {
					System.out.println("Not a Leap year ");
				}
			} else {
				System.out.println("Please enter a four digit year");
			}
		} else {
			System.out.println("Please enter a four digit year");

		}
	}
}