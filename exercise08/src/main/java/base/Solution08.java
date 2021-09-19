/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution08 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizza = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        int totalSlices = slices * pizza;
        int pieces = totalSlices/people;
        int leftOver = totalSlices - (pieces * people);

        System.out.println(people+ " people with "+pizza+" pizzas ("+totalSlices+" slices)");
        System.out.println("Each person gets "+pieces+" pieces of pizza.");
        System.out.println("There are "+leftOver+" leftover pieces");
    }
}
