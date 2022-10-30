/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Encounter;

import edu.northeastern.aziz.Doctor.Doctor;
import edu.northeastern.aziz.Patient.Patient;
import java.util.Date;

/**
 *
 * @author aziz
 */
public class Encounter {
    
    VitalSigns vitalSign;
    Patient encPatient;
    Doctor encDoc;
    boolean fullFilled;
    boolean isSick;
    Date encounterDate; 


    public Encounter() {
    }

    public Encounter(Patient encPatient, Doctor encDoc, boolean fullFilled) {
        this.vitalSign = new VitalSigns();
        this.encPatient = encPatient;
        this.encDoc = encDoc;
        this.fullFilled = fullFilled;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Patient getEncPatient() {
        return encPatient;
    }

    public void setEncPatient(Patient encPatient) {
        this.encPatient = encPatient;
    }

    public Doctor getEncDoc() {
        return encDoc;
    }

    public void setEncDoc(Doctor encDoc) {
        this.encDoc = encDoc;
    }

    public boolean isFullFilled() {
        return fullFilled;
    }

    public void setFullFilled(boolean fullFilled) {
        this.fullFilled = fullFilled;
    }

    public boolean getIsSick() {
        return isSick;
    }

    public void setIsSick(boolean isSick) {
        this.isSick = isSick;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }
    
    @Override
    public String toString() {
        String str = String.valueOf(vitalSign.getTemperature());
        return str;
    }
    public boolean checkHealthStatus() {
        
        isSick = false;
        
        if (vitalSign.getBloodPressure() < 80 || vitalSign.getBloodPressure() > 120 ) {
            isSick = true;
        }
        else if (vitalSign.getTemperature() < 97 || vitalSign.getTemperature() > 100 ) {
            isSick = true;
        }
        else if (vitalSign.getPulseRate() < 60 || vitalSign.getPulseRate() > 100 ) {
            isSick = true;
        }
        else if (vitalSign.getRespirationRate() < 12 || vitalSign.getRespirationRate() > 16 ) {
            isSick = true;
        }
        
        return isSick;
        
    }
    
}
