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
        o = new javax.swing.JButton();
        p = new javax.swing.JButton();
        q = new javax.swing.JButton();
        r = new javax.swing.JButton();
        v = new javax.swing.JButton();
        s = new javax.swing.JButton();
        t = new javax.swing.JButton();
        u = new javax.swing.JButton();
        w = new javax.swing.JButton();
        x = new javax.swing.JButton();
        y = new javax.swing.JButton();
        z = new javax.swing.JButton();
        n = new javax.swing.JButton();
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
        a.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/aa.png"))); // NOI18N
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        group1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 100));

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/b.png"))); // NOI18N
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/bb.png"))); // NOI18N
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        group1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 80, 110));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/c.png"))); // NOI18N
        c.setBorderPainted(false);
        c.setContentAreaFilled(false);
        c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/cc.png"))); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        group1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 80, -1));

        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/d.png"))); // NOI18N
        d.setBorderPainted(false);
        d.setContentAreaFilled(false);
        d.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/dd.png"))); // NOI18N
        d.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/dd.png"))); // NOI18N
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        group1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 80, -1));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/e.png"))); // NOI18N
        e.setBorderPainted(false);
        e.setContentAreaFilled(false);
        e.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/ee.png"))); // NOI18N
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        group1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/f.png"))); // NOI18N
        f.setBorderPainted(false);
        f.setContentAreaFilled(false);
        f.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/ff.png"))); // NOI18N
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        group1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/g.png"))); // NOI18N
        g.setBorderPainted(false);
        g.setContentAreaFilled(false);
        g.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/gg.png"))); // NOI18N
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        group1.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/h.png"))); // NOI18N
        h.setBorderPainted(false);
        h.setContentAreaFilled(false);
        h.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/hh.png"))); // NOI18N
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        group1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/i.png"))); // NOI18N
        i.setBorderPainted(false);
        i.setContentAreaFilled(false);
        i.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/ii.png"))); // NOI18N
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        group1.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/j.png"))); // NOI18N
        j.setBorderPainted(false);
        j.setContentAreaFilled(false);
        j.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/jj.png"))); // NOI18N
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });
        group1.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/k.png"))); // NOI18N
        k.setBorderPainted(false);
        k.setContentAreaFilled(false);
        k.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/kk.png"))); // NOI18N
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        group1.add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/l.png"))); // NOI18N
        l.setBorderPainted(false);
        l.setContentAreaFilled(false);
        l.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/ll.png"))); // NOI18N
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });
        group1.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/m.png"))); // NOI18N
        m.setBorderPainted(false);
        m.setContentAreaFilled(false);
        m.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/mm.png"))); // NOI18N
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        group1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        grouphuruf.add(group1, "card2");

        group2.setOpaque(false);
        group2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/o.png"))); // NOI18N
        o.setBorderPainted(false);
        o.setContentAreaFilled(false);
        o.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/oo.png"))); // NOI18N
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });
        group2.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/p.png"))); // NOI18N
        p.setBorderPainted(false);
        p.setContentAreaFilled(false);
        p.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/pp.png"))); // NOI18N
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        group2.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/q.png"))); // NOI18N
        q.setBorderPainted(false);
        q.setContentAreaFilled(false);
        q.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/qq.png"))); // NOI18N
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });
        group2.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/r.png"))); // NOI18N
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        r.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/rr.png"))); // NOI18N
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        group2.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/v.png"))); // NOI18N
        v.setBorderPainted(false);
        v.setContentAreaFilled(false);
        v.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/vv.png"))); // NOI18N
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });
        group2.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/s.png"))); // NOI18N
        s.setBorderPainted(false);
        s.setContentAreaFilled(false);
        s.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/ss.png"))); // NOI18N
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        group2.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/t.png"))); // NOI18N
        t.setBorderPainted(false);
        t.setContentAreaFilled(false);
        t.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/tt.png"))); // NOI18N
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        group2.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/u.png"))); // NOI18N
        u.setBorderPainted(false);
        u.setContentAreaFilled(false);
        u.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/uu.png"))); // NOI18N
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        group2.add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/w.png"))); // NOI18N
        w.setBorderPainted(false);
        w.setContentAreaFilled(false);
        w.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/ww.png"))); // NOI18N
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });
        group2.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/x.png"))); // NOI18N
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/xx.png"))); // NOI18N
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        group2.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/y.png"))); // NOI18N
        y.setToolTipText("");
        y.setBorderPainted(false);
        y.setContentAreaFilled(false);
        y.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/yy.png"))); // NOI18N
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });
        group2.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/z.png"))); // NOI18N
        z.setBorderPainted(false);
        z.setContentAreaFilled(false);
        z.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/zz.png"))); // NOI18N
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });
        group2.add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/n.png"))); // NOI18N
        n.setBorderPainted(false);
        n.setContentAreaFilled(false);
        n.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/huruf/nn.png"))); // NOI18N
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        group2.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background huruf.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        char huruf = 'd';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        char huruf = 'e';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_eActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        char huruf = 'f';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        char huruf = 'g';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        char huruf = 'h';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_hActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        char huruf = 'i';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_iActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        char huruf = 'j';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_jActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        char huruf = 'k';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_kActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        char huruf = 'l';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_lActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        char huruf = 'm';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_mActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        char huruf = 'n';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_nActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        char huruf = 'o';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_oActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        char huruf = 'p';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_pActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        char huruf = 'q';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_qActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        char huruf = 'r';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_rActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        char huruf = 's';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_sActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        char huruf = 't';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_tActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        char huruf = 'u';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_uActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        char huruf = 'v';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_vActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        char huruf = 'w';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_wActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        char huruf = 'x';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_xActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
       char huruf = 'y';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_yActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        char huruf = 'z';
        play_sound_huruf(huruf);
    }//GEN-LAST:event_zActionPerformed
       
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JButton n;
    private javax.swing.JButton o;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JPanel show;
    private javax.swing.JButton t;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;
    // End of variables declaration//GEN-END:variables
}
