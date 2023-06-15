/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libraryproject;

/**
 *
 * @author urdo5941
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        txtError.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountPanel = new javax.swing.JPanel();
        accountLabel1 = new javax.swing.JLabel();
        accountUsername = new javax.swing.JLabel();
        accountPassword1 = new javax.swing.JLabel();
        accountTf1 = new javax.swing.JTextField();
        accountTf2 = new javax.swing.JTextField();
        registerBtn = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        accountTf3 = new javax.swing.JTextField();
        accountPassword2 = new javax.swing.JLabel();
        returnBtn1 = new javax.swing.JToggleButton();
        txtError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accountPanel.setBackground(new java.awt.Color(204, 255, 204));
        accountPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        accountLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accountLabel1.setText("WELCOME TO THE LIBRARY");

        accountUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountUsername.setText("Username:");

        accountPassword1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountPassword1.setText("Password:");

        accountTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTf1ActionPerformed(evt);
            }
        });

        accountTf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTf2ActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(255, 255, 255));
        registerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("   ");

        accountTf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTf3ActionPerformed(evt);
            }
        });

        accountPassword2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountPassword2.setText("Confirm Password:");

        returnBtn1.setBackground(new java.awt.Color(255, 255, 255));
        returnBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        returnBtn1.setText("RETURN");
        returnBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBtn1MouseClicked(evt);
            }
        });
        returnBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtn1ActionPerformed(evt);
            }
        });

        txtError.setForeground(new java.awt.Color(255, 51, 51));
        txtError.setText("***Passwords does not match. Please try again!***");

        jLabel3.setText("   ");

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPanelLayout.createSequentialGroup()
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountPanelLayout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(accountUsername)
                                .addComponent(accountPassword1))
                            .addComponent(accountPassword2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountTf3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(accountPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(returnBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtError))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPanelLayout.createSequentialGroup()
                        .addComponent(accountLabel1)
                        .addGap(13, 13, 13)))
                .addGap(85, 85, 85))
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(accountLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtError)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountUsername)
                    .addComponent(accountTf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountPassword1)
                    .addComponent(accountTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountPassword2))
                .addGap(18, 18, 18)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(returnBtn1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTf1ActionPerformed

    private void accountTf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTf2ActionPerformed
    
    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
        
    }//GEN-LAST:event_registerBtnMouseClicked

    private void accountTf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTf3ActionPerformed

    private void returnBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_returnBtn1MouseClicked

    private void returnBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtn1ActionPerformed
        // TODO add your handling code here:
        account a = new account();
        a.setVisible(true);
        setVisible(false);
            
    }//GEN-LAST:event_returnBtn1ActionPerformed

    
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        account a = new account();
        String account = accountTf1.getText();
        String password1 = accountTf2.getText();
        String password2 = accountTf3.getText();
        if (password1.equals(password2)&& !password1.equals("") && !account.equals("")) {
            a.userTxt.setText(accountTf1.getText());
            a.passwordTxt.setText(accountTf2.getText());
            a.setVisible(true);
            setVisible(false);
        }
        else{
            txtError.setVisible(true);
            accountTf2.setText("");
            accountTf3.setText("");
        }
        
    }//GEN-LAST:event_registerBtnActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel1;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JLabel accountPassword1;
    private javax.swing.JLabel accountPassword2;
    public javax.swing.JTextField accountTf1;
    public javax.swing.JTextField accountTf2;
    private javax.swing.JTextField accountTf3;
    private javax.swing.JLabel accountUsername;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton registerBtn;
    private javax.swing.JToggleButton returnBtn1;
    private javax.swing.JLabel txtError;
    // End of variables declaration//GEN-END:variables
}
