/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

/**
 *
 * @author acer
 */
public class mainmenu extends javax.swing.JFrame {

    /**
     * Creates new form mainmenu
     */
    public mainmenu() {
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

        abc = new javax.swing.JButton();
        bendera = new javax.swing.JButton();
        baju = new javax.swing.JButton();
        angka = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsihuruf.png"))); // NOI18N
        abc.setBorderPainted(false);
        abc.setContentAreaFilled(false);
        abc.setFocusPainted(false);
        abc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsihuruf_HOVER.png"))); // NOI18N
        abc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abcActionPerformed(evt);
            }
        });
        getContentPane().add(abc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 230));

        bendera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsibendera.png"))); // NOI18N
        bendera.setBorderPainted(false);
        bendera.setContentAreaFilled(false);
        bendera.setFocusPainted(false);
        bendera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsibendera_HOVER.png"))); // NOI18N
        bendera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benderaActionPerformed(evt);
            }
        });
        getContentPane().add(bendera, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 250, 240));

        baju.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsibajuadat.png"))); // NOI18N
        baju.setText("t");
        baju.setBorderPainted(false);
        baju.setContentAreaFilled(false);
        baju.setFocusPainted(false);
        baju.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsibajuadat_HOVER.png"))); // NOI18N
        baju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajuActionPerformed(evt);
            }
        });
        getContentPane().add(baju, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 240, 250));

        angka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsiangka.png"))); // NOI18N
        angka.setBorderPainted(false);
        angka.setContentAreaFilled(false);
        angka.setFocusPainted(false);
        angka.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/opsiangka_HOVER.png"))); // NOI18N
        angka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaActionPerformed(evt);
            }
        });
        getContentPane().add(angka, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 260, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/panda.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 240, 240));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_exit.png"))); // NOI18N
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_exit hover.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, 110));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 190, 160));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background menu.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abcActionPerformed
        pilih_huruf a = new pilih_huruf();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_abcActionPerformed

    private void bajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajuActionPerformed
       bajuadat b = new bajuadat();
       b.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bajuActionPerformed

    private void angkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaActionPerformed
       angka c = new angka();
       c.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_angkaActionPerformed

    private void benderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benderaActionPerformed
        negara_bendera a = new negara_bendera();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_benderaActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pilih_warna a = new pilih_warna();
        a.setVisible(true);
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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abc;
    private javax.swing.JButton angka;
    private javax.swing.JLabel background;
    private javax.swing.JButton baju;
    private javax.swing.JButton bendera;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
