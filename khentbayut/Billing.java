/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package khentbayut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        addListeners();
    }
    private void insertBillingDetailsToDatabase(String invoiceNumber, String meterNumber, double meterReading, String tariffID, double tariffRate, double tax, double surcharge, double discount, double totalAmountDue, String name, String address, String email, String contact, String dateIssued, String dueDate) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arth", "arth", "arth123");
            String sql = "INSERT INTO invoice (id_no, meter_no, meter_reading, tariff_id, tariff_rate, tax, surcharge, discount, total_amount_due, name, address, email, contact, date_issued, due_date, done) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, null)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, invoiceNumber);
            pstmt.setString(2, meterNumber);
            pstmt.setDouble(3, meterReading);
            pstmt.setString(4, tariffID);
            pstmt.setDouble(5, tariffRate);
            pstmt.setDouble(6, tax);
            pstmt.setDouble(7, surcharge);
            pstmt.setDouble(8, discount);
            pstmt.setDouble(9, totalAmountDue);
            pstmt.setString(10, name);
            pstmt.setString(11, address);
            pstmt.setString(12, email);
            pstmt.setString(13, contact);
            pstmt.setString(14, dateIssued);
            pstmt.setString(15, dueDate);

            pstmt.executeUpdate();

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void insertBillingDetailsToDatabase2(String invoiceNumber, String dateIssued, String dueDate, double totalAmountDue, String status, String meterNumber) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arth", "arth", "arth123");
            String sql1 = "INSERT INTO invoices (id_no, date_issued, due_date, total_amount_due, status, meter_no) VALUES (?, ?, ?, ?, 'unpaid', ?)";
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setString(1, invoiceNumber);
            pstmt1.setString(2, dateIssued);
            pstmt1.setString(3, dueDate);
            pstmt1.setDouble(4, totalAmountDue);   
            pstmt1.setString(5, meterNumber);

            pstmt1.executeUpdate();

            pstmt1.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private String generateInvoiceNumber() {
        String invoiceNumber = "000001";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arth", "arth", "arth123");
            String sql = "SELECT id_no FROM invoice ORDER BY id_no DESC LIMIT 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next())
            {
                int lastInvoiceNumber = Integer.parseInt(rs.getString("id_no"));
                invoiceNumber = String.format("%06d", lastInvoiceNumber + 1);
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return invoiceNumber;
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
        mnumT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tariffidT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mreadT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tariffrT = new javax.swing.JTextField();
        taxT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        surC = new javax.swing.JComboBox<>();
        disC = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        totalT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        viewinvoiceB = new javax.swing.JButton();
        invoicenumTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Meter #");

        mnumT.setMaximumSize(new java.awt.Dimension(64, 22));

        jLabel2.setText("Tariff id");

        jLabel3.setText("Meter Reading(kWh)");

        jLabel5.setText("Tariff Rate");

        jLabel6.setText("Tax");

        tariffrT.setEditable(false);
        tariffrT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tariffrTFocusLost(evt);
            }
        });

        taxT.setText("12%");
        taxT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                taxTFocusLost(evt);
            }
        });
        taxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxTActionPerformed(evt);
            }
        });

        jLabel7.setText("Surcharge");

        jLabel8.setText("Discount");

        surC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Late Payment Surcharge", "None" }));

        disC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senior Citizen Discount", "Unabia Student Discount", "Employee Discount", "None" }));

        jLabel4.setText("Total Amount Due");

        totalT.setEditable(false);
        totalT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalTFocusLost(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generate Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        viewinvoiceB.setText("View Invoice");
        viewinvoiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinvoiceBActionPerformed(evt);
            }
        });

        invoicenumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicenumTFActionPerformed(evt);
            }
        });

        jLabel9.setText("Invoice #");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mnumT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mreadT)
                            .addComponent(tariffidT)
                            .addComponent(tariffrT)
                            .addComponent(taxT)
                            .addComponent(surC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(disC, 0, 218, Short.MAX_VALUE)
                            .addComponent(totalT)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewinvoiceB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoicenumTF)))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mnumT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mreadT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tariffidT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tariffrT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(surC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoicenumTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewinvoiceB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(8, 8, 8))
        );

        mreadT.getAccessibleContext().setAccessibleName("");
        mreadT.getAccessibleContext().setAccessibleDescription("");

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

    private void invoicenumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicenumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoicenumTFActionPerformed

    private void tariffrTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tariffrTFocusLost
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select rate_per_kWh from tariff_rates where id = '" + tariffidT.getText() + "'");
            while (rs.next()) {
                tariffrT.setText(rs.getString("rate_per_kWh"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tariffrTFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String meterNumber = mnumT.getText();
        String tariffID = tariffidT.getText();
        double meterReading = Double.parseDouble(mreadT.getText());

        // Retrieve customer details from the database
        Customer customer = getCustomerDetailsFromDatabase(meterNumber);
        if (customer == null) {
            JOptionPane.showMessageDialog(this, "Customer details not found!");
            return;
        }

        String name = customer.getName();
        String address = customer.getAddress();
        String email = customer.getEmail();
        String contact = customer.getContact();

        // Retrieve tariff rate from the database
        double tariffRate = getTariffRateFromDatabase(tariffID);

        // Determine discount rate based on the selection
        double discountRate = getDiscountRate();

        // Determine surcharge rate based on the selection
        double surchargeRate = getSurchargeRate();

        // Calculate tax
        double tax = convertPercentageToDecimal(taxT.getText());

        // Calculate total amount due
        double totalAmountDue = calculateTotalAmountDue1();

        // Generate a new unique invoice number
        String invoiceNumber = generateInvoiceNumber();

        // Get current date and due date (assume 30 days after issue)
        String dateIssued = LocalDate.now().toString();
        String dueDate = LocalDate.now().plusDays(30).toString();
        String status = "unpaid";

        // Insert billing details into the database
        insertBillingDetailsToDatabase(invoiceNumber, meterNumber, meterReading, tariffID, tariffRate, tax, surchargeRate, discountRate, totalAmountDue, name, address, email, contact, dateIssued, dueDate);
        insertBillingDetailsToDatabase2(invoiceNumber, dateIssued, dueDate, totalAmountDue, status, meterNumber);

        JOptionPane.showMessageDialog(this, "Invoice has been generated. Invoice Number: " + invoiceNumber + " Total Amount Due: ₱" + totalAmountDue);
    }

    // Fetch customer details from the database
    private Customer getCustomerDetailsFromDatabase(String meterNumber) {
        Customer customer = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arth", "arth", "arth123");
            String sql = "SELECT name, address, email, contact FROM customerf WHERE meter_no = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, meterNumber);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                customer = new Customer(
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("email"),
                    rs.getString("contact")
                );
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    // Fetch tariff rate from the database
    private double getTariffRateFromDatabase(String tariffID) {
        double tariffRate = 0.0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arth", "arth", "arth123");
            String sql = "SELECT rate_per_kWh FROM tariff_rates WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tariffID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                tariffRate = rs.getDouble("rate_per_kWh");
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tariffRate;
    }
    private double getDiscountRate() {
    String selectedDiscount = disC.getSelectedItem().toString();
    switch (selectedDiscount) {
        case "Senior Citizen Discount":
            return 0.15;
        case "Unabia Student Discount":
            return 0.1;
        case "Employee Discount":
            return 0.05;
        case "None":
        default:
            return 0.0;
    }
}
    private double getSurchargeRate() {
    return surC.getSelectedItem().toString().equals("Late Payment Surcharge") ? 0.05 : 0.0;
}
    private void addListeners() {
    mreadT.addFocusListener(new FocusAdapter() {
        public void focusLost(FocusEvent evt) {
            calculateTotalAmountDue();
        }
    });

    tariffidT.addFocusListener(new FocusAdapter() {
        public void focusLost(FocusEvent evt) {
            double tariffRate = getTariffRateFromDatabase(tariffidT.getText());
            tariffrT.setText(String.valueOf(tariffRate));
            calculateTotalAmountDue();
        }
    });

    disC.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            calculateTotalAmountDue();
        }
    });

    surC.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            calculateTotalAmountDue();
        }
    });
}
    private double convertPercentageToDecimal(String percentage) {
    if (percentage.endsWith("%")) {
        String percentageValue = percentage.substring(0, percentage.length() - 1);
        try {
            return Double.parseDouble(percentageValue) / 100.0;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    return 0.0; // Default value if parsing fails
}

    private void calculateTotalAmountDue() {
    try {
        double meterReading = Double.parseDouble(mreadT.getText());
        double tariffRate = Double.parseDouble(tariffrT.getText());
        double discountRate = getDiscountRate();
        double surchargeRate = getSurchargeRate();
        double taxValue = convertPercentageToDecimal(taxT.getText());

        double subtotal = tariffRate * meterReading;
        double discount = subtotal * discountRate;
        double surcharge = subtotal * surchargeRate;
        double tax = subtotal * taxValue;
        double totalAmountDue = subtotal - discount + surcharge + tax;

        totalT.setText(String.valueOf(totalAmountDue));
    } catch (NumberFormatException e) {
        // Handle the exception if inputs are not valid numbers
        totalT.setText("Invalid input");
    }
}
    private double calculateTotalAmountDue1() {
        double meterReading = Double.parseDouble(mreadT.getText());
        double tariffRate = Double.parseDouble(tariffrT.getText());
        double discountRate = getDiscountRate();
        double surchargeRate = getSurchargeRate();
        double taxValue = convertPercentageToDecimal(taxT.getText());

        double subtotal = tariffRate * meterReading;
        double discount = subtotal * discountRate;
        double surcharge = subtotal * surchargeRate;
        double tax = subtotal * taxValue;
        double totalAmountDue = subtotal - discount + surcharge + tax;
        return totalAmountDue;
}

    // Customer class to hold customer details
    class Customer {
        private String name;
        private String address;
        private String email;
        private String contact;

        public Customer(String name, String address, String email, String contact) {
            this.name = name;
            this.address = address;
            this.email = email;
            this.contact = contact;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }

        public String getContact() {
            return contact;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalTFocusLost
        calculateTotalAmountDue();
    }//GEN-LAST:event_totalTFocusLost

    private void taxTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taxTFocusLost
        
    }//GEN-LAST:event_taxTFocusLost

    private void taxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxTActionPerformed

    private void viewinvoiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinvoiceBActionPerformed
        String invoiceNumber = invoicenumTF.getText();
        InvoiceForm invoiceForm = new InvoiceForm(invoiceNumber);
        invoiceForm.setVisible(true);
    }//GEN-LAST:event_viewinvoiceBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> disC;
    private javax.swing.JTextField invoicenumTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mnumT;
    private javax.swing.JTextField mreadT;
    private javax.swing.JComboBox<String> surC;
    private javax.swing.JTextField tariffidT;
    private javax.swing.JTextField tariffrT;
    private javax.swing.JTextField taxT;
    private javax.swing.JTextField totalT;
    private javax.swing.JButton viewinvoiceB;
    // End of variables declaration//GEN-END:variables
}
