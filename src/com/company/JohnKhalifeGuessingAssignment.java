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


    /**
     * Description: This is the main method of the test class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public static void main(String[] args) {

        //variable that will be used for the loop of the whole program
        boolean boolWhileLoop = false;


        //starting the while loop of the whole prgram
        while(boolWhileLoop == false) {

            //the game itself will likely run in the game class, rather than just calling a bunch of smaller functions in main from the game class

            //asking the user if they would like to play the game, if they do then start a new game instance
            if (booluserChoice("Would you like to play the guessing game?")) {
                //playing the game
                GuessingGame game = new GuessingGame();
            } else {
                //ending loop
                System.out.println("Alright! see you later!");
                boolWhileLoop = true;
            }



        }






    }





    /**
     * Description: This is a method that takes a question as a paremeter and asks the user a yes or no question
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    static boolean booluserChoice(String strQuestion) {

        //declaring a variable called dowhileloop for a true/false while loop
        boolean boolWhileLoop = false;

        //declaring a variable that will return the input
        String strGetInput = "";

        //Prompting the user whatever quiestion was spcified in the parameter
        System.out.println(strQuestion);
        //asking for input


        //creating loop for input
        while (!boolWhileLoop) {

            System.out.println("Please enter yes or no");

            //making try catch statement
            try {

                //getting input
                strGetInput = new Scanner(System.in).nextLine();
                boolWhileLoop = true;

            } catch (Exception e) {
                //asking user to try again
                boolWhileLoop = false;

            }

            //checking if getInput is not equal to yes or no
            //System.out.println(strGetInput.toUpperCase());
            if (!strGetInput.toUpperCase().startsWith("YES") && !strGetInput.toUpperCase().startsWith("NO")) {
                System.out.println("That was incorrect input. Please try again");
                boolWhileLoop = false;
            }

        }

        if (strGetInput.toUpperCase().startsWith("YES")) {
            return(true);

        } else {

        }

        return (false);


    }






}
