/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution09 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Length: ");
        int length = input.nextInt();

        System.out.print("Width: ");
        int width = input.nextInt();

        int area = length*width;
        double gallons = (area/350) + 1;

        System.out.println("You will need to purchase "+Math.round(gallons)+" of paint to cover "+area+" square feet.");
    }
}
