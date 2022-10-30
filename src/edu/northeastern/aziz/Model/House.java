/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Model;

/**
 *
 * @author aziz
 */
public class House {
    
    private Community community;
    private String houseName;

    public House() {
    }
    
    public House(Community community, String houseName) {
        this.community = community;
        this.houseName = houseName;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @Override
    public String toString() {
        return houseName;
    }
    
    
}
