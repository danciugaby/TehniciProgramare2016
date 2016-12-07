/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonsdemo;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author gabriel.danciu
 */
public class ButtonsDEmo extends javax.swing.JFrame {

    static String birdString = "Bird";
    static String catString = "Cat";
    static String dogString = "Dog";
    static String rabbitString = "Rabbit";
    static String pigString = "Pig";

    /**
     * Creates new form ButtonsDEmo
     */
    public ButtonsDEmo() {
        initComponents();
        buttonGroup.add(jRadioButtonBird);
        buttonGroup.add(jRadioButtonDog);
        buttonGroup.add(jRadioButtonCat);
        buttonGroup.add(jRadioButtonPig);
        buttonGroup.add(jRadioButtonRabbit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanelButtonContainer = new javax.swing.JPanel();
        jRadioButtonBird = new javax.swing.JRadioButton();
        jRadioButtonPig = new javax.swing.JRadioButton();
        jRadioButtonCat = new javax.swing.JRadioButton();
        jRadioButtonRabbit = new javax.swing.JRadioButton();
        jRadioButtonDog = new javax.swing.JRadioButton();
        jLabelImageView = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanelButtonContainer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jRadioButtonBird.setText("Bird");
        jRadioButtonBird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBirdActionPerformed(evt);
            }
        });
        jRadioButtonBird.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButtonBirdKeyPressed(evt);
            }
        });

        jRadioButtonPig.setText("Pig");
        jRadioButtonPig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPigActionPerformed(evt);
            }
        });

        jRadioButtonCat.setText("Cat");
        jRadioButtonCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCatActionPerformed(evt);
            }
        });

        jRadioButtonRabbit.setText("Rabbit");
        jRadioButtonRabbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRabbitActionPerformed(evt);
            }
        });

        jRadioButtonDog.setText("Dog");
        jRadioButtonDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonContainerLayout = new javax.swing.GroupLayout(jPanelButtonContainer);
        jPanelButtonContainer.setLayout(jPanelButtonContainerLayout);
        jPanelButtonContainerLayout.setHorizontalGroup(
            jPanelButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonContainerLayout.createSequentialGroup()
                .addGroup(jPanelButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelButtonContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButtonDog, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelButtonContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonRabbit)
                            .addComponent(jRadioButtonPig)
                            .addComponent(jRadioButtonCat)
                            .addComponent(jRadioButtonBird))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelButtonContainerLayout.setVerticalGroup(
            jPanelButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonContainerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioButtonBird)
                .addGap(12, 12, 12)
                .addComponent(jRadioButtonDog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonPig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonRabbit)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanelButtonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jLabelImageView, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImageView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelButtonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jRadioButtonBirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBirdActionPerformed
       ChangeLabel(evt);
    }//GEN-LAST:event_jRadioButtonBirdActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jRadioButtonPigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPigActionPerformed
        ChangeLabel(evt);
    }//GEN-LAST:event_jRadioButtonPigActionPerformed

    private void jRadioButtonCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCatActionPerformed
        ChangeLabel(evt);       
    }//GEN-LAST:event_jRadioButtonCatActionPerformed

    private void jRadioButtonRabbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRabbitActionPerformed
        ChangeLabel(evt);
    }//GEN-LAST:event_jRadioButtonRabbitActionPerformed

    private void jRadioButtonBirdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButtonBirdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBirdKeyPressed
    private void ChangeLabel(java.awt.event.ActionEvent evt) {
        jLabelImageView.setIcon(createImage("./images/"
                + evt.getActionCommand()
                + ".gif"));
    }

    private static ImageIcon createImage(String path) {
        ImageIcon img = null;
        try {
            img = new ImageIcon(path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return img;
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
            java.util.logging.Logger.getLogger(ButtonsDEmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ButtonsDEmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ButtonsDEmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ButtonsDEmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ButtonsDEmo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabelImageView;
    private javax.swing.JPanel jPanelButtonContainer;
    private javax.swing.JRadioButton jRadioButtonBird;
    private javax.swing.JRadioButton jRadioButtonCat;
    private javax.swing.JRadioButton jRadioButtonDog;
    private javax.swing.JRadioButton jRadioButtonPig;
    private javax.swing.JRadioButton jRadioButtonRabbit;
    // End of variables declaration//GEN-END:variables
}
