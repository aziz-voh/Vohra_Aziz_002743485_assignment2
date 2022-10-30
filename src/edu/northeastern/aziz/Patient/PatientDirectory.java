/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Patient;

import edu.northeastern.aziz.Encounter.Encounter;
import edu.northeastern.aziz.Encounter.EncounterHistory;
import edu.northeastern.aziz.Encounter.VitalSigns;
import edu.northeastern.aziz.Model.City;
import edu.northeastern.aziz.Model.Community;
import edu.northeastern.aziz.Model.House;
import edu.northeastern.aziz.Model.HouseDirectory;
import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    private ArrayList<House> houseList;

    public PatientDirectory(HouseDirectory houseDir) {
        
        this.patientList = new ArrayList<Patient>();
        this.houseList = houseDir.getHouseDirectory();
        //addDummyPatients();
        
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addNewPatient(String name, short age, String email, String gender, long phoneNo, House house, City city, Community comm, int patientId, String uname, String pass) {
        
        
        Patient newPatient = new Patient(name, age, email, gender, phoneNo, house, city, comm, patientId, uname, pass);
        patientList.add(newPatient);
        return newPatient; 
        
    }
    
    public void deletePatient(Patient patient){
        patientList.remove(patient);
    }
    
    public void addDummyPatients(){
        Patient newPatient1 = new Patient("patient1_House1", (short)20, "person@gmail.com", "male", 12344554, houseList.get(0), null, null, 1, "p", "1");
        Patient newPatient2 = new Patient("patient2_House2", (short)21, "person@gmail.com", "female", 2234455,houseList.get(1),null, null,  2, "p2", "123");
        Patient newPatient3 = new Patient("patient3_House3", (short)22, "person@gmail.com", "male", 3234455,houseList.get(2), null, null, 3, "p3", "123");
        Patient newPatient4 = new Patient("patient4_House4", (short)22, "person@gmail.com", "male", 3234455,houseList.get(3),null, null,  3, "p4", "123");
        patientList.add(newPatient1);
        patientList.add(newPatient2);
        patientList.add(newPatient3);
        patientList.add(newPatient4);
        
//        //temp dummy encounter
//        VitalSigns vs = new VitalSigns();
//        vs.setBloodPressure(100);
//        vs.setPulseRate(100);
//        vs.setRespirationRate((short)100);
//        vs.setTemperature((short)100);
//        
//        Encounter en = new Encounter();
//        en.setVitalSign(vs);
//        
//        EncounterHistory eh = new EncounterHistory();
//        eh.getEncounterHist().add(en);
//        
//        newPatient1.setEncounterHist(eh);

    }
}
