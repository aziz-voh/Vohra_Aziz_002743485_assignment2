/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Doctor;

import edu.northeastern.aziz.Encounter.Encounter;
import edu.northeastern.aziz.Encounter.EncounterHistory;
import edu.northeastern.aziz.Encounter.VitalSigns;
import edu.northeastern.aziz.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class Doctor {
    
    private String name;
    private short age;
    private String email;
    private String gender;
    private long phoneNo;
    
    private int docId;
    private String username;
    private String password;
    
    private Hospital hospital;
    private ArrayList<Encounter> encList;
    
    public Doctor() {
    }

    public Doctor(String name, short age, String email, String gender, long phoneNo, Hospital hospital, int docId, String uname, String pass) {
        
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phoneNo = phoneNo;
        
        this.hospital = hospital;
        this.docId = docId;
        this.username = uname;
        this.password = pass;
        
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    //additional from person

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

    public ArrayList<Encounter> getEncList() {
        return encList;
    }

    public void setEncList(ArrayList<Encounter> encList) {
        this.encList = encList;
    }
    
    public ArrayList<Encounter> getAllEncounters() {
        return encList; 
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public ArrayList<Encounter> getAllPendingEncounters() {
        
        ArrayList<Encounter> pendingEnc = new ArrayList<Encounter>();
        
        for (Encounter e : encList) {
            if (!e.isFullFilled()) {
                pendingEnc.add(e);
            }
        }
        
        return pendingEnc;
    }
    
    public void fillVitalSigns(Encounter enc, short temperature, int pulseRate, short respirationRate, int bloodPressure ) {
        
        VitalSigns vitalSigns = enc.getVitalSign();
        
        vitalSigns.setTemperature(temperature);
        vitalSigns.setPulseRate(pulseRate);
        vitalSigns.setRespirationRate(respirationRate);
        vitalSigns.setBloodPressure(bloodPressure);

    }
    
    
}
