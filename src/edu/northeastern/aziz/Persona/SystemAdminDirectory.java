/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.aziz.Persona;

import java.util.ArrayList;

/**
 *
 * @author aziz
 */
public class SystemAdminDirectory {
    private ArrayList<SystemAdmin> sysAdminList;

    public SystemAdminDirectory() {
        
        this.sysAdminList = new ArrayList<SystemAdmin>();
        addDummySysAdmins();
    }

    public ArrayList<SystemAdmin> getSysAdminList() {
        return sysAdminList;
    }

    public void setSysAdminList(ArrayList<SystemAdmin> sysAdminList) {
        this.sysAdminList = sysAdminList;
    }
    
    
    public SystemAdmin addNewSysAdmin() {
        
        SystemAdmin newSysAdmin = new SystemAdmin();
        sysAdminList.add(newSysAdmin);
        return newSysAdmin; 
        
    }
    
    public void deleteSysAdmin(Person sysAdmin){
        sysAdminList.remove(sysAdmin);
    }
    
    public void addDummySysAdmins(){
        
        SystemAdmin newSysAdmin1 = new SystemAdmin("SysAdmin1", (short)20, "895 Hunt Ave", "male", 1234567890, "sys", "123");
        SystemAdmin newSysAdmin2 = new SystemAdmin("SysAdmin2", (short)22, "896 Hunt Ave", "male", 1234567890, "sys2", "123");
        SystemAdmin newSysAdmin3 = new SystemAdmin("SysAdmin3", (short)24, "897 Hunt Ave", "male", 1234567890, "sys3", "123");
        
        sysAdminList.add(newSysAdmin1);
        sysAdminList.add(newSysAdmin2);
        sysAdminList.add(newSysAdmin3);

    }
    
}
