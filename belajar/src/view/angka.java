/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class angka extends javax.swing.JFrame {

    /**
     * Creates new form huruf
     */
    AudioInputStream audioIn;
    Clip clip;
    public angka() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        grouphuruf = new diu.swe.habib.JPanelSlider.JPanelSlider();
        group1 = new javax.swing.JPanel();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c0 = new javax.swing.JButton();
        show = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonHome1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonHome2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 100, -1));

        grouphuruf.setBorder(null);
        grouphuruf.setOpaque(false);

        group1.setOpaque(false);
        group1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c1.png"))); // NOI18N
        c1.setBorderPainted(false);
        c1.setContentAreaFilled(false);
        c1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c1_hover.png"))); // NOI18N
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        group1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 200, 220));

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c2.png"))); // NOI18N
        c2.setBorderPainted(false);
        c2.setContentAreaFilled(false);
        c2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c2_hover.png"))); // NOI18N
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        group1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 200, 220));

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c3.png"))); // NOI18N
        c3.setBorderPainted(false);
        c3.setContentAreaFilled(false);
        c3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c3_hover.png"))); // NOI18N
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        group1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 200, 220));

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c4.png"))); // NOI18N
        c4.setBorderPainted(false);
        c4.setContentAreaFilled(false);
        c4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c4_hover.png"))); // NOI18N
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        group1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 250));

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c5.png"))); // NOI18N
        c5.setBorderPainted(false);
        c5.setContentAreaFilled(false);
        c5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c5_hover.png"))); // NOI18N
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        group1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 220, 240));

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c6.png"))); // NOI18N
        c6.setBorderPainted(false);
        c6.setContentAreaFilled(false);
        c6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c6_hover.png"))); // NOI18N
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        group1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 210, 210));

        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c7.png"))); // NOI18N
        c7.setBorderPainted(false);
        c7.setContentAreaFilled(false);
        c7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c7_hover.png"))); // NOI18N
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        group1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 200, 250));

        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c8.png"))); // NOI18N
        c8.setBorderPainted(false);
        c8.setContentAreaFilled(false);
        c8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c8_hover.png"))); // NOI18N
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });
        group1.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 200, 200));

        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c9.png"))); // NOI18N
        c9.setBorderPainted(false);
        c9.setContentAreaFilled(false);
        c9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c9_hover.png"))); // NOI18N
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });
        group1.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 210, 250));

        c0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c0.png"))); // NOI18N
        c0.setBorderPainted(false);
        c0.setContentAreaFilled(false);
        c0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/angka/c0_hover.png"))); // NOI18N
        c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0ActionPerformed(evt);
            }
        });
        group1.add(c0, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -10, 210, 220));

        grouphuruf.add(group1, "card3");

        show.setOpaque(false);
        grouphuruf.add(show, "card4");

        getContentPane().add(grouphuruf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1000, 690));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rumputlaut1.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 150, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rumputlaut1.gif"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 150, 180));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rumputlaut1.gif"))); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 580, 150, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgangka.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0ActionPerformed
        char huruf = '0';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainmenu a = new mainmenu();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        char huruf = '1';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        char huruf = '2';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        char huruf = '3';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        char huruf = '4';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        char huruf = '5';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        char huruf = '6';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        char huruf = '7';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        char huruf = '8';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c8ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
        char huruf = '9';
        play_sound_angka(huruf);
    }//GEN-LAST:event_c9ActionPerformed
 public void play_sound_angka(char angka) {
        try {
            audioIn = AudioSystem.getAudioInputStream(new File("aset\\suara_angka\\" + angka + ".wav"));
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
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
            java.util.logging.Logger.getLogger(angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new angka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c0;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JPanel group1;
    private diu.swe.habib.JPanelSlider.JPanelSlider grouphuruf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel show;
    // End of variables declaration//GEN-END:variables
}
