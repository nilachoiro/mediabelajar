/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.view;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class huruf extends javax.swing.JFrame {

    /**
     * Creates new form huruf
     */
    AudioInputStream audioIn;
    Clip clip;

    public huruf() {
        initComponents();
        btnbefore.setVisible(false);
        btnok.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grouphuruf = new diu.swe.habib.JPanelSlider.JPanelSlider();
        group1 = new javax.swing.JPanel();
        a = new javax.swing.JButton();
        b = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        e = new javax.swing.JButton();
        f = new javax.swing.JButton();
        g = new javax.swing.JButton();
        h = new javax.swing.JButton();
        i = new javax.swing.JButton();
        j = new javax.swing.JButton();
        k = new javax.swing.JButton();
        l = new javax.swing.JButton();
        m = new javax.swing.JButton();
        group2 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        show = new javax.swing.JPanel();
        btnbefore = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grouphuruf.setBorder(null);
        grouphuruf.setOpaque(false);

        group1.setOpaque(false);
        group1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/a.png"))); // NOI18N
        a.setBorderPainted(false);
        a.setContentAreaFilled(false);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        group1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 100));

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/b.png"))); // NOI18N
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        group1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 80, 110));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/c.png"))); // NOI18N
        c.setBorderPainted(false);
        c.setContentAreaFilled(false);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        group1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 80, -1));

        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/d.png"))); // NOI18N
        d.setBorderPainted(false);
        d.setContentAreaFilled(false);
        group1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 80, -1));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/e.png"))); // NOI18N
        e.setBorderPainted(false);
        e.setContentAreaFilled(false);
        group1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/f.png"))); // NOI18N
        f.setBorderPainted(false);
        f.setContentAreaFilled(false);
        group1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/g.png"))); // NOI18N
        g.setBorderPainted(false);
        g.setContentAreaFilled(false);
        group1.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/h.png"))); // NOI18N
        h.setBorderPainted(false);
        h.setContentAreaFilled(false);
        group1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/i.png"))); // NOI18N
        i.setBorderPainted(false);
        i.setContentAreaFilled(false);
        group1.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/j.png"))); // NOI18N
        j.setBorderPainted(false);
        j.setContentAreaFilled(false);
        group1.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/k.png"))); // NOI18N
        k.setBorderPainted(false);
        k.setContentAreaFilled(false);
        group1.add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/l.png"))); // NOI18N
        l.setBorderPainted(false);
        l.setContentAreaFilled(false);
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });
        group1.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/m.png"))); // NOI18N
        m.setBorderPainted(false);
        m.setContentAreaFilled(false);
        group1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        grouphuruf.add(group1, "card2");

        group2.setOpaque(false);
        group2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/o.png"))); // NOI18N
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        group2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/p.png"))); // NOI18N
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        group2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/q.png"))); // NOI18N
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        group2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/r.png"))); // NOI18N
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        group2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/v.png"))); // NOI18N
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        group2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/s.png"))); // NOI18N
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        group2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/t.png"))); // NOI18N
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        group2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/u.png"))); // NOI18N
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        group2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/w.png"))); // NOI18N
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        group2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/x.png"))); // NOI18N
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        group2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/y.png"))); // NOI18N
        jButton25.setToolTipText("");
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        group2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/z.png"))); // NOI18N
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        group2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/n.png"))); // NOI18N
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        group2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        grouphuruf.add(group2, "card2");

        show.setOpaque(false);
        grouphuruf.add(show, "card4");

        getContentPane().add(grouphuruf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 830, 380));

        btnbefore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonPrev1.png"))); // NOI18N
        btnbefore.setBorderPainted(false);
        btnbefore.setContentAreaFilled(false);
        btnbefore.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonPrev2.png"))); // NOI18N
        btnbefore.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonPrev2.png"))); // NOI18N
        btnbefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeforeActionPerformed(evt);
            }
        });
        getContentPane().add(btnbefore, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonNext1.png"))); // NOI18N
        btnnext.setBorderPainted(false);
        btnnext.setContentAreaFilled(false);
        btnnext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonNext2.png"))); // NOI18N
        btnnext.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonNext2.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        getContentPane().add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, -1, -1));

        btnok.setText("ok");
        getContentPane().add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background huruf.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void btnbeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeforeActionPerformed
        grouphuruf.nextPanel(50, group1, grouphuruf.right);
        btnnext.setVisible(true);
        btnbefore.setVisible(false);

    }//GEN-LAST:event_btnbeforeActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        grouphuruf.nextPanel(50, group2, grouphuruf.left);
        btnbefore.setVisible(true);
        btnnext.setVisible(false);

    }//GEN-LAST:event_btnnextActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainmenu a = new mainmenu();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        char huruf = 'a';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        char huruf = 'b';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        char huruf = 'c';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_cActionPerformed
    public void play_sound_huruf(char huruf) {
        try {
            audioIn = AudioSystem.getAudioInputStream(new File("src\\suara_huruf\\" + huruf + ".wav"));
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
            java.util.logging.Logger.getLogger(huruf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(huruf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(huruf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(huruf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new huruf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton btnbefore;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnok;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JPanel group1;
    private javax.swing.JPanel group2;
    private diu.swe.habib.JPanelSlider.JPanelSlider grouphuruf;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JButton j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JPanel show;
    // End of variables declaration//GEN-END:variables
}
