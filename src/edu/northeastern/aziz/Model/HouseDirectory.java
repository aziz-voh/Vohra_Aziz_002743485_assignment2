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
public class HouseDirectory {
    
    private ArrayList<House> houseList;
    private ArrayList<Community> commList;

    public HouseDirectory(CommunityDirectory commDir) {
        
        this.houseList = new ArrayList<House>();
        this.commList = commDir.getCommunityDirectory();
        addDummyHouses();
    }

    public ArrayList<House> getHouseDirectory() {
        return houseList;
    }

    public void setHouseDirectory(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    
    public House addNewHouse() {
        
        House newHouse = new House();
        houseList.add(newHouse);
        return newHouse; 
        
    }
    
    public void deleteHouse(House h){
        houseList.remove(h);
    }
    
    public ArrayList<House> findHousesInCommunity(Community comm){
        
        ArrayList<House> foundHouses = new ArrayList<House>();
        
        for (House h : houseList) {
            
            if (h.getCommunity() == comm) {
                foundHouses.add(h);
            }
        }
        return foundHouses;
    }
    
    public ArrayList<House> findHousesInCity(City city){
        
        ArrayList<House> foundHouses = new ArrayList<House>();
        
        for (House h : houseList) {
            
            if (h.getCommunity().getCity() == city) {
                foundHouses.add(h);
            }
        }
        return foundHouses;
    }
    
    public House findHouseFromName(String houseName){
                
        for (House h : houseList) {
            
            if (h.getHouseName() == houseName) {
                return h;        
            }
        }
        return null;
    }
    
    public void addDummyHouses(){
        
        House h1 = new House(commList.get(0), "House1");
        House h2 = new House(commList.get(0), "House2");
        House h3 = new House(commList.get(1), "House3");
        House h4 = new House(commList.get(1), "House4");
        
        House h5 = new House(commList.get(2), "House5");
        House h6 = new House(commList.get(2), "House6");
        House h7 = new House(commList.get(3), "House7");
        House h8 = new House(commList.get(3), "House8");
                        
        houseList.add(h1);
        houseList.add(h2);
        houseList.add(h3);
        houseList.add(h4);
        houseList.add(h5);
        houseList.add(h6);
        houseList.add(h7);
        houseList.add(h8);


    }
    
}
