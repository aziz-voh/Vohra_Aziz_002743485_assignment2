/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Doctor;

import edu.northeastern.aziz.Hospital.Hospital;
import edu.northeastern.aziz.Hospital.HospitalDirectory;
import edu.northeastern.aziz.Model.City;
import edu.northeastern.aziz.Model.Community;
import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> docList;
    private ArrayList<Hospital> hospitalList;
    
    public DoctorDirectory(HospitalDirectory hospDir) {
        
        this.docList = new ArrayList<Doctor>();
        this.hospitalList = hospDir.getHospitalDirectory();
        //addDummyDoctors();

    }

    public ArrayList<Doctor> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doctor> docList) {
        this.docList = docList;
    }
    
    public Doctor addNewDoc(String name, short age, String email, String gender, long phoneNo, Hospital hosp, int doctId, String uname, String pass) {
        
        Doctor newDoc = new Doctor(name, age, email, gender, phoneNo, hosp, doctId, uname, pass);
        docList.add(newDoc);
        return newDoc; 
        
    }
    
    public void deleteDoctor(Doctor doc){
        docList.remove(doc);
    }
    
    public ArrayList<Doctor> findDoctorsInHospital(Hospital hosp){
        
        ArrayList<Doctor> foundDocs = new ArrayList<Doctor>();
        
        for (Doctor doc : docList) {
            
            if (doc.getHospital() == hosp) {
                foundDocs.add(doc);
            }
        }
        return foundDocs;
    }
    
    
    public ArrayList<Doctor> findDoctorsInCommunity(Community comm){
        
        ArrayList<Doctor> foundDocs = new ArrayList<Doctor>();
        
        for (Doctor doc : docList) {
            
            if (doc.getHospital().getCommunity() == comm) {
                foundDocs.add(doc);
            }
        }
        return foundDocs;
    }
    
    public ArrayList<Doctor> findDoctorsInCity(City city){
        
        ArrayList<Doctor> foundDocs = new ArrayList<Doctor>();
        
        for (Doctor doc : docList) {
            
            if (doc.getHospital().getCity() == city) {
                foundDocs.add(doc);
            }
        }
        return foundDocs;
    }
    
    
    
    public void addDummyDoctors(){
    Doctor newDoc1 = new Doctor("Doc1_Hos1_Ct1", (short)20, "895 Hunt Ave", "male", 12344554, hospitalList.get(0), 1, "q", "1");
    Doctor newDoc2 = new Doctor("Doc2_Hos2_Ct1", (short)21, "896 Hunt Ave", "female", 2234455,hospitalList.get(1),  2, "d2", "123");
    Doctor newDoc3 = new Doctor("Doc3_Hos3_Ct2", (short)22, "897 Hunt Ave", "male", 3234455,hospitalList.get(2),  3, "d3", "123");
    Doctor newDoc4 = new Doctor("Doc4_Hos4_Ct2", (short)22, "897 Hunt Ave", "male", 3234455,hospitalList.get(3),  3, "d4", "123");

    docList.add(newDoc1);
    docList.add(newDoc2);
    docList.add(newDoc3);
    docList.add(newDoc4);

}
}
