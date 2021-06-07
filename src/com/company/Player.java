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


    /**
     * Description: This is the constructor for the player class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public Player(String fName, String lName) {

        //assigning vcalues to instancevariables using parameters
        this.strFName = fName;
        this.strLName = lName;
        intScore = 0;

    }



    /**
     * Description: This is the default constructor for the player class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public Player() {
        this.strFName = "Undefined";
        this.strLName = "Undefined";
        intScore = 0;
    }


    /**
     * Description: This is the tostring method for the player class
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public String toString() {
        return(this.strFName + " " + this.strLName + " - score: " + this.intScore);
    }


    //get methods


    /**
     * Description: This is the get method for the score
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public int getScore() {return(this.intScore);}


    /**
     * Description: This is a get method for the last name
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public String getLName() {return(this.strLName);}


    /**
     * Description: This is a get method for the first name
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public String getFName() {return(this.strFName);}

    //set methods


    /**
     * Description: This is a set method for the score
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public void setScore(int score) {this.intScore = score;}


    /**
     * Description: This is a set method for the last name
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public void setLName(String lName) {this.strLName = lName;}


    /**
     * Description: This is a set method for the first name
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */    public void setFName(String fName) {this.strFName = fName;}



    /**
     * Description: This method adds one to the score
     *
     * @author John Khalife
     * @version 2021-06-03
     *
     */
    public void addScore() {
        //adding one to score:
        this.intScore++;
    }

}
