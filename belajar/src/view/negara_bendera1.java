/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author acer
 */
public class negara_bendera1 extends javax.swing.JFrame {

    /**
     * Creates new form negara_bendera
     */
    public negara_bendera1() {
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

        afrika = new javax.swing.JLabel();
        amerika = new javax.swing.JLabel();
        eropa = new javax.swing.JLabel();
        australia = new javax.swing.JLabel();
        asia = new javax.swing.JLabel();
        panelutama = new diu.swe.habib.JPanelSlider.JPanelSlider();
        world = new javax.swing.JPanel();
        btnamerika = new javax.swing.JButton();
        btnaustralia = new javax.swing.JButton();
        btnasia = new javax.swing.JButton();
        btneropa = new javax.swing.JButton();
        btnafrika = new javax.swing.JButton();
        worlderopa = new javax.swing.JPanel();
        eropautara = new javax.swing.JButton();
        eropatimur = new javax.swing.JButton();
        eropabarat = new javax.swing.JButton();
        eropatengah = new javax.swing.JButton();
        eropaselatan = new javax.swing.JButton();
        worldafrika = new javax.swing.JPanel();
        afrikautara = new javax.swing.JButton();
        afrikatimur = new javax.swing.JButton();
        afrikabarat = new javax.swing.JButton();
        afrikatengah = new javax.swing.JButton();
        afrikaselatan = new javax.swing.JButton();
        worldaustralia = new javax.swing.JPanel();
        worldasia = new javax.swing.JPanel();
        asiatenggara = new javax.swing.JButton();
        asiatimur = new javax.swing.JButton();
        asiabarat = new javax.swing.JButton();
        asiatengah = new javax.swing.JButton();
        asiaselatan = new javax.swing.JButton();
        worldamerika = new javax.swing.JPanel();
        amerikautara = new javax.swing.JButton();
        amerikatengah = new javax.swing.JButton();
        amerikaselatan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        afrika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAfrika1.png"))); // NOI18N
        getContentPane().add(afrika, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 330));

