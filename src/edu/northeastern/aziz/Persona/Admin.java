/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Persona;

/**
 *
 * @author aziz
 */
public class Admin {
    
    private String name;
    private short age;
    private String email;
    private String gender;
    private long phoneNo;
    
    private String username;
    private String password;
    
    public Admin(){
        
    }
    
    public Admin(String name, short age, String address, String gender, long phoneNo, String username, String password) {
        //super(name, age, address, gender, phoneNo);
        this.name = name;
        this.age = age;
        this.email = address;
        this.gender = gender;
        this.phoneNo = phoneNo;
        
        this.username = username;
        this.password = password;
              
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // additional from person

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    
    
    
    
    
}
