/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution10 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        double subtotal = 0;
        double rate = 0.055;

        for(int i = 1; i<4; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            int price = input.nextInt();

            System.out.print("Enter the quantity of item " + i + ": ");
            int quantity = input.nextInt();

            subtotal = (price * quantity) + subtotal;
        }

        double tax = subtotal * rate;
        double total = tax + subtotal;
        
        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}
