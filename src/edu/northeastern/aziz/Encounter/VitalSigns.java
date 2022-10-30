/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Encounter;

/**
 *
 * @author aziz
 */
public class VitalSigns {
    
    short temperature;
    int pulseRate;
    short respirationRate;
    int bloodPressure;

    public VitalSigns() {
    }

    public VitalSigns(short temperature, int pulseRate, short respirationRate, int bloodPressure) {
        this.temperature = temperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
    }

    public short getTemperature() {
        return temperature;
    }

    public void setTemperature(short temperature) {
        this.temperature = temperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public short getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(short respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
    
    
}
