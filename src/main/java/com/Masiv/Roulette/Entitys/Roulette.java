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
public class Roulette {
    
    private String id;
    private String status;

    public Roulette() {
    }

    public Roulette(String id, String status) {
        this.id = id;
        this.status = status;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the estado
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param estado the estado to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
