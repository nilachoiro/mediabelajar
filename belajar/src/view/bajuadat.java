/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author acer
 */
public class bajuadat extends javax.swing.JFrame {

    /**
     * Creates new form huruf
     */
     JPanel[] panelArraybaju = new JPanel[33];
     JPanel[] panelArraytitle = new JPanel[33];
     JPanel[] panelArrayrumah = new JPanel[33];
    int set = 0;
    AudioInputStream audioIn;
    Clip clip;
playsound play = new playsound();
    public bajuadat() {
        initComponents();
        this.setLocationRelativeTo(this);
        for (int i = 0; i < 33; i++) {
           panelArraybaju[i]=new JPanel(new CardLayout());
           panelArraybaju[i].setOpaque(false);
           panelArraytitle[i]=new JPanel(new CardLayout());
           panelArraytitle[i].setOpaque(false);
           panelArrayrumah[i]=new JPanel(new CardLayout());
           panelArrayrumah[i].setOpaque(false);
        }
        groupbaju.setLayout(new CardLayout());
        grouprumah.setLayout(new CardLayout());
        for (int i = 0; i < 33; i++) {
            //tambah gambar baju
            ImageIcon image = new ImageIcon("aset\\baju\\baju" + (i + 1) + ".png");
            JLabel imagelabel = new JLabel(image);
            panelArraybaju[i].add(imagelabel);
            //tambah gambar rumah
            ImageIcon image3 = new ImageIcon("aset\\baju\\rumah" + (i + 1) + ".png");
            JLabel imagelabel3 = new JLabel(image3);
            panelArrayrumah[i].add(imagelabel3);
            //tambah title provinsi
            ImageIcon image2 = new ImageIcon("aset\\baju\\t" + (i + 1) + ".png");
            JLabel imagelabel2 = new JLabel(image2);
            panelArraytitle[i].add(imagelabel2);
            //memasukan ke panel            
            groupbaju.add(panelArraybaju[i]);
            grouptitle.add(panelArraytitle[i]);
            grouprumah.add(panelArrayrumah[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnbefore = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        groupbaju = new diu.swe.habib.JPanelSlider.JPanelSlider();
        grouprumah = new diu.swe.habib.JPanelSlider.JPanelSlider();
        grouptitle = new diu.swe.habib.JPanelSlider.JPanelSlider();
        no = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbefore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonPrev1.png"))); // NOI18N
        btnbefore.setBorderPainted(false);
        btnbefore.setContentAreaFilled(false);
        btnbefore.setFocusPainted(false);
        btnbefore.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonPrev2.png"))); // NOI18N
        btnbefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeforeActionPerformed(evt);
            }
        });
        getContentPane().add(btnbefore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonNext1.png"))); // NOI18N
        btnnext.setBorderPainted(false);
        btnnext.setContentAreaFilled(false);
        btnnext.setFocusPainted(false);
        btnnext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonNext2.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        getContentPane().add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonHome1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonHome2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 100, -1));

        groupbaju.setBorder(null);
        groupbaju.setOpaque(false);
        getContentPane().add(groupbaju, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 400, 570));

        grouprumah.setBorder(null);
        grouprumah.setOpaque(false);
        getContentPane().add(grouprumah, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 450, 450));

        grouptitle.setBorder(null);
        grouptitle.setOpaque(false);
        getContentPane().add(grouptitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 537, 57));

        no.setFont(new java.awt.Font("Iskoola Pota", 1, 90)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("1");
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, 100));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 660, 130, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroung baju.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeforeActionPerformed
        btnbefore.setEnabled(false);
        set--;
        if (set==-1) {
            set=32;
        }
        groupbaju.nextPanel(25, panelArraybaju[set], groupbaju.right);
        grouptitle.nextPanel(25, panelArraytitle[set], grouptitle.right);
        grouprumah.nextPanel(25, panelArrayrumah[set], grouprumah.right);
        Musik_Play();
        int urut=set+1;
        no.setText(""+urut);
    }//GEN-LAST:event_btnbeforeActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
btnnext.setEnabled(false);
        set++;
        if (set==33) {
            set=0;
        }
        groupbaju.nextPanel(25, panelArraybaju[set], groupbaju.left);
        grouptitle.nextPanel(25, panelArraytitle[set], grouptitle.left);
        grouprumah.nextPanel(25, panelArrayrumah[set], grouprumah.left);
        Musik_Play();
        int urut=set+1;
        no.setText(""+urut);
    }//GEN-LAST:event_btnnextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainmenu a = new mainmenu();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        play.play("aset\\lagu\\lagu"+(set+1)+".ogg");
    }//GEN-LAST:event_jButton2ActionPerformed

public void Musik_Play() {
play a = new play();
        a.start();
    }

    class play extends Thread {
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream("aset\\suara_propinsi\\propinsi"+(set+1)+".mp3");
                Player player = new Player(fileInputStream);
                System.out.println("Song is playing...");
                Thread.sleep(1200);
                player.play();
                btnbefore.setEnabled(true);
                btnnext.setEnabled(true);
                stop();
                System.out.println("aaaaa");
            } catch (JavaLayerException e) {
            } catch (InterruptedException ex) {
            } catch (FileNotFoundException ex) {
                Logger.getLogger(bajuadat.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            java.util.logging.Logger.getLogger(bajuadat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bajuadat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bajuadat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bajuadat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bajuadat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbefore;
    private javax.swing.JButton btnnext;
    private diu.swe.habib.JPanelSlider.JPanelSlider groupbaju;
    private diu.swe.habib.JPanelSlider.JPanelSlider grouprumah;
    private diu.swe.habib.JPanelSlider.JPanelSlider grouptitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel no;
    // End of variables declaration//GEN-END:variables
}
