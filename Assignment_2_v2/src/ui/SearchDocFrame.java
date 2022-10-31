/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Veenadharini
 */
public class SearchDocFrame extends javax.swing.JFrame {

    /**
     * Creates new form SearchDocFrame
     */
    public SearchDocFrame() {
        initComponents();
        Color c = new Color(153,204,255);
        getContentPane().setBackground(c);
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
        lblTitle = new javax.swing.JLabel();
        bttnBack = new javax.swing.JButton();
        bttnAppt = new javax.swing.JButton();
        bttnLogOut1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchDoc = new javax.swing.JTable();
        bttnAppt1 = new javax.swing.JButton();
        bttnview = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        txtHosp = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        txtSpcl = new javax.swing.JTextField();
        txtExp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Calender1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Search Doctor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTitle)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        bttnBack.setText("Back");
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnAppt.setText("Book Appointment");
        bttnAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnApptActionPerformed(evt);
            }
        });

        bttnLogOut1.setText("Log out");
        bttnLogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLogOut1ActionPerformed(evt);
            }
        });

        tblSearchDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Community", "Hospitals", "Doctors", "Specialization", "Years of Experience"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSearchDoc);

        bttnAppt1.setText("Search Doctors");
        bttnAppt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAppt1ActionPerformed(evt);
            }
        });

        bttnview.setText("View Doctor");
        bttnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnviewActionPerformed(evt);
            }
        });

        jLabel1.setText("Community:");

        jLabel2.setText("Hospital:");

        jLabel3.setText("Doctor:");

        jLabel4.setText("Specialization:");

        jLabel5.setText("Years of experience:");

        txtComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommActionPerformed(evt);
            }
        });

        txtHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospActionPerformed(evt);
            }
        });

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        txtSpcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpclActionPerformed(evt);
            }
        });

        txtExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpActionPerformed(evt);
            }
        });

        jLabel6.setText("Appointment dates:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSpcl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(377, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bttnAppt1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(34, 34, 34)
                                        .addComponent(Calender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttnview, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttnAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(Calender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSpcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnAppt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnview, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttnLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        PatientFrame patientfr = new PatientFrame();
        patientfr.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnApptActionPerformed
        
        String user = LoginFrame.txtUsername.getText();
        java.util.Date appt = Calender1.getCalendar().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String appt1 = dateFormat.format(appt);
              
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital","root","");
            String sql = "insert into appointments values(?,?,?,?,?,?,?,?)";//8
            String sql1 ="update patient_records SET date='"+appt1+"' where Patient_username ='"+user+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,0);
            ps.setString(2,txtComm.getText());
            ps.setString(3,txtHosp.getText());
            ps.setString(4,txtDoc.getText());
            ps.setString(5,txtSpcl.getText());
            ps.setString(6,txtExp.getText());
            ps.setString(7,appt1);
            ps.setString(8,user);
            ps.executeUpdate();
            PreparedStatement pst11 = conn.prepareStatement(sql1);
            pst11.execute();
            JOptionPane.showMessageDialog(null, "Appointment confirmed");
            
            txtComm.setText("");
            txtHosp.setText("");
            txtDoc.setText("");
            txtExp.setText("");
            txtSpcl.setText("");
            
            
            
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        //java.util.Date DateApp = Calender1.getCalendar().getTime();
    }//GEN-LAST:event_bttnApptActionPerformed

    private void bttnLogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLogOut1ActionPerformed
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttnLogOut1ActionPerformed

    private void bttnAppt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAppt1ActionPerformed
        
        String user = LoginFrame.txtUsername.getText();
        String patient_community = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital","root","");
            Statement st = conn.createStatement();
            String sql = "select patient_community from patient_records where Patient_username = '"+user+"'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs =pst.executeQuery();
            while(rs.next()){
                patient_community =  rs.getString("patient_community") ;
                
               
            }
            
            String sql1 = "select * from doctor_records where doc_community = '"+patient_community+"'";
            PreparedStatement pst1 = conn.prepareStatement(sql1);
            ResultSet rs1 =pst1.executeQuery();
            //String rss = rs1.getString("");
            
            
            DefaultTableModel tbl1 = (DefaultTableModel) tblSearchDoc.getModel();
            tbl1.setRowCount(0);
            
            while(rs1.next()){
                Object o1[] = {rs1.getString("doc_community"), rs1.getString("doc_hosp"),rs1.getString("doc_name"),rs1.getString("specialization"),rs1.getString("expyears")};
                tbl1.addRow(o1);
                
            
            }
        
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_bttnAppt1ActionPerformed

    private void bttnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnviewActionPerformed
        
        int selectedRowIndex = tblSearchDoc.getSelectedRow();
        //ImageIcon imageicon = new ImageIcon(selectedImagePath);
        if (selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "Please select a doctor to book an appointment");
            return;            
        }
        
        DefaultTableModel model1 = (DefaultTableModel)tblSearchDoc.getModel();
        //Employee selectedEmployee = (Employee)model.getValueAt(selectedRowIndex, 0);
        
        txtComm.setText((String)tblSearchDoc.getValueAt(selectedRowIndex,0));
        txtHosp.setText((String)tblSearchDoc.getValueAt(selectedRowIndex, 1));
        txtDoc.setText((String)tblSearchDoc.getValueAt(selectedRowIndex, 2));
        txtSpcl.setText((String)tblSearchDoc.getValueAt(selectedRowIndex, 3));
        txtExp.setText((String)tblSearchDoc.getValueAt(selectedRowIndex, 4));
        
        
        
    }//GEN-LAST:event_bttnviewActionPerformed

    private void txtCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommActionPerformed

    private void txtHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospActionPerformed

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void txtSpclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpclActionPerformed

    private void txtExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpActionPerformed

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
            java.util.logging.Logger.getLogger(SearchDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDocFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Calender1;
    private javax.swing.JButton bttnAppt;
    private javax.swing.JButton bttnAppt1;
    private javax.swing.JButton bttnBack;
    private javax.swing.JButton bttnLogOut1;
    private javax.swing.JButton bttnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSearchDoc;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtHosp;
    private javax.swing.JTextField txtSpcl;
    // End of variables declaration//GEN-END:variables
}
