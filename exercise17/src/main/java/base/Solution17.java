/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution17 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double r = 0;

        System.out.print("Enter a 1 if you are a male or a 2 if you are female: ");
        int gender = input.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        int A = input.nextInt();
        System.out.print("What is your weight in pounds? ");
        int W = input.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        int H = input.nextInt();

        if(gender==1){
            r = 0.73;
        }
        else if(gender==2){
            r=0.66;
        }
        double BAC = (A*5.14/W*r) - .015*H;
        System.out.println("Your BAC is "+BAC);

        if(BAC>=0.08){
            System.out.println("It is not legal for you to drive.");
        }
        else{
            System.out.println("It is legal for you to drive.");
        }
    }
}
