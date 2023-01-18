/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */
package gamemarkstudio.login;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
public class AddNewLogin extends javax.swing.JPanel {

    /**
     * Creates new form AddNewLogin
     */
    
    public AddNewLogin() {
        initComponents();
        setBackground(Color.white);
        LoginHandling.load();
        idTextField.setText(LoginHandling.LoginID()+"");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        questincombo = new javax.swing.JComboBox<>();
        answertf = new javax.swing.JTextField();
        passwordtf = new javax.swing.JTextField();
        fullnametf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        statusComboBox = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(689, 675));
        setRequestFocusEnabled(false);

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User Name:");

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Status:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Security Question:");

        questincombo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        questincombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your dream?", "Whtat's your PET name?", "What's your school teacher name?" }));
        questincombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        answertf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        answertf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passwordtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fullnametf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullnametf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Full Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Security Answer:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Add New Login");
        jLabel1.setToolTipText("");

        Save.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(0, 153, 0));
        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        statusComboBox.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Admin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jLabel12))
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(questincombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(answertf, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(fullnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(statusComboBox, 0, 254, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(questincombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(answertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fullnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
            LoginHandling.save(getData());
            JOptionPane.showMessageDialog(null,"Record Saved.");
        }catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Not Saved something went wrong.");
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    
    public Login_1 getData()
    {
        
        int id = Integer.parseInt(idTextField.getText());
        String name = fullnametf.getText();
        String user = username.getText();
        String pass = passwordtf.getText();
        String status = statusComboBox.getSelectedItem().toString();
        String qstn = String.valueOf(questincombo.getSelectedItem());
        String ans = answertf.getText();
        
        java.util.Calendar cal = new java.util.GregorianCalendar();
        return new Login_1(id, user, pass, qstn, ans, name, status, cal.getTime().toString());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JTextField answertf;
    private javax.swing.JTextField fullnametf;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField passwordtf;
    private javax.swing.JComboBox<String> questincombo;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
