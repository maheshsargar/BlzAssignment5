package com.blz.assignment.dayfive;

import java.util.Scanner;

public class QuotientReminder {
    public static long uInput, Divisor;

    public static void main(String[] args) {

        System.out.print("Enter a Number : ");
        Scanner userInput = new Scanner(System.in);
        uInput = userInput.nextLong();
        System.out.print("Enter a Divisor : ");
        Divisor = userInput.nextLong();
        QuotientReminder qr = new QuotientReminder();
        System.out.println("Quotient is : " + qr.Quotient());
        System.out.println("Remainder is : " + qr.Remainder());
    }

    public long Quotient() {
        long division = uInput / Divisor;
        return division;

    }

    public long Remainder() {
        long Remainder = uInput % Divisor;
        return Remainder;

    }
}

