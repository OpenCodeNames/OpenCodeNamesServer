package io.codenames.serverdata;

import io.codenames.serverinterfaces.PlayerInterface;

import java.io.Serializable;



public class Player implements PlayerInterface, Serializable {
    private String name;
    private String password;
    private int numGames = 0;
    private int cardsReviled = 0;
    private int correctReviles = 0;
    private int incorrectReviles = 0;

    protected Player(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getNumGames() {
        return numGames;
    }

    /**
     * Check if password matches
     * @param password input password
     * @return If Password is same as input
     */
    public boolean matchPassword(String password){
        return (this.password.equals(password));
    }
    /**
     * set number of games
     * @param numGames Number of Games Played
     */
    protected void setNumGames(int numGames) {
        this.numGames = numGames;
    }


    public void playedGame() {
        this.numGames++;
    }


    public int getCardsReviled() {
        return cardsReviled;
    }


    /**
     * Set number of cards reviled by a player
     * @param cardsReviled Number of cards reviled
     */
    protected void setCardsReviled(int cardsReviled) {
        this.cardsReviled = cardsReviled;
    }


    public int getCorrectReviles() {
        return correctReviles;
    }


    /**
     * Set correct cards reviled
     * @param correctReviles Number of Correct reviles
     */
    protected void setCorrectReviles(int correctReviles) {
        this.correctReviles = correctReviles;
    }


    public int getIncorrectReviles() {
        return incorrectReviles;
    }


    /**
     * Set Incorrect Revels
     * @param incorrectReviles number of incorrect reviles
     */
    protected void setIncorrectReviles(int incorrectReviles) {
        this.incorrectReviles = incorrectReviles;
    }


}
