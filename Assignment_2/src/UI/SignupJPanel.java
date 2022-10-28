/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author Veenadharini
 */
public class SignupJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignupJPanel
     */
    public SignupJPanel() {
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

        lblName = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblMobile = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblUserRole = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox<>();
        ComboCity = new javax.swing.JComboBox<>();
        PassPwd = new javax.swing.JPasswordField();
        txtAddress = new javax.swing.JTextField();
        ComboComm = new javax.swing.JComboBox<>();
        CombouserRole = new javax.swing.JComboBox<>();
        bttnSubmit = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        lblBloodGrp = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        ComboBloodGrp = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        lblName.setText("Name:");

        lblID.setText("ID:");

        lblEmail.setText("Email:");

        lblMobile.setText("Mobile:");

        lblGender.setText("Gender:");

        lblCity.setText("City:");

        lblCommunity.setText("Community:");

        lblAddress.setText("Address:");

        lblUserRole.setText("User Role:");

        lblPassword.setText("Password:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Gender..", "Male", "Female", "Others", "Do not wish to Specify" }));

        ComboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose City..", "Boston", "New York", " " }));
        ComboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCityActionPerformed(evt);
            }
        });

        ComboComm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Community..", "Allston", "Back Bay", "Brooklyn Heights", "EastVillage" }));

        CombouserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Role..", "Patient", "Doctor" }));

        bttnSubmit.setText("Submit");
        bttnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSubmitActionPerformed(evt);
            }
        });

        lblAge.setText("Age:");

        lblBloodGrp.setText("Blood Group");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        ComboBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Blood Group..", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Sign up Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(242, 242, 242))
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGender)
                                    .addComponent(lblPassword)
                                    .addComponent(lblAddress)
                                    .addComponent(lblCommunity)
                                    .addComponent(lblCity)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEmail)
                                            .addComponent(lblMobile)
                                            .addComponent(lblID))
                                        .addGap(2, 2, 2)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID)
                                    .addComponent(txtEmail)
                                    .addComponent(txtMobile)
                                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassPwd)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserRole, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBloodGrp, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CombouserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ComboBloodGrp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserRole)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CombouserRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBloodGrp)
                            .addComponent(ComboBloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMobile)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(ComboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(ComboComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(PassPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnSubmit)
                .addGap(176, 176, 176))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void bttnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnSubmitActionPerformed

    private void ComboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCityActionPerformed
        // TODO add your handling code here:
        if(ComboCity.getSelectedItem().equals("Boston"))
        {
            ComboComm.setSelectedItem(null);
            ComboComm.addItem("Allston");
            ComboComm.addItem("Back Bay");    
        }
        else
        if(ComboCity.getSelectedItem().equals("New York"))
        {
            ComboComm.setSelectedItem(null);
            ComboComm.addItem("Brooklyn Heights");
            ComboComm.addItem("EastVillage");    
        }

    }//GEN-LAST:event_ComboCityActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBloodGrp;
    private javax.swing.JComboBox<String> ComboCity;
    private javax.swing.JComboBox<String> ComboComm;
    private javax.swing.JComboBox<String> CombouserRole;
    private javax.swing.JPasswordField PassPwd;
    private javax.swing.JButton bttnSubmit;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodGrp;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
