
package View;
import Model.*;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        mfaFld1 = new javax.swing.JTextField();
        mfaFld2 = new javax.swing.JTextField();
        passwordFld = new javax.swing.JPasswordField();
        confirmpasswordFld = new javax.swing.JPasswordField();

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        mfaFld1.setBackground(new java.awt.Color(240, 240, 240));
        mfaFld1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mfaFld1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mfaFld1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "WHAT IS YOUR MOTHER'S MAIDEN NAME?", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        mfaFld1.setMinimumSize(new java.awt.Dimension(64, 45));
        mfaFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfaFld1ActionPerformed(evt);
            }
        });

        mfaFld2.setBackground(new java.awt.Color(240, 240, 240));
        mfaFld2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mfaFld2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mfaFld2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "WHAT COLOR IS YOUR EYE?", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        mfaFld2.setPreferredSize(new java.awt.Dimension(64, 46));
        mfaFld2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfaFld2ActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "ENTER PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        confirmpasswordFld.setBackground(new java.awt.Color(240, 240, 240));
        confirmpasswordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmpasswordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpasswordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mfaFld1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmpasswordFld)
                    .addComponent(passwordFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mfaFld2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameFld, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmpasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mfaFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mfaFld2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        mfaFld2.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String username = usernameFld.getText();
        String password = new String(passwordFld.getPassword());
        String confirmPassword = new String(confirmpasswordFld.getPassword());
        String mfaInput1 = mfaFld1.getText();
        String mfaInput2 = mfaFld2.getText();
        
        // VALIDATE USERNAME
        boolean isValidUsername = UserFunctions.validateUsername(username);
        boolean isNewUser = !frame.checkExistingUser(username);

        // CHECK COMPLETE INPUTS
        if (username.equals("") || password.equals("") || confirmPassword.equals("") || mfaInput1.equals("") || mfaInput2.equals("")) {
            JOptionPane.showMessageDialog(frame, "Must complete all fields!", "Registration Failed!", JOptionPane.INFORMATION_MESSAGE);
        }
        // VALIDATE USERNAME
        else if (!isValidUsername) {
            JOptionPane.showMessageDialog(frame, "Username must consists of atleast 8 characters and 2 digits", "Registration Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isNewUser || !password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(frame, "Check username and password", "Registration Error", JOptionPane.ERROR_MESSAGE);
        }
        // VALIDATE PASSWORD
        else if (!PasswordFunctions.validatePassword(password, username)) {
            JOptionPane.showMessageDialog(frame, "Password must contain at least 15 characters, including both uppercase and lowercase letters, at least 2 digits, 1 special character, and must not contain the username", "Registration Error", JOptionPane.ERROR_MESSAGE);
        }       
        else {
            // All validations passed, proceed with registration
            frame.registerAction(username, password, confirmPassword, mfaInput1, mfaInput2);
            JOptionPane.showMessageDialog(frame, "Registration Successful. You may now log in.", "Registration Successful!", JOptionPane.INFORMATION_MESSAGE);
            frame.loginNav(); 
            
        }
        // Clear fields
        clearInputs();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        clearInputs();
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void mfaFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfaFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mfaFld1ActionPerformed

    private void mfaFld2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfaFld2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mfaFld2ActionPerformed

    private void clearInputs(){
        usernameFld.setText("");
        passwordFld.setText("");
        confirmpasswordFld.setText("");
        mfaFld1.setText("");
        mfaFld2.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPasswordField confirmpasswordFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField mfaFld1;
    private javax.swing.JTextField mfaFld2;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
