/**
 * Description: This is a game class for the guessing game assignment
 *
 * @author John Khalife
 * @version 2021-06-03
 *
 */

//importing packages
package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//definning guessing game class
public class GuessingGame {

    //instance variables

    //static variable that holds the number of games created so there can be a different file for each game
    private static int intGameNum = 0;

    //static boolean that keps track of whether or not the player wants to see the tutorial - will be set to false if the player does not so they are not asked again
    static boolean boolTutorial = true;

    //integer that holds a player's guess, integer that holds computer's number to uess
    private int intGuess, intRand;

    //arraylist that keeps track of all players
    private ArrayList<Player> players = new ArrayList<Player>();

    //methods

    /**
     * Description: default oncstructor for the guessing game class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public GuessingGame() {
        //assigning values to the instance variables
        this.intGuess = 0;
        this.intRand = 0;

        //adding one to the static variable
        intGameNum += 1;

        //asking the user if they would like to take the tutorial (Will only ask once)
        tutorial();

        //getting the number of players from the user
        createPlayers();

        //playing the game
        game();
    }

    /**
     * Description: create players method for the guessing game class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    void createPlayers() {

        //strings to hold first and last names
        String strNameF, strnameL;

        //int to hold the desired number of players
        int intpnum = intPlayernum();

        //creating loop that asks the user for the number of users
        for (int i = 0; i < intpnum; i++) {

            System.out.println("It is now player #" + (i + 1) + "'s turn to respond.");

            //asking the user for their first name
            strNameF = strUserChoice("What is your first name");

            //askin the player for their last name
            strnameL = strUserChoice("What is your last name?");

            //creating a player object
            players.add(new Player(strNameF, strnameL));

        }


    }

    /**
     * Description: method that returns a random number to guess from the guessing game class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    int getIntRand() {
        return (ThreadLocalRandom
                .current()
                .nextInt(1, 10 + 1));
    }


    /**
     * Description: Method that asks the user for a number from 1-10 and returns it from guessing game class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    int intUserChoice() {

        //creating a boolean for the user input loop
        boolean boolWhileLoop = false;

        //creating a string for the user input
        int intResponse = 0;

        //creating a loop for user input
        while (boolWhileLoop == false) {

            //prompting user for name
            System.out.println("Choose a number from 1-10");

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                intResponse = new Scanner(System.in).nextInt();
                boolWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                boolWhileLoop = false;

            }

            if (intResponse > 10 || intResponse < 1) {
                System.out.println("That is outside of the desired range");
                boolWhileLoop = false;
            }

        }

        return (intResponse);

    }

    /**
     * Description: Method that asks the player for a number from 2-10 for the number of players in the game.
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    int intPlayernum() {

        //creating a boolean for the user input loop
        boolean boolWhileLoop = false;

        //creating a string for the user input
        int intResponse = 0;

        //creating a loop for user input
        while (boolWhileLoop == false) {

            //prompting user for name
            System.out.println("How many players would you like in your game?");
            System.out.println("You can have 2-10 players.");


            //try catch for scanner input
            try {

                //getting input from the user (the name)
                intResponse = new Scanner(System.in).nextInt();
                boolWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                boolWhileLoop = false;

            }

            if (intResponse > 10 || intResponse < 2) {
                System.out.println("You can't have that number of players. Choose again.");
                boolWhileLoop = false;
            }

        }

        return (intResponse);


    }

    /**
     * Description: method that takes a question as a parameter, and gives the user a yes or no question
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    boolean booluserChoice(String strQuestion) {

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
            return (true);

        } else {

        }

        return (false);


    }



    /**
     * Description: Method that takes a question and asks the user for a string
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    String strUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean boolWhileLoop = false;

        //creating a string for the user input
        String strResponse = "";

        //creating a loop for user input
        while (!boolWhileLoop) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                strResponse = new Scanner(System.in).nextLine();
                boolWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                boolWhileLoop = false;

            }

            if (strResponse.isBlank()) {
                boolWhileLoop = false;
                System.out.println("this is empty");
            }

        }

        return (strResponse);

    }


    /**
     * Description: method that runs the gussing game itself
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    void game() {

        //integer that counts the number of rounds for each game
        int intRoundCount = 0;

        //integer that holds the user's choice
        int intGetInput;

        //integer that holds computer's number
        //returns a random byte between a minimum and maximum (defined already)
        int intRandNum = getIntRand();


        //boolean that controls the while loop
        boolean boolWhileLoop = false;

        //integer that holds the player who won
        int intWhoWon = 0;

        //starting the while loop
        while (boolWhileLoop == false) {

            //announcing the round number
            System.out.println("Beginning round #" + (intRoundCount + 1) + ".");

            //beggining for loop
            for (int i = 0; i < players.size(); i++) {

                //anouncing player's turn
                System.out.println(players.get(i).getFName() + " " + players.get(i).getLName() + ", it is your turn.");


                //checking if user got their guess right
                if (intUserChoice() == intRandNum) {
                    System.out.println("You got the answer correct");
                    System.out.println("One point for you!");
                    players.get(i).addScore();
                    System.out.println(players.get(i));
                    intWhoWon = i;
                    i = players.size();


                    //if user is at the end of their loop
                } else if (i == (players.size() - 1)) {

                    i = -1;
                }


            }

            if (booluserChoice("Would you like to play another round?")) {
                intRandNum = getIntRand();
            } else {
                boolWhileLoop = true;
            }

            intRoundCount += 1;


        }

        tallyScore(intRoundCount, intWhoWon);


    }


    /**
     * Description: Method that tallies the score
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    void tallyScore(int intRoundCount, int intWhoWon) {


        //printing
        System.out.println("Congratulations, you completed the game in " + intRoundCount + " rounds!");
        System.out.println();
        System.out.println();


        //try catch for creating file
        try {

            //creating file objecty
            File myObj = new File("finalscore_#" + intGameNum + ".txt");

            //chgecking if file has been created
            if (myObj.createNewFile()) {
                System.out.println("Created file " + myObj.getName());
            }

            //if error is caught - trace the source
        } catch (IOException e) {
            System.out.println("An error occured in the creation of this file.");
            e.printStackTrace();
        }

        //trycatch for writing to file
        try {

            //creating filewriter object
            FileWriter myWriter = new FileWriter("finalscore_#" + intGameNum + ".txt");

            //displaying winner
            myWriter.write("Winner: " + players.get(intWhoWon).toString() + "\n\n");

            //displaying all scores
            myWriter.write("All scores:\n");

            //loop to print al scores
            for (int i = 0; i < players.size(); i++) {
                myWriter.write(players.get(i).toString() + "\n");

            }

            //close the writer
            myWriter.close();
            //error catching
        } catch (IOException e) {
            System.out.println("An error occured in writing the file.");
            e.printStackTrace();
        }


    }


    /**
     * Description: method that asks the user if they want to take the tutorial, but only once in the whole program due to earlier feedback
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    void tutorial() {

        if (boolTutorial) {


            if (booluserChoice("Would you like to take the tutorial? (Will only ask once)")) {

                //explaining to the user what the game is
                System.out.println("Welcome to the guessing game!");
                System.out.println("This is a game in which a series of players take turns guessing a number chosen by the computer.");
                System.out.println("Whoever gets the number right wins the game.");
                System.out.println("There can be 2 - 10 players, and the user gets to choose the number of players");
                System.out.println("You are also able to play games.");
                System.out.println();
                System.out.println();
                System.out.println("The computer will ask the user for the number of players");
                System.out.println("Each player must give their name.");
                System.out.println("The computer will then choose a random number within 1-100");
                System.out.println("Each player will then be given a turn to guess until one of them gets it right");
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Alright! moving on...");
                System.out.println();
                System.out.println();
            }

        }




    boolTutorial = false;
    }


}


