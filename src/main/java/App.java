/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();

        System.out.print("Enter the rate of interest: ");
        double interest = scanner.nextFloat();
        interest = interest/10.0;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double investment = Math.round(principal * (1 + (interest/100.0 * years)));

        System.out.print("After " + years + " years at " + interest + ", the investment will be worth $" + investment + ".");

        scanner.close();
    }
}