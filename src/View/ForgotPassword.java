/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import javax.swing.JOptionPane;


public class ForgotPassword extends javax.swing.JPanel {

    public Frame frame;
    
    public ForgotPassword() {
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

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        mfaFld1 = new javax.swing.JTextField();
        mfaFld2 = new javax.swing.JTextField();
        confirmUserBtn = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FORGOT PASSWORD");
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentX(0.5F);

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

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

        confirmUserBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        confirmUserBtn.setText("CONFIRM USER");
        confirmUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mfaFld1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mfaFld2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameFld))))
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(confirmUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mfaFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mfaFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(confirmUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void confirmUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUserBtnActionPerformed
        String username = usernameFld.getText();
        String mfaInput1 = mfaFld1.getText();
        String mfaInput2 = mfaFld2.getText();
        boolean confirmSuccess = frame.confirmUser(username, mfaInput1, mfaInput2);
        
        
        // CHECK COMPLETE INPUTS
        if (username.equals("") || mfaInput1.equals("") || mfaInput2.equals("")) {
            JOptionPane.showMessageDialog(frame, "Must complete all fields!", "User Confirmation Failed!", JOptionPane.INFORMATION_MESSAGE);
            clearInputs();
        }
        else if (confirmSuccess){   
            frame.changePassNav(username);
            clearInputs();
        }else{
            JOptionPane.showMessageDialog(frame, "Confirmation Failed! Please check your username and MFA Answers", "User Confirmation Failed!", JOptionPane.ERROR_MESSAGE);
            clearInputs();
        }
           
    }//GEN-LAST:event_confirmUserBtnActionPerformed

    private void clearInputs(){
        usernameFld.setText("");
        mfaFld1.setText("");
        mfaFld2.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmUserBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField mfaFld1;
    private javax.swing.JTextField mfaFld2;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
