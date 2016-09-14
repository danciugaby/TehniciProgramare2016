/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogdemo;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.danciu
 */
public class DialogDemoFrame extends javax.swing.JFrame {

    boolean checkedOnModal;
    String textvalueOnModal;

    /**
     * Creates new form DialogDemoFrame
     */
    public DialogDemoFrame() {
        initComponents();
        checkedOnModal = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogSimple = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPaneDialogs = new javax.swing.JTabbedPane();
        jPanelModal = new javax.swing.JPanel();
        jButtonSimpleD = new javax.swing.JButton();
        jButtonMessage = new javax.swing.JButton();
        jButtonSimpleD1 = new javax.swing.JButton();
        jPanelMore = new javax.swing.JPanel();
        jButtonInfo = new javax.swing.JButton();
        jButtonError = new javax.swing.JButton();
        jButtonOptional = new javax.swing.JButton();
        jButtonInput = new javax.swing.JButton();

        jDialogSimple.setModal(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Check");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogSimpleLayout = new javax.swing.GroupLayout(jDialogSimple.getContentPane());
        jDialogSimple.getContentPane().setLayout(jDialogSimpleLayout);
        jDialogSimpleLayout.setHorizontalGroup(
            jDialogSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSimpleLayout.createSequentialGroup()
                .addGroup(jDialogSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogSimpleLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jCheckBox1))
                    .addGroup(jDialogSimpleLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jDialogSimpleLayout.setVerticalGroup(
            jDialogSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogSimpleLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSimpleD.setText("Show Modal");
        jButtonSimpleD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpleDActionPerformed(evt);
            }
        });

        jButtonMessage.setText("Simple Message");
        jButtonMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMessageActionPerformed(evt);
            }
        });

        jButtonSimpleD1.setText("Show AModal");
        jButtonSimpleD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpleD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelModalLayout = new javax.swing.GroupLayout(jPanelModal);
        jPanelModal.setLayout(jPanelModalLayout);
        jPanelModalLayout.setHorizontalGroup(
            jPanelModalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelModalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSimpleD1)
                    .addComponent(jButtonSimpleD))
                .addGap(35, 35, 35)
                .addComponent(jButtonMessage)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanelModalLayout.setVerticalGroup(
            jPanelModalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpleD)
                    .addComponent(jButtonMessage))
                .addGap(18, 18, 18)
                .addComponent(jButtonSimpleD1)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jButtonSimpleD.getAccessibleContext().setAccessibleName("jButtonSimple");

        jTabbedPaneDialogs.addTab("Modal Dialogs", jPanelModal);

        jButtonInfo.setLabel("Info");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });

        jButtonError.setLabel("Error");
        jButtonError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonErrorActionPerformed(evt);
            }
        });

        jButtonOptional.setLabel("Options message");
        jButtonOptional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionalActionPerformed(evt);
            }
        });

        jButtonInput.setText("Get input");
        jButtonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMoreLayout = new javax.swing.GroupLayout(jPanelMore);
        jPanelMore.setLayout(jPanelMoreLayout);
        jPanelMoreLayout.setHorizontalGroup(
            jPanelMoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInfo)
                    .addComponent(jButtonError)
                    .addComponent(jButtonOptional)
                    .addComponent(jButtonInput))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanelMoreLayout.setVerticalGroup(
            jPanelMoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonError)
                .addGap(18, 18, 18)
                .addComponent(jButtonOptional)
                .addGap(18, 18, 18)
                .addComponent(jButtonInput)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jButtonInfo.getAccessibleContext().setAccessibleName("Informative");
        jButtonError.getAccessibleContext().setAccessibleName("Error");

        jTabbedPaneDialogs.addTab("More Dialogs", jPanelMore);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPaneDialogs, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneDialogs, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPaneDialogs.getAccessibleContext().setAccessibleName("Modal Dialogs");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMessageActionPerformed
        JOptionPane.showMessageDialog(this, "Just a simple messaje.");
    }//GEN-LAST:event_jButtonMessageActionPerformed

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        JOptionPane.showMessageDialog(this,
                "Warning message", "Optional info", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonErrorActionPerformed
        JOptionPane.showMessageDialog(this,
                "Error message sample", "Inner error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtonErrorActionPerformed

    private void jButtonOptionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionalActionPerformed
        Object[] options = {"Yes, option A",
            "No, option B",
            "Maybe, option C",
            "None of the above!"};
        int n = JOptionPane.showOptionDialog(this,
                "Would you like A , B or C?",
                "A Silly Question",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[3]);
        JOptionPane.showMessageDialog(this,
                "Ok you chose " + options[n].toString(), "Options", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButtonOptionalActionPerformed

    private void jButtonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInputActionPerformed
        Object[] possibilities = {"A", "B", "C"};
        String s = (String) JOptionPane.showInputDialog(
                this,
                "Choose wisely:\n"
                + "\"...\"",
                "Customized Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "A");

//If a string was returned, say so.
        if ((s != null) && (s.length() > 0)) {
            System.out.println(s);
            return;
        }

//If you're here, the return value was null/empty.
        System.out.println("Come on, pick one!");
    }//GEN-LAST:event_jButtonInputActionPerformed

    private void jButtonSimpleDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpleDActionPerformed
        jDialogSimple.setSize(400, 300);
        jDialogSimple.show();

    }//GEN-LAST:event_jButtonSimpleDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialogSimple.setModal(true);
        jDialogSimple.setVisible(false);

        System.out.println(checkedOnModal);
        System.out.println(textvalueOnModal);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        checkedOnModal = jCheckBox1.isSelected();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        textvalueOnModal = jTextArea1.getText();
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialogSimple.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSimpleD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpleD1ActionPerformed
        jDialogSimple.setModal(false);
        jDialogSimple.setVisible(true);
    }//GEN-LAST:event_jButtonSimpleD1ActionPerformed

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
            java.util.logging.Logger.getLogger(DialogDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogDemoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonError;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInput;
    private javax.swing.JButton jButtonMessage;
    private javax.swing.JButton jButtonOptional;
    private javax.swing.JButton jButtonSimpleD;
    private javax.swing.JButton jButtonSimpleD1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialogSimple;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelModal;
    private javax.swing.JPanel jPanelMore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneDialogs;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}