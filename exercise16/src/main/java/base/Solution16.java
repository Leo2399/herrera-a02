/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution16 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("What is your age? ");
        int age = input.nextInt();

        if(age >= 16){
            System.out.println("You are old enough to legally drive.");
        }
        else{
            System.out.println("You are not old enough to legally drive.");
        }
        
    }
}
