/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution13 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the principal amount? ");
        int p = input.nextInt();

        System.out.print("What is the rate? ");
        float interest = input.nextFloat();
        float r = interest/100;

        System.out.println("What is the number of years? ");
        int t = input.nextInt();

        System.out.print("What is the number of times the interest is compound per year? ");
        int n = input.nextInt();

        double CompoundInterest = p * Math.pow(1+(r/n),n*t);

        System.out.println("$"+p+" invested at "+interest+"% for "+t+" years compounded "+n+" times per year is $"+Math.round(CompoundInterest*100.0)/100.0+".");

    }
}
