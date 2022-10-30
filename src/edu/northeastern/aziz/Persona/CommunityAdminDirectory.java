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
public class CommunityAdminDirectory {
    
    private ArrayList<CommunityAdmin> commAdminList;

    public CommunityAdminDirectory() {
        
        this.commAdminList = new ArrayList<CommunityAdmin>();
        //addDummyCommAdmins();
         
        
    }

    public ArrayList<CommunityAdmin> getCommAdminList() {
        return commAdminList;
    }

    public void setCommAdminList(ArrayList<CommunityAdmin> commAdminList) {
        this.commAdminList = commAdminList;
    }

    
    public CommunityAdmin addNewCommAdmin() {
        
        CommunityAdmin newCommAdmin = new CommunityAdmin();
        commAdminList.add(newCommAdmin);
        return newCommAdmin; 
        
    }
    
    public void deleteCommAdmin(Person commAdmin){
        commAdminList.remove(commAdmin);
    }
    
    public void addDummyCommAdmins(){
        
        CommunityAdmin newCommAdmin1 = new CommunityAdmin("CommAdmin1", (short)20, "895 Hunt Ave", "male", 12344554, "c", "1", "Huntington");
        CommunityAdmin newCommAdmin2 = new CommunityAdmin("CommAdmin2", (short)22, "896 Hunt Ave", "male", 12344554, "comm2", "123", "Boylston");
        CommunityAdmin newCommAdmin3 = new CommunityAdmin("CommAdmin3", (short)24, "897 Hunt Ave", "male", 12344554, "comm3", "123", "Down Town");
        
        commAdminList.add(newCommAdmin1);
        commAdminList.add(newCommAdmin2);
        commAdminList.add(newCommAdmin3);

    }
    
}
