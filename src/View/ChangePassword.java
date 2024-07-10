/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.PasswordFunctions;
import Model.User;
import javax.swing.JOptionPane;


public class ChangePassword extends javax.swing.JPanel {

    public Frame frame;
    private final User currentUser;
    private String username;
   
    public ChangePassword(final User currentUser) {
        this.currentUser = currentUser;
        username = this.currentUser.getUsername();
        if (username != null) {
            System.out.println("ChangePassword initialized with user: " + username);
        } else if (username == null) {
            System.out.println("ChangePassword initialized with null user");
        }
        initComponents();
    }
    
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        changePassBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        confpasswordFld = new javax.swing.JPasswordField();
        usernameFld = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FORGOT PASSWORD");
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentX(0.5F);

        changePassBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changePassBtn.setText("CHANGE PASSWORD");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(242, 242, 242));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "ENTER NEW PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        confpasswordFld.setBackground(new java.awt.Color(242, 242, 242));
        confpasswordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpasswordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpasswordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM NEW PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        usernameFld.setBackground(new java.awt.Color(242, 242, 242));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "ENTER USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(changePassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(178, 178, 178))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameFld, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confpasswordFld, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(187, 187, 187))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(confpasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        // ACCESS CURRENT USERNAME FROM FORGOT PASSWORD PANEL - DOES NOT WORK FOR SOME REASON (??)
        System.out.println("changePassBtnActionPerformed has user: " + currentUser.getUsername());
        
        username = usernameFld.getText();
        String password = new String(passwordFld.getPassword());
        String confirmPassword = new String(confpasswordFld.getPassword());
        boolean userExists = frame.checkExistingUser(username);
        
         // CHECK COMPLETE INPUTS
        if (username.equals("") || password.equals("") || confirmPassword.equals("")) {
            JOptionPane.showMessageDialog(frame, "Must complete all fields!", "Change Password Failed!", JOptionPane.INFORMATION_MESSAGE);
            clearInputs();
        }else if (!password.equals(confirmPassword) || !userExists || (frame.checkAccountStatus(username) == true)){
            JOptionPane.showMessageDialog(frame, "Check Username and Password", "Change Password Error", JOptionPane.ERROR_MESSAGE);
            clearInputs();
        }else if (!PasswordFunctions.validatePassword(password, username)) {
            JOptionPane.showMessageDialog(frame, "Password must contain at least 15 characters, including both uppercase and lowercase letters, at least 2 digits, 1 special character, and must not contain the username", "Change Password Error", JOptionPane.ERROR_MESSAGE);
            clearInputs();
        }
        else {
            System.out.println("User Changing Password Valid!!!" );
            frame.changePassword(username, password, confirmPassword);
            clearInputs();
            frame.loginNav();
        }
       
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        clearInputs();
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void clearInputs(){
        usernameFld.setText("");
        passwordFld.setText("");
        confpasswordFld.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JPasswordField confpasswordFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
