/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution07 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        int Area = length * width;
        double Meter = Area * 0.09290304;

        System.out.println("You entered the dimensions of "+length+" feet by "+width+" feet.");
        System.out.println("The area is "+Area+" square feet");
        System.out.println(Meter+ " square meters");
    }
}
