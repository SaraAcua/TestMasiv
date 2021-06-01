/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Masiv.Roulette.Entitys;

/**
 *
 * @author SARA
 */
public class Player {

    private String identification;
    private String name;
    private String lastNames;
    private int credits;

    public Player() {
    }

    public Player(String identification, String name, String lastNames, int credits) {
        this.identification = identification;
        this.name = name;
        this.lastNames = lastNames;
        this.credits = credits;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
