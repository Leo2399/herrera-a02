/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution21 {
private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the number of the month: ");
        int number = input.nextInt();

        String month;

        switch (number) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> month = "not valid";
        }

        System.out.println("The name of the month is " +month);
    }
}
