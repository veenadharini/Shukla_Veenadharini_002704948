/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Employee_Data.Employee;
import Employee_Data.EmployeeDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veenadharini25
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    EmployeeDirectory directory;
    
    
    public DisplayJPanel(EmployeeDirectory directory) {
        initComponents();
        
        this.directory = directory;
        populateEmpTable();
        //displayEmployee();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        bttnView = new javax.swing.JButton();
        bttnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblEmployeeid = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartdate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeaminfo = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblContactInfo = new javax.swing.JLabel();
        lblCellNo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmpPhoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Level", "Team Info", "Contact no.", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        bttnView.setText("View");
        bttnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnViewActionPerformed(evt);
            }
        });

        bttnDelete.setText("Delete");
        bttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Display Employee");
        lblTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEmployeeid.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmployeeid.setText("Employee ID:");
        lblEmployeeid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName1.setText("           Name:");
        lblName1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("               Age:");
        lblAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("         Gender:");
        lblGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblStartdate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStartdate.setText("     Start Date:");
        lblStartdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLevel.setText("             Level:");
        lblLevel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTeaminfo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTeaminfo.setText("Team Info:");
        lblTeaminfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPosTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPosTitle.setText("Position Title:");
        lblPosTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContactInfo.setText("Contact Info:");
        lblContactInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCellNo.setText("Cell Phone no:");
        lblCellNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmail.setText("Email:");
        lblEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPhoto.setText("Employee Photo:");
        lblPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        lblEmpPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblContactInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPosTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTeaminfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStartdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmployeeid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCellNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 218, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bttnView)
                                        .addGap(18, 18, 18)
                                        .addComponent(bttnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblEmpPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)))))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnDelete)
                    .addComponent(bttnView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeid)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStartdate)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblEmpPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeaminfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContactInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellNo)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void bttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmployee.getSelectedRow();
        
        if (selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "Please select an employee to delete");
            return;            
        }
        
        DefaultTableModel model = (DefaultTableModel)tblEmployee.getModel();
        Employee selectedEmployee = (Employee)model.getValueAt(selectedRowIndex, 0);
        
        directory.deleteEmployee(selectedEmployee);
        
        JOptionPane.showMessageDialog(this, "Employee data is deleted");
        
        populateEmpTable();
        
        txtName.setText("");
        txtEmployeeID.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtContactNo.setText("");
        txtEmail.setText(""); 
        
    }//GEN-LAST:event_bttnDeleteActionPerformed

    private void bttnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnViewActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = tblEmployee.getSelectedRow();
        
        if (selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "Please select an employee to view");
            return;            
        }
        
        DefaultTableModel model = (DefaultTableModel)tblEmployee.getModel();
        Employee selectedEmployee = (Employee)model.getValueAt(selectedRowIndex, 0);
        
        txtName.setText(selectedEmployee.getName());
        txtEmployeeID.setText(String.valueOf(selectedEmployee.getEmployee_id()));
        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
        txtGender.setText(selectedEmployee.getGender());
        txtStartDate.setText(selectedEmployee.getStart_date());
        txtLevel.setText(String.valueOf(selectedEmployee.getLevel()));
        txtTeamInfo.setText(selectedEmployee.getTeam_info());
        txtPositionTitle.setText(selectedEmployee.getPosition_title());
        txtContactNo.setText(String.valueOf(selectedEmployee.getCell_no()));
        txtEmail.setText(selectedEmployee.getEmail_add());
        
         
        
    }//GEN-LAST:event_bttnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnDelete;
    private javax.swing.JButton bttnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNo;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpPhoto;
    private javax.swing.JLabel lblEmployeeid;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblStartdate;
    private javax.swing.JLabel lblTeaminfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    //private void displayEmployee() {
     
       /*txtName.setText(employee.getName());
        txtEmployeeID.setText(employee.getEmployee_id());
        txtAge.setText(employee.getAge());
        txtGender.setText(employee.getGender());
        txtStartDate.setText(employee.getStart_date());
        txtLevel.setText(employee.getLevel());
        txtTeamInfo.setText(employee.getTeam_info());
        txtPositionTitle.setText(employee.getPosition_title());
        txtContactNo.setText(employee.getCell_no());
        txtEmail.setText(employee.getEmail_add());  */
           
        
    //}

    private void populateEmpTable() {
        
        DefaultTableModel model = (DefaultTableModel)tblEmployee.getModel();
        model.setRowCount(0);
        
        for (Employee e: directory.getDirectory()){
            
            Object[] row = new Object[6];
            row[0] = e;
            row[1] = e.getEmployee_id();
            row[2] = e.getLevel();
            row[3] = e.getTeam_info();
            row[4] = e.getCell_no();
            row[5] = e.getEmail_add();
            
            model.addRow(row);
            
            
            
        }
    }
}
