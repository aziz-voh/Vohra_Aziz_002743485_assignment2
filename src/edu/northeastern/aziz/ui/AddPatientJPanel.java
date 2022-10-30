/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.aziz.ui;

import edu.northeastern.aziz.Model.City;
import edu.northeastern.aziz.Model.CityDirectory;
import edu.northeastern.aziz.Model.Community;
import edu.northeastern.aziz.Model.CommunityDirectory;
import edu.northeastern.aziz.Model.House;
import edu.northeastern.aziz.Model.HouseDirectory;
import edu.northeastern.aziz.Patient.Patient;
import edu.northeastern.aziz.Patient.PatientDirectory;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author aziz
 */
public class AddPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    PatientDirectory patientDir;
    CityDirectory cityDir;
    CommunityDirectory commDir;
    HouseDirectory houseDir;
    
    public AddPatientJPanel(CityDirectory cityDir, CommunityDirectory commDir, HouseDirectory houseDir, PatientDirectory patientDir) {
        initComponents();
        this.patientDir = patientDir;
        this.cityDir = cityDir;
        this.commDir = commDir;
        this.houseDir = houseDir;
        // populate comboBox values
        // city
        DefaultComboBoxModel cityComboBox = new DefaultComboBoxModel();
        cityComboBox.addElement("Select");
        
        for (City c : cityDir.getCityDirectory()) {
            cityComboBox.addElement(c.getCityName());
        }
        
        comboBoxCity.setModel(cityComboBox);
//        // community
//        DefaultComboBoxModel commComboBox = new DefaultComboBoxModel();
//        commComboBox.addElement("Select");
//        
//        for (Community c : commDir.getCommunityDirectory()) {
//            commComboBox.addElement(c.getCommName());
//        }
//        
//        comboBoxComm.setModel(commComboBox);
//        
//        // house
//        DefaultComboBoxModel houseComboBox = new DefaultComboBoxModel();
//        houseComboBox.addElement("Select");
//        
//        for (House h : houseDir.getHouseDirectory()) {
//            houseComboBox.addElement(h.getHouseName());
//        }
//        
//        comboBoxHouse.setModel(houseComboBox);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        comboBoxCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        comboBoxComm = new javax.swing.JComboBox<>();
        comboBoxHouse = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        comboBoxgender = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 204));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add New Patient");

        lblName.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAge.setText("Age");

        lblPhoneNo.setText("Phone No");

        lblEmail.setText("Email");

        lblUsername.setText("Username");

        lblPatientId.setText("Patient ID");

        lblPass.setText("Password");

        lblGender.setText("Gender");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        lblCity.setText("City");

        comboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCityActionPerformed(evt);
            }
        });

        lblCommunity.setText("Community");

        lblHouse.setText("House");

        comboBoxComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCommActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        comboBoxgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(78, 78, 78)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAge)
                                        .addGap(90, 90, 90)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblGender)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblEmail)
                                            .addGap(80, 80, 80)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPhoneNo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblPatientId)
                                    .addComponent(lblUsername)
                                    .addComponent(lblPass)
                                    .addComponent(comboBoxgender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPatientId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCity)
                                    .addComponent(lblCommunity)
                                    .addComponent(lblHouse))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBoxComm, 0, 170, Short.MAX_VALUE)
                                    .addComponent(comboBoxHouse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnCreate)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(comboBoxComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHouse)
                            .addComponent(comboBoxHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNo))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(comboBoxgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientId))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        //Validation of Input Fields - START
        try {
        //Name
        String name = txtName.getText();
        if (name.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Name");
            return;
        }
        

        
        //Age
        String age = txtAge.getText();
        if (age.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Age");
            return;
        }
        if(age.length() > 0 && !age.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Age can contain only Numeric values");
            return;
        }
        
        //Email
        String email = txtEmail.getText();
        if (!isValidEmail(email)){
            JOptionPane.showMessageDialog(this, "Please enter a valid Email address");
            return;
        }
        
        //Phone Number
        String phoneNo = txtPhoneNo.getText();
        if (phoneNo.length() < 10 || phoneNo.length() > 10) {
            JOptionPane.showMessageDialog(this, "Please enter a valid 10 digits Phone Number");
            return;
        }
        if(phoneNo.length() > 0 && !phoneNo.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Please enter a valid 10 digits Phone Number");
            return;
        }
        
        //Gender 
        String gender = comboBoxgender.getSelectedItem().toString();
        if ("Select".equals(gender)) {
            JOptionPane.showMessageDialog(this, "Please select Gender");
            return;
        }
        //Patient ID
        String patientId = txtPatientId.getText();
        if (patientId.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Patient ID");
            return;
        }
        if(patientId.length() > 0 && !patientId.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Patient ID can contain only Numeric values");
            return;
        }
        if (patientId.length() > 9) {
            JOptionPane.showMessageDialog(this, "Patient ID should be less than 10 digits");
            return;
        } 
        
        //Username
        String userName = txtUsername.getText();
        if (userName.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Username");
            return;
        }
        
        //Password
        String pass = txtPass.getText();
        if (pass.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Password");
            return;
        }
        

        
        // Not Mandatory Attributes
        String city = comboBoxCity.getSelectedItem().toString();
        if ("Select".equals(city)) {
            JOptionPane.showMessageDialog(this, "Please select City");
            return;
        }
        String comm = comboBoxComm.getSelectedItem().toString();
        if ("Select".equals(comm)) {
            JOptionPane.showMessageDialog(this, "Please select Comunity");
            return;
        }
        String house = comboBoxHouse.getSelectedItem().toString();
        if ("Select".equals(house)) {
            JOptionPane.showMessageDialog(this, "Please select House");
            return;
        }
        
        //Populate input data into Arraylist
        
        House houseObj = houseDir.findHouseFromName(house);
        Community commObj = commDir.findCommunityFromName(comm);
        City cityObj = cityDir.findCityFromName(city);
//        
        patientDir.addNewPatient(name, Short.parseShort(age), email, gender, Long.parseLong(phoneNo), houseObj, cityObj, commObj, Integer.parseInt(patientId) , userName, pass);
//        
//        
        //JOptionPane.showMessageDialog(this, "New Patient record added"+ " U = "+ p.get(0).getUsername()+ " P = "+ p.get(0).getPassword());
        JOptionPane.showMessageDialog(this, "New Patient record added");
        
        txtName.setText("");
        txtPatientId.setText("");
        txtAge.setText("");
        lblGender.setText("");
        txtUsername.setText("");
        txtPass.setText("");
        txtEmail.setText("");
        txtPhoneNo.setText("");
        comboBoxgender.setSelectedIndex(0);
        comboBoxCity.setSelectedIndex(0);
        comboBoxComm.setSelectedIndex(0);
        comboBoxHouse.setSelectedIndex(0);
        
        }
        catch (Exception e){
            
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void comboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCityActionPerformed
        // TODO add your handling code here:
        // community
        
        DefaultComboBoxModel commComboBox = new DefaultComboBoxModel();
        commComboBox.addElement("Select");
        
        String selectedCity = comboBoxCity.getSelectedItem().toString();
        City city = cityDir.findCityFromName(selectedCity);
        
        for (Community c : commDir.findCommunitiesInCity(city)) {
            commComboBox.addElement(c.getCommName());
        }
        
        comboBoxComm.setModel(commComboBox);
        
    }//GEN-LAST:event_comboBoxCityActionPerformed

    private void comboBoxCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCommActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel houseComboBox = new DefaultComboBoxModel();
        houseComboBox.addElement("Select");
        
        String selectedComm = comboBoxComm.getSelectedItem().toString();
        Community comm = commDir.findCommunityFromName(selectedComm);
        
        for (House h : houseDir.findHousesInCommunity(comm)) {
            houseComboBox.addElement(h.getHouseName());
        }
        
        comboBoxHouse.setModel(houseComboBox);
        
   
    }//GEN-LAST:event_comboBoxCommActionPerformed

    
    
    
    
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> comboBoxCity;
    private javax.swing.JComboBox<String> comboBoxComm;
    private javax.swing.JComboBox<String> comboBoxHouse;
    private javax.swing.JComboBox<String> comboBoxgender;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}