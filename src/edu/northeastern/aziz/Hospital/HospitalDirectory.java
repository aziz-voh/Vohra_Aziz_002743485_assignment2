/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Hospital;

import edu.northeastern.aziz.Model.City;
import edu.northeastern.aziz.Model.CityDirectory;
import edu.northeastern.aziz.Model.Community;
import edu.northeastern.aziz.Model.CommunityDirectory;
import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    private ArrayList<City> cityList;
    private ArrayList<Community> commList;

    public HospitalDirectory(CityDirectory cityDir, CommunityDirectory commDir) {
        
        this.hospitalList = new ArrayList<Hospital>();
        this.cityList = cityDir.getCityDirectory();
        this.commList = commDir.getCommunityDirectory();
        addDummyhospitals();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalList;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public Hospital addNewHospital() {
        
        Hospital newhospital = new Hospital();
        hospitalList.add(newhospital);
        return newhospital; 
        
    }
    
    public void deleteHospital(Hospital h){
        hospitalList.remove(h);
    }
    
//    public ArrayList<Hospital> findHospitalsInCommunity(Community comm){
//        
//        ArrayList<Hospital> foundHospitals = new ArrayList<Hospital>();
//        
//        for (Hospital h : hospitalList) {
//            
//            if (h.getCommunity() == comm) {
//                foundHospitals.add(h);
//            }
//        }
//        return foundHospitals;
//    }
    
    public ArrayList<Hospital> findHospitalsInCommunity(Community comm){
        
        ArrayList<Hospital> foundHospitals = new ArrayList<Hospital>();
        
        for (Hospital h : hospitalList) {
            
            if (h.getCommunity() == comm) {
                foundHospitals.add(h);
            }
        }
        return foundHospitals;
    }
    
    public ArrayList<Hospital> findhospitalsInCity(City city){
        
        ArrayList<Hospital> foundHospitals = new ArrayList<Hospital>();
        
        for (Hospital h : hospitalList) {
            
            if (h.getCity() == city) {
                foundHospitals.add(h);
            }
        }
        return foundHospitals;
    }
    
    public Hospital findHospitalFromName(String hospName){
                
        for (Hospital h : hospitalList) {
            
            if (h.getHospitalName()== hospName) {
                return h;        
            }
        }
        return null;
    }
   
    public void addDummyhospitals(){
        
        Hospital h1 = new Hospital("Hospital1", cityList.get(0), commList.get(0));
        Hospital h2 = new Hospital("Hospital2", cityList.get(0), commList.get(1));
        Hospital h3 = new Hospital("Hospital3", cityList.get(1), commList.get(2));
        Hospital h4 = new Hospital("Hospital4", cityList.get(1), commList.get(3));
                        
        hospitalList.add(h1);
        hospitalList.add(h2);
        hospitalList.add(h3);
        hospitalList.add(h4);

    }
    
}
