
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class FalsePositionMethod extends javax.swing.JFrame {

 
    public FalsePositionMethod() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MaxIterations = new javax.swing.JTextField();
        InitialGuess2 = new javax.swing.JTextField();
        InitialGuess1 = new javax.swing.JTextField();
        Function = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        solve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        roottxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(MaxIterations, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 330, 30));

        InitialGuess2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitialGuess2ActionPerformed(evt);
            }
        });
        getContentPane().add(InitialGuess2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 330, 30));
        getContentPane().add(InitialGuess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 330, 30));

        Function.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FunctionActionPerformed(evt);
            }
        });
        getContentPane().add(Function, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 330, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MAX ITERATIONS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INITIAL GUESS 2:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 140, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FUNCTION:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INITIAL GUESS 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, 30));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 150, 40));

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 150, 40));

        solve.setText("CALCULATE");
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });
        getContentPane().add(solve, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITERATIONS", "X0", "X1", "X2", "F(X0)", "F(X1)", "F(X2)"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 880, 290));
        getContentPane().add(roottxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/False Position.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InitialGuess2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitialGuess2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InitialGuess2ActionPerformed

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveActionPerformed
 try {
        double initialGuess1 = Double.parseDouble(InitialGuess1.getText());
        double initialGuess2 = Double.parseDouble(InitialGuess2.getText());
        int maxIterations = Integer.parseInt(MaxIterations.getText());
        String functionString = Function.getText().trim();

        if (functionString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a function.");
            return;
        }

        ExpressionBuilder expressionBuilder = new ExpressionBuilder(functionString);
        Expression function = expressionBuilder.variable("x").build();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the table before populating it

        double a = initialGuess1;
        double b = initialGuess2;
        double fa = function.setVariable("x", a).evaluate();
        double fb = function.setVariable("x", b).evaluate();

        if (Math.signum(fa) * Math.signum(fb) > 0) {
            JOptionPane.showMessageDialog(null, "The function has the same sign at both ends. False position method cannot be applied.");
            return;
        }

        int iteration = 0;
        boolean rootFound = false;
        while (iteration < maxIterations) {
            double c = (a * fb - b * fa) / (fb - fa);
            double fc = function.setVariable("x", c).evaluate();

            model.addRow(new Object[] {iteration + 1, a, b, c, fa, fb, String.format("%.10f", fc)});

            if (Math.abs(fc) < 1e-6) {
                roottxt.setText("ROOT: " + c); // Update the label with the root value
                rootFound = true;
                break;
            }

            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }

            iteration++;
        }

        if (!rootFound) {
            roottxt.setText("");
            JOptionPane.showMessageDialog(null, "Root not found within the specified number of iterations.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
    }
    }//GEN-LAST:event_solveActionPerformed

    private void FunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FunctionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FunctionActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MainMenu().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_backActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
     // Clear the text fields
    Function.setText("");
    InitialGuess1.setText("");
    InitialGuess2.setText("");
    MaxIterations.setText("");

    // Clear the table
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    // Clear the root label
    roottxt.setText("");
    }//GEN-LAST:event_clearActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Function;
    private javax.swing.JTextField InitialGuess1;
    private javax.swing.JTextField InitialGuess2;
    private javax.swing.JTextField MaxIterations;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel roottxt;
    private javax.swing.JButton solve;
    // End of variables declaration//GEN-END:variables
}
