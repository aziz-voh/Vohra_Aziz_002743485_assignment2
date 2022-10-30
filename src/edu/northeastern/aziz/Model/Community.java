/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Model;

/**
 *
 * @author aziz
 */
public class Community {
    
    private City city;
    private String commName;

    public Community() {
    }
    
    public Community(City city, String commName) {
        this.city = city;
        this.commName = commName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }
    
    @Override
    public String toString() {
        return commName;
    }
    
    
    
}
