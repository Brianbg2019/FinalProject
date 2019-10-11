                                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sccc_incas;

import java.awt.Color;


/**
 *
 * @author Otro Usuario
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null); //Centrar JFrame.
        setExtendedState(0); //Me Permite Bloquear Todo El Escritorio
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setAlwaysOnTop(true);       
        colortransparent();
        
 
   

        
    }
    public void colortransparent(){
        Admin.setBackground(new Color (0,0,0,0));
        docente.setBackground(new Color (0,0,0,0));
        estudiante.setBackground(new Color (0,0,0,0));
        otros.setBackground(new Color (0,0,0,0));
        MINED.setBackground(new Color (0,0,0,0));
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        docente = new javax.swing.JButton();
        estudiante = new javax.swing.JButton();
        otros = new javax.swing.JButton();
        MINED = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.cyan);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin_Boton.png"))); // NOI18N
        Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 187, 30, 30));

        exit.setText("EXIT");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, -1, -1));

        docente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Docente_Boton.png"))); // NOI18N
        docente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Docente__Boton.png"))); // NOI18N
        docente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Docente___Boton.png"))); // NOI18N
        docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteActionPerformed(evt);
            }
        });
        getContentPane().add(docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 50, 50));

        estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estudiante_Boton.png"))); // NOI18N
        estudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudiante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estudiante__Boton.png"))); // NOI18N
        estudiante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estudiante___Boton.png"))); // NOI18N
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 50, 50));

        otros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otros_Boton.png"))); // NOI18N
        otros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        otros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otros__Boton.png"))); // NOI18N
        otros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otros___Boton.png"))); // NOI18N
        otros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosActionPerformed(evt);
            }
        });
        getContentPane().add(otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 50, 50));

        MINED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mined_.png"))); // NOI18N
        MINED.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINED.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mined__.png"))); // NOI18N
        MINED.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mined___.png"))); // NOI18N
        MINED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINEDActionPerformed(evt);
            }
        });
        getContentPane().add(MINED, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 50, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_I.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteActionPerformed
        // TODO add your handling code here:
        Docente D = new Docente();      
        D.setVisible(true);
        dispose();
    }//GEN-LAST:event_docenteActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        // TODO add your handling code here:
        Alumno A = new Alumno();
        dispose();
        A.setVisible(true);
    }//GEN-LAST:event_estudianteActionPerformed

    private void otrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosActionPerformed
        // TODO add your handling code here:
        Otros O = new Otros();
        dispose();
        O.setVisible(true);
    }//GEN-LAST:event_otrosActionPerformed

    private void MINEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINEDActionPerformed
        // TODO add your handling code here:
        MINED M = new MINED();
        dispose();
        M.setVisible(true);
    }//GEN-LAST:event_MINEDActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
        Admin A = new Admin();        
        A.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton MINED;
    private javax.swing.JButton docente;
    private javax.swing.JButton estudiante;
    private javax.swing.JButton exit;
    private javax.swing.JButton otros;
    // End of variables declaration//GEN-END:variables
}
