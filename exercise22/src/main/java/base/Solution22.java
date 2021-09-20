/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution22 {
    private static final Scanner input = new Scanner(System.in);

    static int compareNum(int x, int y, int z){

        int max = 0;

        if(x>y && x>z){
            max = x;
            System.out.println("The largest number is "+max);
        }
        else if(y>x && y>z){
            max = y;
            System.out.println("The largest number is "+max);
        }
        else if(z>x && z>y){
            max = z;
            System.out.println("The largest number is "+max);
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        compareNum(first,second,third);

    }
}
