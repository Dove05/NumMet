
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class GuessSeidel extends javax.swing.JFrame {

    public GuessSeidel() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        field10 = new javax.swing.JTextField();
        field11 = new javax.swing.JTextField();
        field12 = new javax.swing.JTextField();
        field1 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        field5 = new javax.swing.JTextField();
        field6 = new javax.swing.JTextField();
        field7 = new javax.swing.JTextField();
        field8 = new javax.swing.JTextField();
        field9 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        CLEAR = new javax.swing.JButton();
        CALCULATE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        guessy = new javax.swing.JTextField();
        guessz = new javax.swing.JTextField();
        guessx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 150, 40));

        field10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field10ActionPerformed(evt);
            }
        });
        getContentPane().add(field10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 70, 40));

        field11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field11ActionPerformed(evt);
            }
        });
        getContentPane().add(field11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 70, 40));

        field12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field12ActionPerformed(evt);
            }
        });
        getContentPane().add(field12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 40));

        field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field1ActionPerformed(evt);
            }
        });
        getContentPane().add(field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 70, 40));

        field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field3ActionPerformed(evt);
            }
        });
        getContentPane().add(field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 70, 40));

        field4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field4ActionPerformed(evt);
            }
        });
        getContentPane().add(field4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, 40));

        field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field5ActionPerformed(evt);
            }
        });
        getContentPane().add(field5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 70, 40));

        field6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field6ActionPerformed(evt);
            }
        });
        getContentPane().add(field6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 70, 40));

        field7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field7ActionPerformed(evt);
            }
        });
        getContentPane().add(field7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 70, 40));

        field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field8ActionPerformed(evt);
            }
        });
        getContentPane().add(field8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 70, 40));

        field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field9ActionPerformed(evt);
            }
        });
        getContentPane().add(field9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 70, 40));

        field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field2ActionPerformed(evt);
            }
        });
        getContentPane().add(field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 70, 40));

        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 140, 50));

        CALCULATE.setText("CALCULATE");
        CALCULATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULATEActionPerformed(evt);
            }
        });
        getContentPane().add(CALCULATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 140, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITERATIONS", "X", "Y", "Z"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 107, 550, 450));
        getContentPane().add(guessy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 310, 40));
        getContentPane().add(guessz, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 310, 40));
        getContentPane().add(guessx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 310, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INITIAL GUESS Y");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 270, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INITIAL GUESS Z");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 270, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INITIAL GUESS X");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GaussSeidel.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MainMenu().setVisible(true);
        dispose();

    }//GEN-LAST:event_backActionPerformed

    private void field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field2ActionPerformed

    private void field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field1ActionPerformed

    private void field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field3ActionPerformed

    private void field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field4ActionPerformed

    private void field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field5ActionPerformed

    private void field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field6ActionPerformed

    private void field7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field7ActionPerformed

    private void field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field8ActionPerformed

    private void field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field9ActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
       // Clear all text fields
    field1.setText("");
    field2.setText("");
    field3.setText("");
    field4.setText("");
    field5.setText("");
    field6.setText("");
    field7.setText("");
    field8.setText("");
    field9.setText("");
    field10.setText("");
    field11.setText("");
    field12.setText("");
    guessx.setText("");
    guessy.setText("");
    guessz.setText("");
    

    // Clear the table
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    }//GEN-LAST:event_CLEARActionPerformed

    private void CALCULATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULATEActionPerformed
        gaussSeidel();
    }//GEN-LAST:event_CALCULATEActionPerformed

    private void field10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field10ActionPerformed

    private void field11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field11ActionPerformed

    private void field12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field12ActionPerformed
private void gaussSeidel() {
    try {
        // Get input values from text fields
        double x1 = Double.parseDouble(guessx.getText());
        double y1 = Double.parseDouble(guessy.getText());
        double z1 = Double.parseDouble(guessz.getText());
        double tolerance = Double.parseDouble(field6.getText());

        // Coefficients from the input fields
        double a1 = Double.parseDouble(field1.getText());
        double b1 = Double.parseDouble(field2.getText());
        double c1 = Double.parseDouble(field3.getText());
        double d1 = Double.parseDouble(field12.getText());

        double a2 = Double.parseDouble(field4.getText());
        double b2 = Double.parseDouble(field5.getText());
        double c2 = Double.parseDouble(field6.getText());
        double d2 = Double.parseDouble(field10.getText());

        double a3 = Double.parseDouble(field7.getText());
        double b3 = Double.parseDouble(field8.getText());
        double c3 = Double.parseDouble(field9.getText());
        double d3 = Double.parseDouble(field11.getText());

        // Initialize table model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the table before populating it

        // Add the initial guesses to the table
        model.addRow(new Object[]{"Initial Guess", x1, y1, z1});

        // Safeguard for maximum iterations to prevent infinite loop
        int maxSafeguardIterations = 10000;

        // Perform Gauss-Seidel iterations
        for (int iteration = 1; iteration <= maxSafeguardIterations; iteration++) {
            double prevX = x1;
            double prevY = y1;
            double prevZ = z1;

            // Calculate new values for x, y, z using the formulas
            x1 = (d1 - b1 * y1 - c1 * z1) / a1;
            y1 = (d2 - a2 * x1 - c2 * z1) / b2;
            z1 = (d3 - a3 * x1 - b3 * y1) / c3;

            // Add the iteration data to the table
            model.addRow(new Object[]{iteration, x1, y1, z1});

            // Check convergence
            double error = Math.max(Math.abs(x1 - prevX), Math.max(Math.abs(y1 - prevY), Math.abs(z1 - prevZ)));
            if (error < tolerance) {
                JOptionPane.showMessageDialog(null, "Convergence reached after " + iteration + " iterations.");
                break;
            }

            // If maximum safeguard iterations are reached
            if (iteration == maxSafeguardIterations) {
                JOptionPane.showMessageDialog(null, "Reached maximum safeguard iterations without convergence.");
                break;
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULATE;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton back;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field10;
    private javax.swing.JTextField field11;
    private javax.swing.JTextField field12;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field4;
    private javax.swing.JTextField field5;
    private javax.swing.JTextField field6;
    private javax.swing.JTextField field7;
    private javax.swing.JTextField field8;
    private javax.swing.JTextField field9;
    private javax.swing.JTextField guessx;
    private javax.swing.JTextField guessy;
    private javax.swing.JTextField guessz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
