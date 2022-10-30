/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Encounter;

import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHist; 

    public EncounterHistory() {
        this.encounterHist = new ArrayList<Encounter>();
        
    }

    public ArrayList<Encounter> getEncounterHist() {
        return encounterHist;
    }

    public void setEncounterHist(ArrayList<Encounter> encounterHist) {
        this.encounterHist = encounterHist;
    }
    
    public void deleteEncounter(Encounter e){
        encounterHist.remove(e);
    }
    
    
}
