/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution18 {
    private static Scanner input = new Scanner(System.in);

     private class convertTo{
         static void Celsius(){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int f = input.nextInt();
            int c = (f-32)*5/9;
            System.out.println("The temperature in Celsius: "+c);
        }

         static void Fahrenheit(){
            System.out.print("Please enter the temperature in Celsius is ");
            int c = input.nextInt();
            int f = (c*9/5)+32;
            System.out.println("The temperature in Fahrenheit is "+f);
        }
    }

    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        System.out.print("Your choice: ");
        String choice = input.nextLine();

        if(choice.equals("c")||choice.equals("C")){
            convertTo.Celsius();
        }
        else if(choice.equals("f")||choice.equals("F")){
            convertTo.Fahrenheit();
        }
    }
}
