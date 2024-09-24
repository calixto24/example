/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utp.restaurant.login.view;

import utp.restaurant.login.controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JHORDAN
 */
public class LoginView extends javax.swing.JFrame {

    //atributos
    private LoginController loginController;

    public LoginView() {

        loginController = new LoginController(this);

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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTFPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jCviewPassword = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 242, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(86, 42, 35));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 42, 35));
        jLabel1.setText("INICIAR SESIÓN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 270, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 42, 35));
        jLabel2.setText("USUARIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jTFUsername.setBackground(new java.awt.Color(249, 242, 228));
        jTFUsername.setForeground(new java.awt.Color(102, 102, 102));
        jTFUsername.setText("Ingrese su nombre de usuario");
        jTFUsername.setToolTipText("");
        jTFUsername.setBorder(null);
        jTFUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFUsernameMousePressed(evt);
            }
        });
        jTFUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTFUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 410, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(86, 42, 35));
        jLabel3.setText("CONTRASEÑA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton1.setBackground(new java.awt.Color(86, 42, 35));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(249, 242, 228));
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 410, 36));

        jTFPassword.setBackground(new java.awt.Color(249, 242, 228));
        jTFPassword.setForeground(new java.awt.Color(102, 102, 102));
        jTFPassword.setText("********");
        jTFPassword.setBorder(null);
        jTFPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFPasswordMousePressed(evt);
            }
        });
        jTFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jTFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 410, 39));

        jSeparator2.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator2.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 410, 10));

        jSeparator3.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator3.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 410, 20));

        jCviewPassword.setBackground(new java.awt.Color(249, 242, 228));
        jCviewPassword.setForeground(new java.awt.Color(51, 51, 51));
        jCviewPassword.setText("Mostrar");
        jCviewPassword.setBorder(null);
        jCviewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCviewPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jCviewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 472, 400));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/restaurant/images/backLogin.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        loginController.handleLoginClick();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPasswordActionPerformed

    private void jTFUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFUsernameMousePressed

        if (jTFUsername.getText().equals("Ingrese su nombre de usuario")) {

            jTFUsername.setText("");

        }

        if (String.valueOf(jTFPassword.getPassword()).isEmpty()) {

            jTFPassword.setText("********");
            
        }


    }//GEN-LAST:event_jTFUsernameMousePressed

    private void jTFPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFPasswordMousePressed

        if (String.valueOf(jTFPassword.getPassword()).equals("********")) {

            jTFPassword.setText("");

        }

        if (jTFUsername.getText().isEmpty()) {

            jTFUsername.setText("Ingrese su nombre de usuario");
            
        }

    }//GEN-LAST:event_jTFPasswordMousePressed

    private void jCviewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCviewPasswordActionPerformed
        
        if(jCviewPassword.isSelected()) {
            
            jTFPassword.setEchoChar((char)0);
            
        } else {
            
            jTFPassword.setEchoChar(('*'));
            
        }
        
    }//GEN-LAST:event_jCviewPasswordActionPerformed

    public void showMessage(String msg) {

        JOptionPane.showMessageDialog(rootPane, msg);

    }

    //getters
    public JPasswordField getjTFPassword() {
        return jTFPassword;
    }

    public JTextField getjTFUsername() {
        return jTFUsername;
    }

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCviewPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField jTFPassword;
    private javax.swing.JTextField jTFUsername;
    // End of variables declaration//GEN-END:variables
}
