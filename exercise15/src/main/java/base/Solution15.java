/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution15 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("What is the password? ");
        String password = input.nextLine();

        if(password.equals("abc$123")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
