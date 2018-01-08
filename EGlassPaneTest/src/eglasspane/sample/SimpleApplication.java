/*
 * SimpleApplication.java
 *
 * Created on 08 Juli 2008, 4:58
 */
package eglasspane.sample;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.table.DefaultTableModel;
import open.usu.awt.util.GraphicUtilities;
import open.usu.swing.ImageTransition;
import open.usu.swing.event.TransitionEvent;
import open.usu.swing.event.TransitionListener;

/**
 *
 * @author  usu
 */
public class SimpleApplication extends javax.swing.JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private DefaultTableModel model;
    private BufferedImage image;
    private TransitionListener adapterAdd,  adapterReset;

    /** Creates new form SimpleApplication */
    public SimpleApplication() {
        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Website");

        initComponents();
        pack();

        table.setModel(model);
        image = new BufferedImage(panelMain.getWidth(), panelMain.getHeight(), BufferedImage.TYPE_INT_ARGB);

        adapterAdd = new TransitionListener() {

            private Object[] obj;

            public void onStart(TransitionEvent event) {
                obj = new Object[]{textName.getText(), textEmail.getText(), textWebsite.getText()};
                reset();
            }

            public void onFinish(TransitionEvent event) {
                model.addRow(obj);
                eImageTransition1.removeTransitionListener(adapterAdd);
            }
        };

        adapterReset = new TransitionListener() {

            public void onStart(TransitionEvent event) {
                reset();
            }

            public void onFinish(TransitionEvent event) {
                eImageTransition1.removeTransitionListener(adapterReset);
            }
        };
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eGlassPane1 = new open.usu.swing.EGlassPane();
        eImageTransition1 = new open.usu.swing.EImageTransition();
        jLabel1 = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textWebsite = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();

        setGlassPane(eGlassPane1);
        getGlassPane().setVisible(true);

        javax.swing.GroupLayout eImageTransition1Layout = new javax.swing.GroupLayout(eImageTransition1);
        eImageTransition1.setLayout(eImageTransition1Layout);
        eImageTransition1Layout.setHorizontalGroup(
            eImageTransition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        eImageTransition1Layout.setVerticalGroup(
            eImageTransition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        eImageTransition1.setBounds(0, 0, 100, 100);
        eGlassPane1.add(eImageTransition1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Application");
        setResizable(false);

        jLabel1.setText("Add :");

        panelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Name :");

        jLabel3.setText("Email :");

        jLabel4.setText("Website");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(textEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(textWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        buttonAdd.setText("ADD");
        buttonAdd.addActionListener(this);

        buttonReset.setText("RESET");
        buttonReset.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == buttonAdd) {
            SimpleApplication.this.buttonAddActionPerformed(evt);
        }
        else if (evt.getSource() == buttonReset) {
            SimpleApplication.this.buttonResetActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
    GraphicUtilities.getBufferedImageFromComponent(panelMain, image);
    eImageTransition1.addTransitionListener(adapterAdd);
    eImageTransition1.setPointTransition(GraphicUtilities.getLocationForComponent(panelMain, eImageTransition1));
    eImageTransition1.setImageTransition(ImageTransition.COVER_DOWN);
    eImageTransition1.setImage(image);
    eImageTransition1.startTransition(500);
}//GEN-LAST:event_buttonAddActionPerformed

private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
    GraphicUtilities.getBufferedImageFromComponent(panelMain, image);
    eImageTransition1.addTransitionListener(adapterReset);
    eImageTransition1.setPointTransition(GraphicUtilities.getLocationForComponent(panelMain, eImageTransition1));
    eImageTransition1.setImageTransition(ImageTransition.FADE);
    eImageTransition1.setImage(image);
    eImageTransition1.startTransition(500);
}//GEN-LAST:event_buttonResetActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonReset;
    private open.usu.swing.EGlassPane eGlassPane1;
    private open.usu.swing.EImageTransition eImageTransition1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable table;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textWebsite;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        textEmail.setText("");
        textName.setText("");
        textWebsite.setText("");
    }

}
