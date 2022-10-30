/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Hospital;

import edu.northeastern.aziz.Model.City;
import edu.northeastern.aziz.Model.Community;


/**
 *
 * @author aziz
 */
public class Hospital {
    
    private String hospitalName;
    private City city;
    private Community community;
    
    public Hospital() {
    }

    public Hospital(String hospitalName, City city, Community community) {
        this.hospitalName = hospitalName;
        this.city = city;
        this.community = community;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    @Override
    public String toString() {
        return hospitalName;
    }

}
