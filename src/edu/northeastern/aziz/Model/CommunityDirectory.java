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
public class CommunityDirectory {
    
    private ArrayList<Community> commList;
    private ArrayList<City> cityList;
    
    
    public CommunityDirectory(CityDirectory cityList) {
        
        this.commList = new ArrayList<Community>();
        this.cityList = cityList.getCityDirectory();
        addDummyCommunities();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return commList;
    }

    public void setCommunityDirectory(ArrayList<Community> commList) {
        this.commList = commList;
    }
    
    
    public Community addNewCommunity() {
        
        Community newComm = new Community();
        commList.add(newComm);
        return newComm; 
        
    }
    
    public void deleteCommunity(Community c){
        commList.remove(c);
    }
    
    public ArrayList<Community> findCommunitiesInCity(City city){
        
        ArrayList<Community> foundCommunities = new ArrayList<Community>();
        
        for (Community comm : commList) {
            
            if (comm.getCity() == city) {
                foundCommunities.add(comm);
            }
            
        }
        
        return foundCommunities;
        
    }
    
    public Community findCommunityFromName(String commName){
                
        for (Community c : commList) {
            
            if (c.getCommName() == commName) {
                return c;        
            }
        }
        return null;
    }
    
    public void addDummyCommunities(){
        
        
        
        Community c1 = new Community(cityList.get(0), "Boylston");
        Community c2 = new Community(cityList.get(0), "Fenway");
        
        Community c3 = new Community(cityList.get(1), "Silicon Hills");
        Community c4 = new Community(cityList.get(1), "Down town");
                
        commList.add(c1);
        commList.add(c2);
        commList.add(c3);
        commList.add(c4);

    }
    
}
