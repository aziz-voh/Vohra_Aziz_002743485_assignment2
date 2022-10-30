/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Patient;

import edu.northeastern.aziz.Doctor.Doctor;
import edu.northeastern.aziz.Encounter.Encounter;
import edu.northeastern.aziz.Encounter.EncounterHistory;
import edu.northeastern.aziz.Encounter.VitalSigns;
import edu.northeastern.aziz.Model.City;
import edu.northeastern.aziz.Model.Community;
import edu.northeastern.aziz.Model.House;
import edu.northeastern.aziz.Persona.Person;
import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class Patient extends Person {

    private int patientId;
    private String username;
    private String password;
    
    private EncounterHistory encounterHist;

    public Patient() {
    }

    public Patient(String name, short age, String email, String gender, long phoneNo, House house, City city, Community comm, int patientId, String uname, String pass) {
        super(name, age, email, gender, phoneNo, house, city, comm);
        
        this.patientId = patientId;
        this.username = uname;
        this.password = pass;
        this.encounterHist = new EncounterHistory();
        
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public EncounterHistory getEncounterHist() {
        return encounterHist;
    }

    public void setEncounterHist(EncounterHistory encounterHist) {
        this.encounterHist = encounterHist;
    }
        
    
    // CHECK RETURN
    public void createAppointment(Doctor doc) {
        
        Encounter enc = new Encounter();
        enc.setEncPatient(this);
        enc.setEncDoc(doc);
        enc.setFullFilled(false);
        encounterHist.getEncounterHist().add(enc);
        doc.getEncList().add(enc);
        
    }
    
    // CHECK RETURN
    public Encounter viewLatestEncounterDetails() {
        
        ArrayList<Encounter> encList = encounterHist.getEncounterHist();
        Encounter enc = encList.get(encList.size() - 1);
                
        return enc;
    }
    
    // CHECK RETURN
    public ArrayList<Encounter> viewAllEncounterDetails(){
        
        return encounterHist.getEncounterHist();
        
    }
    
}
