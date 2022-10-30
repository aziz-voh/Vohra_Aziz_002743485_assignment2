/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Model;

import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class CityDirectory {
    
    private ArrayList<City> cityList;

    public CityDirectory() {
        
        this.cityList = new ArrayList<City>();
        addDummyCities();
    }

    public ArrayList<City> getCityDirectory() {
        return cityList;
    }

    public void setCityDirectory(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    
    public City addNewCity() {
        
        City newCity = new City();
        cityList.add(newCity);
        return newCity; 
        
    }
    
    public void deleteCity(City c){
        cityList.remove(c);
    }
    
    public City findCityFromName(String city){
                
        for (City c : cityList) {
            
            if (c.getCityName()== city) {
                return c;        
            }
        }
        return null;
    }
    
    public void addDummyCities(){
        
        City c1 = new City("Boston");
        City c2 = new City("Austin");
                
        cityList.add(c1);
        cityList.add(c2);

    }
    
}
