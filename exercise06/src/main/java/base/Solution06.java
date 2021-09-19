/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    /*
    Print "What is your current age?"
    'age' = read string from user input

    print "What age would you like to retire?"
    'retire' = read string from user input

    convert 'age' to integer value
    convert 'retire' to integer value

    Subtract 'age' from 'retire' to get how many years left until retirement
    'diff' = 'retire' - 'age'

    get the current year from the system

    Add the years remaining until retirement to the current year to give the retirement year

    print "You have 'diff' years until you can retire."
    print "It's 2021, you can retire in 'retirementYear'."
     */

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("What is your current age? ");
        int x = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int y  = input.nextInt();

        int diff = y - x;

        Calendar cal = Calendar.getInstance();

        int retirementYear = cal.get(Calendar.YEAR) + diff;

        System.out.println("You have "+diff+" years left until you can retire.");
        System.out.println("It's "+cal.get(Calendar.YEAR)+ ", you can retire in "+retirementYear+".");
    }
}
