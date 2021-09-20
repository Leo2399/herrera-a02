/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution23 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Is your car silent when you turn the key? ");
        String choice = input.nextLine();

        if(choice.equals("y")){
            System.out.println("Are the battery terminals corroded? ");
            String choice2 = input.nextLine();

            if(choice2.equals("y")){
                System.out.println("Clean the terminals and start again.");
            }
            else if(choice2.equals("n")){
                System.out.println("Replace cables and try again.");
            }
        }
        else if(choice.equals("n")){
            System.out.println("Does the car make a slicking noise? ");
            String choice3 = input.nextLine();

            if(choice3.equals("y")){
                System.out.println("Replace the battery.");
            }
            else if(choice3.equals("n")){
                System.out.println("Does the car crank up but fail to start? ");
                String choice4 = input.nextLine();

                if(choice4.equals("y")){
                    System.out.println("Check the spark plug connections.");
                }
                else if(choice4.equals("n")){
                    System.out.println("Does the engine start and then die? ");
                    String choice5 = input.nextLine();

                    if(choice5.equals("y")){
                        System.out.println("Does your car have fuel injection? ");
                        String choice6 = input.nextLine();

                        if(choice6.equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else if(choice6.equals("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(choice5.equals("n")){
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
