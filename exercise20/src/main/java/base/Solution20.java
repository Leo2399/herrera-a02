/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution20 {
    private static Scanner input = new Scanner(System.in);

    public static final String dollars = "The tax is $";

    private static class Wisconsin{
        static double EauClaire(int n){
            double tax = n*(5.5/100);
            System.out.println(dollars+tax);
            return tax;
        }

        static double Dunn(int n){
            double tax = n*(5.4/100);
            System.out.println(dollars+tax);
            return tax;
        }

        static double OtherCounty(int n){
            double tax = n*(5.0/100);
            System.out.println(dollars+tax);
            return tax;
        }
    }

    static double Illinois(int n){
        double tax = n*(8.0/100);
        System.out.println(dollars+tax);
        return tax;
    }

    public static void main(String[] args) {

        double total = 0;

        System.out.print("What is the order amount? ");
        String amount = input.nextLine();
        int order = Integer.parseInt(amount);

        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        if (state.equals("Wisconsin")) {

            System.out.print("What county do you live in? ");
            String county = input.nextLine();

            if(county.equals("Eau Claire")){
                total = order + Wisconsin.EauClaire(order);
            }
            else if(county.equals("Dunn")){
                total = order + Wisconsin.Dunn(order);
            }
            else{
                total = order + Wisconsin.OtherCounty(order);
            }
        }
        else if(state.equals("Illinois")) {
            total = order + Illinois(order);
        }
        else{
            total = order;
        }
        System.out.println("The total is $"+total);
    }
}
