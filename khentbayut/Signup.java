/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package khentbayut;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author amanc
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jTextField4.setVisible(false);
        addT.setVisible(false);
        contactT.setVisible(false);
        emailT.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        userT = new javax.swing.JTextField();
        nameT = new javax.swing.JTextField();
        passT = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addT = new javax.swing.JTextField();
        emailT = new javax.swing.JTextField();
        contactT = new javax.swing.JTextField();
        createB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        adopT = new javax.swing.JTextField();
        adopL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 202, 255));

        jLabel1.setText("Create Account As");

        jLabel2.setText("Username");

        jLabel3.setText("Name");

        jLabel4.setText("Password");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer", "Operator" }));
        jComboBox1.setToolTipText("Create Account As");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Meter number");
        jLabel5.setFocusable(false);

        passT.setBackground(new java.awt.Color(204, 204, 204));

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jLabel6.setText("Email");

        jLabel7.setText("Contact Number");

        jLabel8.setText("Address");

        addT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTActionPerformed(evt);
            }
        });

        emailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTActionPerformed(evt);
            }
        });

        contactT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTActionPerformed(evt);
            }
        });

        createB.setText("Create");
        createB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBActionPerformed(evt);
            }
        });

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        adopT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adopTFocusLost(evt);
            }
        });
        adopT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adopTActionPerformed(evt);
            }
        });

        adopL.setText("Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createB)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(adopL))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adopT)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userT)
                            .addComponent(nameT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(backB)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(addT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(contactT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(passT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(emailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adopT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adopL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createB)
                    .addComponent(backB))
                .addGap(72, 72, 72))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       String choice = (String) jComboBox1.getSelectedItem();
        if ("Admin".equals(choice) || "Operator".equals(choice)) {
            jLabel5.setVisible(false);
            jTextField4.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            addT.setVisible(false);
            emailT.setVisible(false);
            contactT.setVisible(false);
            nameT.setEditable(true);
            nameT.setBackground(new Color(255,255,255));
            adopL.setVisible(true);
            adopT.setVisible(true);
            passT.setEditable(false);
            passT.setBackground(new Color(204,204,204));
            passT.setEditable(false);
        } else {
            nameT.setEditable(false);
            nameT.setBackground(new Color(204,204,204));
            jLabel5.setVisible(true);
            jTextField4.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            addT.setVisible(true);
            emailT.setVisible(true);
            contactT.setVisible(true);
            adopL.setVisible(false);
            adopT.setVisible(false);
            passT.setBackground(new Color(255,255,255));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTActionPerformed

    private void emailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTActionPerformed

    private void contactTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTActionPerformed

    private void createBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBActionPerformed
            String atype = (String) jComboBox1.getSelectedItem();
            String susername = userT.getText();
            String sname = nameT.getText();
            String spassword = passT.getText();
            String smeter = jTextField4.getText();
            String sadd = addT.getText();
            String scontact = contactT.getText();
            String semail = emailT.getText();
            
            try {
                String text = nameT.getText();
                String text2 = passT.getText();
                if (!(text.isEmpty()) && !(text2.isEmpty())) {
                Connect c = new Connect();
                String query;
                String query2 = null;
                String query3 = null;
                if(atype.equals("Admin")||atype.equals("Operator")) {
                    query = "insert into ad_op values('"+susername+"', '"+sname+"', '"+spassword+"', '"+atype+"')";
                } else {
                    query = "update signup set username = '"+susername+"', password = '"+spassword+"', user = '"+atype+"', address = '"+sadd+"', contact = '"+scontact+"', email = '"+semail+"' where meter_no = '"+smeter+"'";
                    query2 = "update customerf set username = '"+susername+"', password = '"+spassword+"', address = '"+sadd+"', contact = '"+scontact+"', email = '"+semail+"', user = '"+atype+"' where meter_no = '"+smeter+"'";
                    query3 = "update customerd set address = '"+sadd+"', contact = '"+scontact+"', email = '"+semail+"' where meter_no = '"+smeter+"'";
                }
                c.s.executeUpdate(query);
                if (atype.equals("Customer")) {
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query2);
                    c.s.executeUpdate(query3);
                    }    
                JOptionPane.showMessageDialog(null, "Account created successfully");
                } else {
                   JOptionPane.showMessageDialog(null, "Name/Password cannot be empty"); 
                }
                
            } catch (Exception e) {
            e.printStackTrace();
           
                    }
    }//GEN-LAST:event_createBActionPerformed
 
    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from signup where meter_no = '" + jTextField4.getText() + "'");
            while (rs.next()) {
                nameT.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jTextField4FocusLost

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
    setVisible(false);
    new LogInForm().setVisible(true);
    }//GEN-LAST:event_backBActionPerformed

    private void adopTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adopTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adopTActionPerformed

    private void adopTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adopTFocusLost
        try {
            String adop = (String )jComboBox1.getSelectedItem();
            if (adop.equals("Admin")) {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from ad_op_code where code = '" + adopT.getText() + "'");
            while (rs.next()) {
                passT.setText(rs.getString("password"));
            }
            } else if (adop.equals("Operator")) {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from ad_op_code where code = '" + adopT.getText() + "'");
            while (rs.next()) {
                passT.setText(rs.getString("password"));
            } 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_adopTFocusLost
    
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addT;
    private javax.swing.JLabel adopL;
    private javax.swing.JTextField adopT;
    private javax.swing.JButton backB;
    private javax.swing.JTextField contactT;
    private javax.swing.JButton createB;
    private javax.swing.JTextField emailT;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nameT;
    private javax.swing.JTextField passT;
    private javax.swing.JTextField userT;
    // End of variables declaration//GEN-END:variables
}
