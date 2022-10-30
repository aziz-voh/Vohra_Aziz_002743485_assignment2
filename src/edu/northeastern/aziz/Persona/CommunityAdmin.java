/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Persona;

/**
 *
 * @author aziz
 */
public class CommunityAdmin extends Admin {
    
    private String communityName;
    
    public CommunityAdmin(){
        
    }
    
    public CommunityAdmin(String name, short age, String address, String gender, long phoneNo, String username, String password, String community) {
        super(name, age, address, gender, phoneNo, username, password);
        
        this.communityName = community;
    }
    

}
