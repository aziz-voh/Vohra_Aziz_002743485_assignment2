/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Persona;

import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class HospitalAdminDirectory {
    
    private ArrayList<HospitalAdmin> hospAdminList;

    public HospitalAdminDirectory() {
        
        this.hospAdminList = new ArrayList<HospitalAdmin>();
        //addDummyHospAdmins();
    }

    public ArrayList<HospitalAdmin> getHospAdminList() {
        return hospAdminList;
    }

    public void setHospAdminList(ArrayList<HospitalAdmin> hospAdminList) {
        this.hospAdminList = hospAdminList;
    }
    
    
    public HospitalAdmin addNewHospAdmin() {
        
        HospitalAdmin newHospAdmin = new HospitalAdmin();
        hospAdminList.add(newHospAdmin);
        return newHospAdmin; 
        
    }
    
    public void deletHospAdmin(HospitalAdmin hospAdmin){
        hospAdminList.remove(hospAdmin);
    }
    
    public void addDummyHospAdmins(){
        
        HospitalAdmin newHospAdmin1 = new HospitalAdmin("HospAdmin1", (short)20, "895 Hunt Ave", "male", 12344554,  "q", "1");
        HospitalAdmin newHospAdmin2 = new HospitalAdmin("HospAdmin2", (short)22, "896 Hunt Ave", "male", 12344554,  "ha2", "123");
        HospitalAdmin newHospAdmin3 = new HospitalAdmin("HospAdmin3", (short)24, "897 Hunt Ave", "male", 12344554,  "ha3", "123");
        
        hospAdminList.add(newHospAdmin1);
        hospAdminList.add(newHospAdmin2);
        hospAdminList.add(newHospAdmin3);

    }
}
