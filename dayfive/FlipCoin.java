package com.assignment.dayfive;

import java.util.Random;

import java.util.Scanner;

public class FlipCoin {
	
	static int userInput, countHead, countTail;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Give your input : ");
		userInput = sc.nextInt();
		for (int i = 0; i < userInput; i++) {

			FlipCoin value = new FlipCoin();
			value.random();

		}
		System.out.println("Percentage of Heads : " + (float) countHead / (float) userInput * 100);
		System.out.println("Percentage of Tails : " + (float) countTail / (float) userInput * 100);

	}

	public void random() {
		Random rand = new Random();

		float float_random = rand.nextFloat();
		// System.out.print(float_random);

		if (float_random < 0.5) {
			// System.out.println("Head ");
			countHead = countHead + 1;

		}

		else {
			// System.out.println("Tails ");
			countTail = countTail + 1;

		}

	}
}
