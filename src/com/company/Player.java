/**
 *
 * Description: This is a player class for the guessing game.
 *
 * @author John Khalife
 *
 * @version 2021-06-03
 *
 */


//importing packages
package com.company;

//defining player class
public class Player {

    //declaring instance variables

    //Each player will have a first and last name
    private String strFName, strLName;

    //each player will have a score
    private int intScore;


    //methods

    //constructor
    public Player(String fName, String lName) {

        //assigning vcalues to instancevariables using parameters
        this.strFName = fName;
        this.strLName = lName;
        intScore = 0;

    }


    //default constructor
    public Player() {
        this.strFName = "Undefined";
        this.strLName = "Undefined";
        intScore = 0;
    }

    //tostring method
    public String toString() {
        return(this.strFName + " " + this.strLName + " - score: " + this.intScore);
    }


    //get methods

    //method for getting the score
    public int getScore() {return(this.intScore);}

    //method for getting the last name
    public String getLName() {return(this.strLName);}

    //method that returns the first name
    public String getFName() {return(this.strFName);}

    //set methods

    //setscore method
    public void setScore(int score) {this.intScore = score;}

    //set lastname method
    public void setLName(String lName) {this.strLName = lName;}

    //set first name method
    public void setFName(String fName) {this.strFName = fName;}



}
