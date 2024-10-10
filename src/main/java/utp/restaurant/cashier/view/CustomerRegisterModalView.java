package utp.restaurant.cashier.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import utp.restaurant.cashier.controller.CustomerRegisterModalController;

/**
 *
 * @author PC
 */
public class CustomerRegisterModalView extends javax.swing.JDialog {

    private CustomerRegisterModalController customerRegisterModalController;
    private VoucherView root;
    private String typeDocument;

    public CustomerRegisterModalView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        customerRegisterModalController = new CustomerRegisterModalController(this);
        initComponents();

    }

    public void setRoot(VoucherView root) {
        this.root = root;

    }
    
    public void viewDocument(String typeDocument) {
        
        this.typeDocument = typeDocument;
        
        if (typeDocument.equals("Factura")) {
            
            jTFruc.setEnabled(true);
            jTFrazonSocial1.setEnabled(true);
            
        } else if (typeDocument.equals("Boleta")){
            
            jTFdni.setEnabled(true);
            jTFName.setEnabled(true);
            jTFLastNameP.setEnabled(true);
            jTFLastNameM.setEnabled(true);
            
        }
        
    }

    public String getTypeDocument() {
        return typeDocument;
    }
    
    public void showMessage(String msg) {

        JOptionPane.showMessageDialog(rootPane, msg);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTFName = new javax.swing.JTextField();
        jTFLastNameP = new javax.swing.JTextField();
        jTFLastNameM = new javax.swing.JTextField();
        jTFdni = new javax.swing.JTextField();
        jTFBhirtday = new javax.swing.JTextField();
        jTFTelephone = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFAddress = new javax.swing.JTextField();
        jTFruc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTFrazonSocial1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 242, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 242, 228));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFName.setBackground(new java.awt.Color(249, 242, 228));
        jTFName.setForeground(new java.awt.Color(51, 51, 51));
        jTFName.setBorder(null);
        jTFName.setEnabled(false);
        jTFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 20));

        jTFLastNameP.setBackground(new java.awt.Color(249, 242, 228));
        jTFLastNameP.setForeground(new java.awt.Color(51, 51, 51));
        jTFLastNameP.setBorder(null);
        jTFLastNameP.setEnabled(false);
        jTFLastNameP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLastNamePActionPerformed(evt);
            }
        });
        jPanel2.add(jTFLastNameP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 210, 20));

        jTFLastNameM.setBackground(new java.awt.Color(249, 242, 228));
        jTFLastNameM.setForeground(new java.awt.Color(51, 51, 51));
        jTFLastNameM.setBorder(null);
        jTFLastNameM.setEnabled(false);
        jTFLastNameM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLastNameMActionPerformed(evt);
            }
        });
        jPanel2.add(jTFLastNameM, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 220, 20));

        jTFdni.setBackground(new java.awt.Color(249, 242, 228));
        jTFdni.setForeground(new java.awt.Color(51, 51, 51));
        jTFdni.setBorder(null);
        jTFdni.setEnabled(false);
        jTFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFdniActionPerformed(evt);
            }
        });
        jPanel2.add(jTFdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 20));

        jTFBhirtday.setBackground(new java.awt.Color(249, 242, 228));
        jTFBhirtday.setForeground(new java.awt.Color(51, 51, 51));
        jTFBhirtday.setBorder(null);
        jTFBhirtday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBhirtdayActionPerformed(evt);
            }
        });
        jPanel2.add(jTFBhirtday, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 210, 20));

        jTFTelephone.setBackground(new java.awt.Color(249, 242, 228));
        jTFTelephone.setForeground(new java.awt.Color(51, 51, 51));
        jTFTelephone.setBorder(null);
        jTFTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelephoneActionPerformed(evt);
            }
        });
        jPanel2.add(jTFTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 220, 20));

        jTFEmail.setBackground(new java.awt.Color(249, 242, 228));
        jTFEmail.setForeground(new java.awt.Color(51, 51, 51));
        jTFEmail.setBorder(null);
        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 200, -1));

        jTFAddress.setBackground(new java.awt.Color(249, 242, 228));
        jTFAddress.setForeground(new java.awt.Color(51, 51, 51));
        jTFAddress.setBorder(null);
        jTFAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAddressActionPerformed(evt);
            }
        });
        jPanel2.add(jTFAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 210, 20));

        jTFruc.setBackground(new java.awt.Color(249, 242, 228));
        jTFruc.setForeground(new java.awt.Color(51, 51, 51));
        jTFruc.setBorder(null);
        jTFruc.setEnabled(false);
        jTFruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFrucActionPerformed(evt);
            }
        });
        jPanel2.add(jTFruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 138, 220, 20));

        jLabel13.setBackground(new java.awt.Color(86, 42, 35));
        jLabel13.setForeground(new java.awt.Color(86, 42, 35));
        jLabel13.setText("NOMBRE");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel15.setBackground(new java.awt.Color(86, 42, 35));
        jLabel15.setForeground(new java.awt.Color(86, 42, 35));
        jLabel15.setText("APELLIDO PATERNO");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 140, -1));

        jLabel16.setBackground(new java.awt.Color(86, 42, 35));
        jLabel16.setForeground(new java.awt.Color(86, 42, 35));
        jLabel16.setText("APELLIDO MATERNO");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator2.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 12));

        jSeparator3.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator3.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 210, 10));

        jSeparator4.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator4.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 220, 12));

        jLabel17.setBackground(new java.awt.Color(86, 42, 35));
        jLabel17.setForeground(new java.awt.Color(86, 42, 35));
        jLabel17.setText("DNI");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jSeparator5.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator5.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 12));

        jSeparator6.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator6.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 210, 10));

        jSeparator7.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator7.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 220, 12));

        jLabel18.setBackground(new java.awt.Color(86, 42, 35));
        jLabel18.setForeground(new java.awt.Color(86, 42, 35));
        jLabel18.setText("TELEFONO");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, 20));

        jLabel19.setBackground(new java.awt.Color(86, 42, 35));
        jLabel19.setForeground(new java.awt.Color(86, 42, 35));
        jLabel19.setText("FECHA DE NACIMIENTO");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 140, -1));

        jLabel20.setBackground(new java.awt.Color(86, 42, 35));
        jLabel20.setForeground(new java.awt.Color(86, 42, 35));
        jLabel20.setText("EMAIL");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jSeparator8.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator8.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 12));

        jSeparator9.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator9.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 210, 10));

        jSeparator10.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator10.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 220, 12));

        jLabel21.setBackground(new java.awt.Color(86, 42, 35));
        jLabel21.setForeground(new java.awt.Color(86, 42, 35));
        jLabel21.setText("RUC");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, 20));

        jLabel22.setBackground(new java.awt.Color(86, 42, 35));
        jLabel22.setForeground(new java.awt.Color(86, 42, 35));
        jLabel22.setText("DIRECCION");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 140, -1));

        jTFrazonSocial1.setBackground(new java.awt.Color(249, 242, 228));
        jTFrazonSocial1.setBorder(null);
        jTFrazonSocial1.setEnabled(false);
        jTFrazonSocial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFrazonSocial1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTFrazonSocial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 220, 20));

        jSeparator12.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator12.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 220, 12));

        jLabel24.setBackground(new java.awt.Color(86, 42, 35));
        jLabel24.setForeground(new java.awt.Color(86, 42, 35));
        jLabel24.setText("RAZON SOCIAL");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 740, 220));

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, 40));

        jButton2.setText("AGREGAR ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(86, 42, 35));
        jLabel12.setText("Registro del Cliente");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public CustomerRegisterModalController getCustomerRegisterModalController() {
        return customerRegisterModalController;

    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JTextField getjTFrazonSocial1() {
        return jTFrazonSocial1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JSeparator getjSeparator10() {
        return jSeparator10;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public JSeparator getjSeparator3() {
        return jSeparator3;
    }

    public JSeparator getjSeparator4() {
        return jSeparator4;
    }

    public JSeparator getjSeparator5() {
        return jSeparator5;
    }

    public JSeparator getjSeparator6() {
        return jSeparator6;
    }

    public JSeparator getjSeparator7() {
        return jSeparator7;
    }

    public JSeparator getjSeparator8() {
        return jSeparator8;
    }

    public JSeparator getjSeparator9() {
        return jSeparator9;
    }

    public JTextField getjTFAddress() {
        return jTFAddress;
    }

    public JTextField getjTFBhirtday() {
        return jTFBhirtday;
    }

    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public JTextField getjTFLastNameM() {
        return jTFLastNameM;
    }

    public JTextField getjTFLastNameP() {
        return jTFLastNameP;
    }

    public JTextField getjTFName() {
        return jTFName;
    }

    public JTextField getjTFTelephone() {
        return jTFTelephone;
    }

    public JTextField getjTFdni() {
        return jTFdni;
    }

    public JTextField getjTFruc() {
        return jTFruc;
    }


    private void jTFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNameActionPerformed

    private void jTFLastNamePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLastNamePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFLastNamePActionPerformed

    private void jTFLastNameMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLastNameMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFLastNameMActionPerformed

    private void jTFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFdniActionPerformed

    private void jTFBhirtdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBhirtdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBhirtdayActionPerformed

    private void jTFTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelephoneActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAddressActionPerformed

    private void jTFrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFrucActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        customerRegisterModalController.handleRegisterClick();
        
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTFrazonSocial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFrazonSocial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFrazonSocial1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus         dispose();
look and feel */
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
            java.util.logging.Logger.getLogger(CustomerRegisterModalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegisterModalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegisterModalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegisterModalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerRegisterModalView dialog = new CustomerRegisterModalView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTFAddress;
    private javax.swing.JTextField jTFBhirtday;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFLastNameM;
    private javax.swing.JTextField jTFLastNameP;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTextField jTFTelephone;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFrazonSocial1;
    private javax.swing.JTextField jTFruc;
    // End of variables declaration//GEN-END:variables
}
