
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Simpson extends javax.swing.JFrame {


    public Simpson() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        function = new javax.swing.JTextField();
        segments = new javax.swing.JTextField();
        upperlimit = new javax.swing.JTextField();
        lowerlimit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CLEAR = new javax.swing.JButton();
        CALCULATE = new javax.swing.JButton();
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

        function.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                functionActionPerformed(evt);
            }
        });
        getContentPane().add(function, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 210, 40));

        segments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segmentsActionPerformed(evt);
            }
        });
        getContentPane().add(segments, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 210, 40));

        upperlimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperlimitActionPerformed(evt);
            }
        });
        getContentPane().add(upperlimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, 40));

        lowerlimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerlimitActionPerformed(evt);
            }
        });
        getContentPane().add(lowerlimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("UPPER LIMIT:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 110, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SEGMENTS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("LOWER LIMIT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FUNCTION:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 100, 50));

        CALCULATE.setText("CALCULATE");
        CALCULATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULATEActionPerformed(evt);
            }
        });
        getContentPane().add(CALCULATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simpson.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MainMenu().setVisible(true);
        dispose();

    }//GEN-LAST:event_backActionPerformed

    private void lowerlimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerlimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowerlimitActionPerformed

    private void functionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_functionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_functionActionPerformed

    private void segmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segmentsActionPerformed

    private void upperlimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperlimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperlimitActionPerformed

    private void CALCULATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULATEActionPerformed
      try {
        // Get input values
        String func = function.getText();
        double lowerLimit = Double.parseDouble(lowerlimit.getText());
        double upperLimit = Double.parseDouble(upperlimit.getText());
        int segmentCount;

        if (segments.getText().isEmpty()) {
            // If segment count is not provided, calculate with a default value
            segmentCount = 100; // Default segment count
        } else {
            segmentCount = Integer.parseInt(segments.getText());
            
            // Validate if segment count is even
            if (segmentCount % 2 != 0) {
                JOptionPane.showMessageDialog(null, "Number of segments must be even.");
                return;
            }
        }

        // Perform Simpson's rule calculation
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the table before populating it
        model.setColumnIdentifiers(new Object[]{"Segment", "Result"});

        for (int i = 2; i <= segmentCount; i += 2) { // Increment by 2 to get even segments only
            double result = calculateSimpson(func, lowerLimit, upperLimit, i);
            model.addRow(new Object[]{i, result});
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
    }
   
    }//GEN-LAST:event_CALCULATEActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        // Clear all text fields
        function.setText("");
        lowerlimit.setText("");
        upperlimit.setText("");
        segments.setText("");
    }//GEN-LAST:event_CLEARActionPerformed
  
      private double calculateSimpson(String func, double lowerLimit, double upperLimit, int segmentCount) {
        double h = (upperLimit - lowerLimit) / segmentCount;
        double result = 0;

        try {
            Expression expression = new ExpressionBuilder(func).variable("x").build();

            for (int i = 0; i <= segmentCount; i++) {
                double x = lowerLimit + i * h;
                expression.setVariable("x", x);
                double fx = expression.evaluate();

                if (i == 0 || i == segmentCount) {
                    result += fx;
                } else if (i % 2 == 0) {
                    result += 2 * fx;
                } else {
                    result += 4 * fx;
                }
            }
            result = (h / 3) * result;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error evaluating the function: " + e.getMessage());
        }

        return result;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simpson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULATE;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton back;
    private javax.swing.JTextField function;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lowerlimit;
    private javax.swing.JTextField segments;
    private javax.swing.JTextField upperlimit;
    // End of variables declaration//GEN-END:variables
}
