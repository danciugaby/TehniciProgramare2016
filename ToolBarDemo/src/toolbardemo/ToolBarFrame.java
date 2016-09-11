/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbardemo;

import javax.swing.JPanel;

/**
 *
 * @author gabriel.danciu
 */
public class ToolBarFrame extends javax.swing.JFrame {

    /**
     * Creates new form ToolBarFrame
     */
    public ToolBarFrame() {
        initComponents();
        jPanel1.removeAll();
        jPanel1.setSize(400,300);
        jPanel1.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarSample = new javax.swing.JToolBar();
        jButtonFirst = new javax.swing.JButton();
        jButtonSecond = new javax.swing.JButton();
        jButtonThird = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        firstPanel1 = new toolbardemo.FirstPanel();
        secondPanel1 = new toolbardemo.SecondPanel();
        thirdPanel1 = new toolbardemo.ThirdPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jToolBarSample.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBarSample.setAlignmentY(1.0F);

        jButtonFirst.setText("FirstAction");
        jButtonFirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonFirst.setFocusable(false);
        jButtonFirst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFirst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstActionPerformed(evt);
            }
        });
        jToolBarSample.add(jButtonFirst);

        jButtonSecond.setText("SecondAction");
        jButtonSecond.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSecond.setFocusable(false);
        jButtonSecond.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSecond.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecondActionPerformed(evt);
            }
        });
        jToolBarSample.add(jButtonSecond);

        jButtonThird.setText("ThirdAction");
        jButtonThird.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonThird.setFocusable(false);
        jButtonThird.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThird.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonThird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThirdActionPerformed(evt);
            }
        });
        jToolBarSample.add(jButtonThird);

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(firstPanel1, "card2");
        jPanel1.add(secondPanel1, "card3");
        jPanel1.add(thirdPanel1, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBarSample, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBarSample, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstActionPerformed
        
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(firstPanel1);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jButtonFirstActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void jButtonSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSecondActionPerformed
          jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(secondPanel1);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jButtonSecondActionPerformed

    private void jButtonThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThirdActionPerformed
          jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(thirdPanel1);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jButtonThirdActionPerformed

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
            java.util.logging.Logger.getLogger(ToolBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToolBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToolBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToolBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToolBarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private toolbardemo.FirstPanel firstPanel1;
    private javax.swing.JButton jButtonFirst;
    private javax.swing.JButton jButtonSecond;
    private javax.swing.JButton jButtonThird;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBarSample;
    private toolbardemo.SecondPanel secondPanel1;
    private toolbardemo.ThirdPanel thirdPanel1;
    // End of variables declaration//GEN-END:variables
}
