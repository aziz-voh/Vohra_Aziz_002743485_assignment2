/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Persona;

import edu.northeastern.aziz.Model.City;
import edu.northeastern.aziz.Model.Community;
import edu.northeastern.aziz.Model.House;

/**
 *
 * @author aziz
 */
public class Person {
    
    private String name;
    private short age;
    private String email;
    private String gender;
    private long phoneNo;

    private House house;
    private City city;
    private Community comm;
    
    public Person(){
        
    }

    public Person(String name, short age, String email, String gender, long phoneNo, House house, City city, Community comm) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.house = house;
        this.city = city;
        this.comm = comm;
    }
    


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

    public void setEmail(String address) {
        this.email = address;
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

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
