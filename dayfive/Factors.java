package com.assignment.dayfive;

import java.util.Scanner;

public class Factors {
	public static final Scanner sc = new Scanner(System.in);
	public static int userInput;
	public static String resultFactors = "";

	public static void main(String[] args) {
		System.out.print("Enter your number to find factors : ");
		userInput = sc.nextInt();
		Factor();
	}

	public static void Factor() {
		int temp = userInput;
		for (int i = 2; i < userInput; i++) {
			while (temp % i == 0) {

				resultFactors = resultFactors + i + ",";
				temp = temp / i;
			}
		}

		if (temp == userInput) {
			System.out.println(userInput + " No factors for prime number");
		} else {
			System.out.println(resultFactors);

		}
	}
}
