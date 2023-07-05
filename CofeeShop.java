/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cofeeshop;

/**
 *
 * @author philip
 */


   public class CofeeShop extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public CofeeShop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radCOFFEE = new javax.swing.JRadioButton();
        radCAP = new javax.swing.JRadioButton();
        radTEA = new javax.swing.JRadioButton();
        chkBAG = new javax.swing.JCheckBox();
        chkCRO = new javax.swing.JCheckBox();
        chkTOA = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSub = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTax = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtTot = new javax.swing.JTextPane();
        btnENTER = new javax.swing.JButton();
        btnCLEAR = new javax.swing.JButton();
        btnEXIT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQua1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQua3 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtQua2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("COFFEE SHOP");

        radCOFFEE.setText("COFFEE - PHP 50");
        radCOFFEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCOFFEEActionPerformed(evt);
            }
        });

        radCAP.setText("CAPPUCINO- PHP 75");
        radCAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCAPActionPerformed(evt);
            }
        });

        radTEA.setText("TEA -PHP 50");
        radTEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTEAActionPerformed(evt);
            }
        });

        chkBAG.setText("BAGELS - PHP 75");

        chkCRO.setText("CROISSANT- PHP 50");
        chkCRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCROActionPerformed(evt);
            }
        });

        chkTOA.setText("TOAST- PHP 75");
        chkTOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTOAActionPerformed(evt);
            }
        });

        jLabel2.setText("Subtotal");

        jLabel3.setText("Tax");

        jLabel4.setText("Total");

        jScrollPane4.setViewportView(txtSub);

        jScrollPane5.setViewportView(txtTax);

        jScrollPane6.setViewportView(txtTot);

        btnENTER.setText("ENTER");
        btnENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnENTERActionPerformed(evt);
            }
        });

        btnCLEAR.setText("CLEAR");
        btnCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLEARActionPerformed(evt);
            }
        });

        btnEXIT.setText("EXIT");
        btnEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXITActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtQua1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Quantity");

        jScrollPane2.setViewportView(txtQua3);

        jScrollPane3.setViewportView(txtQua2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radCAP)
                            .addComponent(radTEA)
                            .addComponent(radCOFFEE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCRO)
                            .addComponent(chkBAG)
                            .addComponent(chkTOA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(btnENTER))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnCLEAR)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radCOFFEE)
                        .addComponent(chkBAG))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radCAP)
                            .addComponent(chkCRO))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radTEA))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(chkTOA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnENTER)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCLEAR)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEXIT)
                        .addComponent(jLabel4)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void radCOFFEEActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // selects coffee option
        if(radCOFFEE.isSelected())
            radCAP.setSelected(false);
            radTEA.setSelected(false);
    }                                         

    private void radCAPActionPerformed(java.awt.event.ActionEvent evt) {                                       
       //select cap
       
       if(radCAP.isSelected())
            radCOFFEE.setSelected(false);
            radTEA.setSelected(false);
       
       
    }                                      

    private void radTEAActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //  Select Tea Option
        
        if(radTEA.isSelected())
            radCAP.setSelected(false);
            radCOFFEE.setSelected(false);
            chkBAG.setSelected(false);
            chkCRO.setSelected(false);
            chkTOA.setSelected(false);
            
            txtTot.setText("");
            txtSub.setText("");
            txtTot.setText("");
    }                                      

    private void chkCROActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnENTERActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        double  total;
        double subtotal=0;
        final double TAXRATE= .01;
        double tax;
        double quantity=1;
        
        if(radCOFFEE.isSelected()) {
            subtotal= subtotal+50; } 
        else if (radCAP.isSelected()) {
            subtotal= subtotal+75;
            
        }else if (radTEA.isSelected()) {
            subtotal= subtotal+50;
            
        }
        if(chkBAG.isSelected()) {
           quantity=Double.parseDouble(txtQua1.getText());
          
         subtotal= subtotal+75*quantity; }
        if(chkCRO.isSelected()) {
            quantity=Double.parseDouble(txtQua2.getText());
             subtotal= subtotal+50*quantity;}
        if(chkTOA.isSelected()) {
            quantity=Double.parseDouble(txtQua3.getText());
             subtotal= subtotal+75*quantity;}   
        
        txtSub.setText(Double.toString(subtotal));
        subtotal=Double.parseDouble(txtSub.getText());
        tax= subtotal*TAXRATE;
        total= tax+subtotal;
        
        txtTax.setText(Double.toString(tax));
        txtTot.setText(Double.toString(total));
        
    }                                        

    private void btnEXITActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // exits
        
        System.exit(0);
        
    }                                       

    private void btnCLEARActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Clears everything 
        
        radCOFFEE.setSelected(false);
        radCAP.setSelected(false);
        radTEA.setSelected(false);
        chkBAG.setSelected(false);
        chkCRO.setSelected(false);
        chkTOA.setSelected(false);
        txtTot.setText("");
        txtSub.setText("");
        txtTax.setText("");
        txtQua1.setText("");
        txtQua2.setText("");
        txtQua3.setText("");
        
        
        
        
        
        
        
    }                                        

    private void chkTOAActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CofeeShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCLEAR;
    private javax.swing.JButton btnENTER;
    private javax.swing.JButton btnEXIT;
    private javax.swing.JCheckBox chkBAG;
    private javax.swing.JCheckBox chkCRO;
    private javax.swing.JCheckBox chkTOA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JRadioButton radCAP;
    private javax.swing.JRadioButton radCOFFEE;
    private javax.swing.JRadioButton radTEA;
    private javax.swing.JTextPane txtQua1;
    private javax.swing.JTextPane txtQua2;
    private javax.swing.JTextPane txtQua3;
    private javax.swing.JTextPane txtSub;
    private javax.swing.JTextPane txtTax;
    private javax.swing.JTextPane txtTot;
    // End of variables declaration                   
}

    

