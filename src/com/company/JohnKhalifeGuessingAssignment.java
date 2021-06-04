/**
 *
 * Description: This is the main class for the gussing game, allows the user to create multiple instances of the guessing game
 *
 * @author John Khalife
 *
 * @version 2021-06-03
 *
 */

//importing packages
package com.company;


import java.util.Scanner;

//defining main class
public class JohnKhalifeGuessingAssignment {

    //main method
    public static void main(String[] args) {

    }

    //intro
    static void intro() {
        System.out.println("Welcome to the guessing game!");
        System.out.println("This is a game in which a series of players take turns guessing a number chosen by the computer.");
        System.out.println("Whoever gets the number right wins the game.");
        System.out.println("There can be from 2 - 10 players, and the user gets to choose the number of players");
    }

    //input methods (taken from previous assignments)

    //this is a method that takes a int from the user with a question as a parameter, and returns the int
    static int intUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean doWhileLoop = false;

        //creating a string for the user input
        int response = 0;

        //creating a loop for user input
        while (doWhileLoop == false) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                response = new Scanner(System.in).nextInt();
                doWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                doWhileLoop = false;

            }

        }

        return (response);

    }

    //This is a method that takes a string from the user with a question as a parameter, and returns the value
    static String strUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean doWhileLoop = false;

        //creating a string for the user input
        String strResponse = "";

        //creating a loop for user input
        while (!doWhileLoop) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                strResponse = new Scanner(System.in).nextLine();
                doWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                doWhileLoop = false;

            }

        }

        return (strResponse);

    }


    //This is a method that takes a question as a parameter, asks the user to pick between one or two, and will return the value
    static byte userChoice(String strQuestion, String strOptions) {

        //declaring a variable called dowhileloop for a true/false while loop
        boolean doWhileLoop = false;

        //declaring a variable that will return the input
        byte getInput = 0;

        //Prompting the user whatever quiestion was spcified in the parameter
        System.out.println(strQuestion);
        //asking for input


        //creating loop for input
        while (!doWhileLoop) {

            System.out.println(strOptions);

            //making try catch statement
            try {

                //getting input
                getInput = new Scanner(System.in).nextByte();
                doWhileLoop = true;

            } catch (Exception e) {
                //asking user to try again
                doWhileLoop = false;

            }

            //checking if getInput is not equal to one or two
            if (getInput != 2 && getInput != 1) {
                System.out.println("That was incorrect input. Please try again");
                doWhileLoop = false;
            }

        }

        return (getInput);


    }




}
