/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution19 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter weight: ");
        float w = input.nextInt();

        System.out.print("Enter height: ");
        float h = input.nextInt();

        float bmi = (w/(h*h))*703;
        System.out.println("Your bmi is "+Math.round(bmi*100.0)/100.0);

        if(bmi<=18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if(bmi>=25){
            System.out.println("You are overweight. you should see your doctor.");
        }
        else{
            System.out.println("You are within the ideal weight range.");
        }
    }
}
