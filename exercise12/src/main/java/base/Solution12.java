/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution12 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter the principal: ");
        int principal = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        float interest = input.nextFloat();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        float rate = interest/100;
        float SimpleInterest = principal*(1 + rate * years);

        System.out.println("After "+years+" years at "+interest+"%, the investment will be worth $"+Math.round(SimpleInterest));

    }
}