        amerika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAmerika1.png"))); // NOI18N
        getContentPane().add(amerika, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 410, 480));

        eropa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaEropa1.png"))); // NOI18N
        getContentPane().add(eropa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 250));

        australia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAustralia1.png"))); // NOI18N
        getContentPane().add(australia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 270, 210));

        asia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAsia1.png"))); // NOI18N
        getContentPane().add(asia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 390, 320));

        world.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnamerika.setBorderPainted(false);
        btnamerika.setContentAreaFilled(false);
        btnamerika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnamerikaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnamerikaMouseExited(evt);
            }
        });
        world.add(btnamerika, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 210, 410));

        btnaustralia.setBorderPainted(false);
        btnaustralia.setContentAreaFilled(false);
        btnaustralia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnaustraliaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnaustraliaMouseExited(evt);
            }
        });
        world.add(btnaustralia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 280, 140));

        btnasia.setBorderPainted(false);
        btnasia.setContentAreaFilled(false);
        btnasia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnasiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnasiaMouseExited(evt);
            }
        });
        world.add(btnasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 290, 260));

        btneropa.setBorderPainted(false);
        btneropa.setContentAreaFilled(false);
        btneropa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneropaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneropaMouseExited(evt);
            }
        });
        world.add(btneropa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 120));

        btnafrika.setBorderPainted(false);
        btnafrika.setContentAreaFilled(false);
        btnafrika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnafrikaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnafrikaMouseExited(evt);
            }
        });
        world.add(btnafrika, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, 220));

        panelutama.add(world, "card2");

        worlderopa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eropautara.setText("eropa utara");
        eropautara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eropautaraActionPerformed(evt);
            }
        });
        worlderopa.add(eropautara, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        eropatimur.setText("eropa timur");
        worlderopa.add(eropatimur, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, -1, -1));

        eropabarat.setText("eropa barat");
        worlderopa.add(eropabarat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        eropatengah.setText("eropa tengah");
        worlderopa.add(eropatengah, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        eropaselatan.setText("eropa selatan");
        worlderopa.add(eropaselatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        panelutama.add(worlderopa, "card3");

        worldafrika.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        afrikautara.setText("afrika utara");
        worldafrika.add(afrikautara, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        afrikatimur.setText("afrika timur");
        worldafrika.add(afrikatimur, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, -1, -1));

        afrikabarat.setText("afrika barat");
        worldafrika.add(afrikabarat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        afrikatengah.setText("afrika tengah");
        worldafrika.add(afrikatengah, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        afrikaselatan.setText("afrika selatan");
        worldafrika.add(afrikaselatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        panelutama.add(worldafrika, "card3");

        worldaustralia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelutama.add(worldaustralia, "card3");

        worldasia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asiatenggara.setText("asia tengara");
        worldasia.add(asiatenggara, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        asiatimur.setText("asia timur");
        worldasia.add(asiatimur, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));

        asiabarat.setText("asia barat");
        worldasia.add(asiabarat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        asiatengah.setText("asia tengah");
        worldasia.add(asiatengah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        asiaselatan.setText("asia selatan");
        worldasia.add(asiaselatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        panelutama.add(worldasia, "card3");

        worldamerika.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        amerikautara.setText("amerika utara");
        worldamerika.add(amerikautara, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        amerikatengah.setText("amerika tengah");
        worldamerika.add(amerikatengah, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        amerikaselatan.setText("amerika selatan");
        worldamerika.add(amerikaselatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        panelutama.add(worldamerika, "card3");

        getContentPane().add(panelutama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneropaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneropaMouseEntered
        eropa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaEropa2.png")));
    }//GEN-LAST:event_btneropaMouseEntered

    private void btneropaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneropaMouseExited
        eropa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaEropa1.png")));
    }//GEN-LAST:event_btneropaMouseExited

    private void btnafrikaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnafrikaMouseEntered
        afrika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAfrika2.png")));
    }//GEN-LAST:event_btnafrikaMouseEntered

    private void btnafrikaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnafrikaMouseExited
        afrika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAfrika1.png")));
    }//GEN-LAST:event_btnafrikaMouseExited

    private void btnasiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnasiaMouseEntered
         asia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAsia2.png")));
    }//GEN-LAST:event_btnasiaMouseEntered

    private void btnasiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnasiaMouseExited
        asia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAsia1.png")));
    }//GEN-LAST:event_btnasiaMouseExited

    private void btnamerikaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnamerikaMouseEntered
        amerika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAmerika2.png")));
    }//GEN-LAST:event_btnamerikaMouseEntered

    private void btnamerikaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnamerikaMouseExited
        amerika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAmerika1.png")));
    }//GEN-LAST:event_btnamerikaMouseExited

    private void btnaustraliaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaustraliaMouseEntered
        australia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAustralia2.png")));
    }//GEN-LAST:event_btnaustraliaMouseEntered

    private void btnaustraliaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaustraliaMouseExited
        australia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonBenuaAustralia1.png")));
    }//GEN-LAST:event_btnaustraliaMouseExited

    private void eropautaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eropautaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eropautaraActionPerformed

    public void setmap(String lokasi){
String directory = "aset\\bendera_jpg\\afrika\\afrikautara";
tampil_bendera1 a = new tampil_bendera1(directory);
a.setVisible(true);
    
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
            java.util.logging.Logger.getLogger(negara_bendera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(negara_bendera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(negara_bendera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(negara_bendera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new negara_bendera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afrika;
    private javax.swing.JButton afrikabarat;
    private javax.swing.JButton afrikaselatan;
    private javax.swing.JButton afrikatengah;
    private javax.swing.JButton afrikatimur;
    private javax.swing.JButton afrikautara;
    private javax.swing.JLabel amerika;
    private javax.swing.JButton amerikaselatan;
    private javax.swing.JButton amerikatengah;
    private javax.swing.JButton amerikautara;
    private javax.swing.JLabel asia;
    private javax.swing.JButton asiabarat;
    private javax.swing.JButton asiaselatan;
    private javax.swing.JButton asiatengah;
    private javax.swing.JButton asiatenggara;
    private javax.swing.JButton asiatimur;
    private javax.swing.JLabel australia;
    private javax.swing.JButton btnafrika;
    private javax.swing.JButton btnamerika;
    private javax.swing.JButton btnasia;
    private javax.swing.JButton btnaustralia;
    private javax.swing.JButton btneropa;
    private javax.swing.JLabel eropa;
    private javax.swing.JButton eropabarat;
    private javax.swing.JButton eropaselatan;
    private javax.swing.JButton eropatengah;
    private javax.swing.JButton eropatimur;
    private javax.swing.JButton eropautara;
    private diu.swe.habib.JPanelSlider.JPanelSlider panelutama;
    private javax.swing.JPanel world;
    private javax.swing.JPanel worldafrika;
    private javax.swing.JPanel worldamerika;
    private javax.swing.JPanel worldasia;
    private javax.swing.JPanel worldaustralia;
    private javax.swing.JPanel worlderopa;
    // End of variables declaration//GEN-END:variables
}
