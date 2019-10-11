/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sccc_incas;

import conexion_BD.MyIcon;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo8
 */
public class I_Admin extends javax.swing.JFrame {

    /**
     * Creates new form I_Admin
     */
    public I_Admin() {
        initComponents();
        setLocationRelativeTo(null); //Centrar JFrame.
        setExtendedState(0); //Me Permite Bloquear Todo El Escritorio
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setAlwaysOnTop(true);
        colortransparent();
        bloquear();
    }
    public void bloquear(){
        Alumno.setEnabled(false);
        Botones_1.setEnabled(false);
        Docente.setEnabled(false);
        Mined.setEnabled(false);
        Otros.setEnabled(false); 
        Temporizador.setEnabled(false);
        Salir.setEnabled(false); 
    }   
    public void desbloquear(){
        Alumno.setEnabled(true);
        Botones_1.setEnabled(true);
        Botones_2.setEnabled(true);
        Docente.setEnabled(true);
        Mined.setEnabled(true);
        Otros.setEnabled(true);
        Temporizador.setEnabled(true); 
        
    }
    public void desbloquear2(){
        Botones_2.setEnabled(true);
        Temporizador.setEnabled(true);
        Salir.setEnabled(true);
        
    }
    
     public void colortransparent(){        
        Registros.setBackground(new Color (0,0,0,0));
        Alumno.setBackground(new Color (0,0,0,0));
        Docente.setBackground(new Color (0,0,0,0));
        Mined.setBackground(new Color (0,0,0,0));
        Otros.setBackground(new Color (0,0,0,0));
        Temporizador.setBackground(new Color (0,0,0,0));
        Emergencias.setBackground(new Color (0,0,0,0));
        Salir.setBackground(new Color (0,0,0,0));
        
        
 
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Alumno = new javax.swing.JButton();
        Registros = new javax.swing.JButton();
        Docente = new javax.swing.JButton();
        Mined = new javax.swing.JButton();
        Otros = new javax.swing.JButton();
        Botones_1 = new javax.swing.JLabel();
        Temporizador = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Botones_2 = new javax.swing.JLabel();
        Emergencias = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Alumno.png"))); // NOI18N
        Alumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 35, 35));

        Registros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Files.png"))); // NOI18N
        Registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosActionPerformed(evt);
            }
        });
        getContentPane().add(Registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 75, 30));

        Docente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Docente.png"))); // NOI18N
        Docente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocenteActionPerformed(evt);
            }
        });
        getContentPane().add(Docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 35, 35));

        Mined.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mined_Boton.png"))); // NOI18N
        Mined.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Mined, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 35, 35));

        Otros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Otros.png"))); // NOI18N
        Otros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 35, 35));

        Botones_1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(Botones_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, 120));

        Temporizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reloj_Boton.png"))); // NOI18N
        Temporizador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Temporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemporizadorActionPerformed(evt);
            }
        });
        getContentPane().add(Temporizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 35, 35));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Salir.png"))); // NOI18N
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 35, 35));

        Botones_2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(Botones_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 150, 120));

        Emergencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Emergencias_Boton.png"))); // NOI18N
        Emergencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Emergencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergenciasActionPerformed(evt);
            }
        });
        getContentPane().add(Emergencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 240, 75, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_I_A.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoActionPerformed
        // TODO add your handling code here:
        Registros_Alumnos R = new Registros_Alumnos();
        R.setVisible(true);
        dispose();
    }//GEN-LAST:event_AlumnoActionPerformed

    private void RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosActionPerformed
        // TODO add your handling code here:
        desbloquear();
    }//GEN-LAST:event_RegistrosActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void DocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocenteActionPerformed
        // TODO add your handling code here:
        Registros_Alumnos R_D = new Registros_Alumnos();
        R_D.setVisible(true);
        dispose();
    }//GEN-LAST:event_DocenteActionPerformed

    private void EmergenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergenciasActionPerformed
        // TODO add your handling code here:
        desbloquear2();
    }//GEN-LAST:event_EmergenciasActionPerformed

    private void TemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemporizadorActionPerformed
        // TODO add your handling code here:
        Salir S = new Salir();
        S.setVisible(true);
        dispose();
    }//GEN-LAST:event_TemporizadorActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        MyIcon icon = new MyIcon();
        int n=JOptionPane.showConfirmDialog(null, "Realmente Desea Salir?", "Confirmar Salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,icon);

        if(n==0){
            System.exit(0);
        }
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(I_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alumno;
    private javax.swing.JLabel Botones_1;
    private javax.swing.JLabel Botones_2;
    private javax.swing.JButton Docente;
    private javax.swing.JButton Emergencias;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Mined;
    private javax.swing.JButton Otros;
    private javax.swing.JButton Registros;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Temporizador;
    private javax.swing.JButton exit;
    // End of variables declaration//GEN-END:variables
}
