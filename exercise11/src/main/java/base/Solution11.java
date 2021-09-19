/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;
import java.util.Scanner;

public class Solution11 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("How many euros are you exchanging? ");
        int euro = input.nextInt();

        System.out.println("What is the exchange rate? ");
        double rate = input.nextDouble();

        double dollars = rate * euro;

        System.out.println(euro+" euros at the exchange rate of "+rate+" is\n" +Math.round(dollars*100.0)/100.0+
                " US dollars.");
    }
}
