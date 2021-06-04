/**
 *
 * Description: This is a game class for the guessing game assignment
 *
 * @author John Khalife
 *
 * @version 2021-06-03
 *
 */

//importing packages
package com.company;

import java.util.ArrayList;

//definning guessing game class
public class GuessingGame {

    //instance variables

    //integer that holds a player's guess, integer that holds computer's number to uess
    private int intGuess, intRand;

    //arraylist that keeps track of all players
    private ArrayList<Player> players = new ArrayList<Player>();

    //methods

    //default constructor
    public GuessingGame() {
        //assigning values to the instance variables
        this.intGuess = 0;
        this.intRand = 0;
    }





}
