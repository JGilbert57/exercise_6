//Johnny Gilbert 2/19/2019 Exercise 6
package com.killoran.Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Check.promptDouble("Enter a valid double");
        Check.promptInt("Enter a valid integer");
        Check.promptString("Enter a valid String");
    }
}

class Check{
    public static Double promptDouble(String message) {
        Scanner Input = new Scanner(System.in);
        boolean decision = false;
        double userDouble = 0;
        while (decision == false) {
            System.out.println(message);
            String userInput = Input.nextLine();

            try {
                userDouble = Double.parseDouble(userInput);
                decision = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double");
            }

        }
        return userDouble;
    }
    public static Integer promptInt(String message){
        Scanner Input = new Scanner(System.in);
        int userInt = 0;
        boolean decision = false;
        while(decision == false) {
            System.out.println(message);
            String userInput = Input.nextLine();
            try {
                userInt = Integer.parseInt(userInput);
                decision = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid Integer");
            }
        }
        return userInt;

    }
    public static String promptString(String message){
        Scanner Input = new Scanner(System.in);
        boolean decision = false;
        String userInput = ("");
        while (decision == false) {
            System.out.println(message);
            userInput = Input.nextLine();
            try {
                Double.parseDouble(userInput);
                System.out.println("Your Input is not a String");
            } catch (NumberFormatException e) {
                decision = true;
            }
        }
        return userInput;
    }

}