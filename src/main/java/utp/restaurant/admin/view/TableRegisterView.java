/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utp.restaurant.admin.view;

import utp.restaurant.admin.controller.TableController;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import utp.restaurant.model.Employee;

/**
 *
 * @author PC
 */
public class TableRegisterView extends javax.swing.JFrame {

    /**
     * Creates new form TableRegisterView
     */
    private TableController tableController;
    private int row;
    
    public TableRegisterView() {
        
        tableController= new TableController(this);
        initComponents();
        
        renderTable();
    }
    
    public void renderCBWaiter() {
        tableController.renderCBWaiter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFNmesa = new javax.swing.JTextField();
        jTFcapacity = new javax.swing.JTextField();
        jCBestatus = new javax.swing.JComboBox<>();
        jCBEmployees = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtableList = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jBdelete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 242, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(86, 42, 35));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(86, 42, 35));
        jLabel3.setText("¡Registro de Mesas!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(249, 242, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(86, 42, 35));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 42, 35));
        jLabel1.setText("N° MESA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, 160, -1));

        jTFNmesa.setBackground(new java.awt.Color(249, 242, 228));
        jTFNmesa.setForeground(new java.awt.Color(51, 51, 51));
        jTFNmesa.setBorder(null);
        jTFNmesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNmesaActionPerformed(evt);
            }
        });
        jPanel2.add(jTFNmesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 48, 340, -1));

        jTFcapacity.setBackground(new java.awt.Color(249, 242, 228));
        jTFcapacity.setForeground(new java.awt.Color(51, 51, 51));
        jTFcapacity.setBorder(null);
        jTFcapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcapacityActionPerformed(evt);
            }
        });
        jPanel2.add(jTFcapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 340, -1));

        jCBestatus.setBackground(new java.awt.Color(249, 242, 228));
        jCBestatus.setForeground(new java.awt.Color(51, 51, 51));
        jCBestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado", "Desabilitado" }));
        jCBestatus.setBorder(null);
        jPanel2.add(jCBestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, -1));

        jCBEmployees.setBackground(new java.awt.Color(249, 242, 228));
        jCBEmployees.setForeground(new java.awt.Color(51, 51, 51));
        jCBEmployees.setBorder(null);
        jPanel2.add(jCBEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 340, -1));

        jSeparator1.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator1.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 70, 340, 12));

        jLabel6.setBackground(new java.awt.Color(86, 42, 35));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(86, 42, 35));
        jLabel6.setText("CAPACIDAD");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 160, -1));

        jSeparator2.setBackground(new java.awt.Color(86, 42, 35));
        jSeparator2.setForeground(new java.awt.Color(86, 42, 35));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 340, 12));

        jLabel7.setBackground(new java.awt.Color(86, 42, 35));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(86, 42, 35));
        jLabel7.setText("ESTADO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        jLabel8.setBackground(new java.awt.Color(86, 42, 35));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(86, 42, 35));
        jLabel8.setText("MESERO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 160, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 110, 790, -1));

        jPanel3.setBackground(new java.awt.Color(249, 242, 228));

        jTtableList.setBackground(new java.awt.Color(249, 242, 228));
        jTtableList.setForeground(new java.awt.Color(51, 51, 51));
        jTtableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTtableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTtableListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTtableListMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTtableList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 750, -1));

        jButton1.setBackground(new java.awt.Color(86, 42, 35));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(249, 242, 228));
        jButton1.setText("Guardar ");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 122, 42));

        jBdelete.setBackground(new java.awt.Color(86, 42, 35));
        jBdelete.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBdelete.setForeground(new java.awt.Color(249, 242, 228));
        jBdelete.setText("Eliminar");
        jBdelete.setBorder(null);
        jBdelete.setEnabled(false);
        jBdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jBdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 118, 42));

        jButton3.setBackground(new java.awt.Color(86, 42, 35));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(249, 242, 228));
        jButton3.setText("Limpiar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 630, 122, 42));

        jButton2.setBackground(new java.awt.Color(86, 42, 35));
        jButton2.setForeground(new java.awt.Color(249, 242, 228));
        jButton2.setText("atras");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 73, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/restaurant/images/bannerMesa.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 449, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Completa la información de las mesas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 240, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    tableController.handleRegisterClick();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFcapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcapacityActionPerformed

    private void jTFNmesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNmesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNmesaActionPerformed

    private void jTtableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtableListMouseClicked
        row = jTtableList.rowAtPoint(evt.getPoint());
        tableController.heandleViewEditClick();
        
    }//GEN-LAST:event_jTtableListMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tableController.handleCleanForm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeleteActionPerformed
        tableController.heandleDeleteClick();
    }//GEN-LAST:event_jBdeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTtableListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtableListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtableListMouseEntered

    public void renderTable() {
        
        DefaultTableModel tableModel = tableController.getTableModel();
        jTtableList.setModel(tableModel);
        
        TableColumnModel tcm = jTtableList.getColumnModel();
        tcm.removeColumn(tcm.getColumn(0));
        
        
    }
    
    public void showMessage( String message){
        JOptionPane.showMessageDialog(rootPane, message);
    }
    
    public int showConfirmation(String message) {
        return JOptionPane.showConfirmDialog(rootPane, message);
    }

    public JButton getjBdelete() {
        return jBdelete;
    }

    public int getRow() {
        return row;
    }

    public JTable getjTtableList() {
        return jTtableList;
    }
    
    public JComboBox<String> getjCBestatus() {
        return jCBestatus;
    }

    public JComboBox<Employee> getjCBEmployees() {
        return jCBEmployees;
    }

    public JTextField getjTFNmesa() {
        return jTFNmesa;
    }

    public JTextField getjTFcapacity() {
        return jTFcapacity;
    }
    
    public JComboBox<Employee> getJCBEmployees() {
        return jCBEmployees;
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
            java.util.logging.Logger.getLogger(TableRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableRegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<Employee> jCBEmployees;
    private javax.swing.JComboBox<String> jCBestatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFNmesa;
    private javax.swing.JTextField jTFcapacity;
    private javax.swing.JTable jTtableList;
    // End of variables declaration//GEN-END:variables
}
