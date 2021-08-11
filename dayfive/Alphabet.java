package com.blz.assignment.dayfive;

import java.util.Scanner;

public class Alphabet {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your alphabet : ");
        char userInput = scanner.next().charAt(0);
        char check = Character.toLowerCase(userInput);
        if (check=='a'||check=='e'||check=='i'||check=='o'||check=='u'){
            System.out.println(userInput + " is Vowel");
        }
        else {
            System.out.println(userInput + " is Consonant");
        }
    }
}
