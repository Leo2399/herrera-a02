/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution14 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the order amount? ");
        String a = input.nextLine();
        double amount = Double.parseDouble(a);

        System.out.print("What is the state? ");
        String state = input.nextLine();

        if(state.equals("WI")){
            double rate = 0.055;
            double tax = amount * rate;
            amount += tax;
            System.out.println("The subtotal is $"+amount);
            System.out.println("The tax is $"+tax);
        }

        System.out.println("The total is $"+amount);
    }
}
