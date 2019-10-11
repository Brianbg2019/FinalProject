/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sccc_incas;

import conexion_BD.Docente_Datos;
import conexion_BD.Registrar_Alumnos;
import conexion_BD.Registrar_Docente;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author desarrollo
 */
public class Docente extends javax.swing.JFrame {

    /**
     * Creates new form Docente
     */
    public Docente() {
        initComponents();
        setLocationRelativeTo(null); //Centrar JFrame.
        setExtendedState(0); //Me Permite Bloquear Todo El Escritorio
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setAlwaysOnTop(true);
        colortransparent();
        txtob.setLineWrap(true);
    }
    
    public void colortransparent(){
        Registro.setBackground(new Color (0,0,0,0));
        txtNombre.setBackground(new Color (0,0,0,0));
        txtApellido.setBackground(new Color (0,0,0,0));
        txthora_i.setBackground(new Color (0,0,0,0));
        txthora_f.setBackground(new Color (0,0,0,0));
        txtfecha.setBackground(new Color (0,0,0,0));
        txtrecurso_a.setBackground(new Color (0,0,0,0));
        txtactividad_a.setBackground(new Color (0,0,0,0));
        txtnip.setBackground(new Color (0,0,0,0));        
        txtob.setBackground(new Color (0,0,0,0));
        Home.setBackground(new Color (0,0,0,0));
        Scroll.setOpaque(false);
        Scroll.getViewport().setOpaque(false);
        Scroll.setBorder(null);
        Scroll.setViewportBorder(null);
        txtob.setBorder(null);

         
        
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtrecurso_a = new javax.swing.JTextField();
        txthora_i = new javax.swing.JFormattedTextField();
        txtfecha = new javax.swing.JFormattedTextField();
        txthora_f = new javax.swing.JFormattedTextField();
        txtactividad_a = new javax.swing.JTextField();
        txtnip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        txtob = new javax.swing.JTextArea();
        Registro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 215, 130, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 266, 130, -1));

        txtrecurso_a.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtrecurso_a.setForeground(new java.awt.Color(255, 255, 255));
        txtrecurso_a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrecurso_a.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtrecurso_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrecurso_aKeyTyped(evt);
            }
        });
        getContentPane().add(txtrecurso_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 130, -1));

        txthora_i.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txthora_i.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txthora_i.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txthora_i.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txthora_i.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txthora_i.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(txthora_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 317, 130, -1));

        txtfecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtfecha.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtfecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfecha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 419, 130, -1));

        txthora_f.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txthora_f.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txthora_f.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txthora_f.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txthora_f.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txthora_f.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(txthora_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 368, 130, -1));

        txtactividad_a.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtactividad_a.setForeground(new java.awt.Color(255, 255, 255));
        txtactividad_a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtactividad_a.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtactividad_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtactividad_aKeyTyped(evt);
            }
        });
        getContentPane().add(txtactividad_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 215, 130, -1));

        txtnip.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtnip.setForeground(new java.awt.Color(255, 255, 255));
        txtnip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnip.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnipActionPerformed(evt);
            }
        });
        txtnip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnipKeyTyped(evt);
            }
        });
        getContentPane().add(txtnip, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 266, 130, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Observaciones:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 318, 110, -1));

        txtob.setColumns(20);
        txtob.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtob.setForeground(new java.awt.Color(255, 255, 255));
        txtob.setRows(5);
        Scroll.setViewportView(txtob);

        getContentPane().add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 345, 240, 118));

        Registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Registrarse.png"))); // NOI18N
        Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton__Registrarse.png"))); // NOI18N
        Registro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton___Registrarse.png"))); // NOI18N
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*Es obligatorio llenar todos los campos*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Home.png"))); // NOI18N
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Home_.png"))); // NOI18N
        Home.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Home__.png"))); // NOI18N
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 188, 18, 18));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_D.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        // TODO add your handling code here:
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String hora_i=txthora_i.getText();
        String hora_f=txthora_f.getText();
        String fecha=txtfecha.getText();
        String recurso_a=txtrecurso_a.getText();
        String actividad_a=txtactividad_a.getText();
        String nip=txtnip.getText();
        String ob=txtob.getText();

        if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txthora_i.getText().isEmpty()
            || txthora_f.getText().isEmpty() || txtfecha.getText().isEmpty() || txtrecurso_a.getText().isEmpty() || txtactividad_a.getText().isEmpty()
            || txtnip.getText().isEmpty()|| txtob.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Es Obligatorio Llenar Todos Los Campos", "Error", JOptionPane.ERROR_MESSAGE);

        }else{

            Docente_Datos docente= new Docente_Datos(nombre, apellido, hora_i, hora_f, fecha, recurso_a, actividad_a, nip, ob);
            try{
                Registrar_Docente r_docente=new Registrar_Docente();
                r_docente.guardarDocente(docente);
                JOptionPane.showMessageDialog(this,"Se Guardo Con Exito "+ nombre, "Informacion",JOptionPane.INFORMATION_MESSAGE);
                Salir S = new Salir();
                S.setVisible(true);
                dispose();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this,"Ocurrio Un Error", "Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_RegistroActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        Inicio I = new Inicio();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void txtnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnipActionPerformed

    private void txtnipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnipKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        int nc=6;
        if(txtnip.getText().length()>nc){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Solo Se Permiten 7 Digitos" );
            
        }
    }//GEN-LAST:event_txtnipKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtrecurso_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrecurso_aKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isDigit(car)){
        }else{
        evt.consume();
        getToolkit().beep();
        }
    }//GEN-LAST:event_txtrecurso_aKeyTyped

    private void txtactividad_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtactividad_aKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isDigit(car)){
        }else{
        evt.consume();
        getToolkit().beep();
        }
    }//GEN-LAST:event_txtactividad_aKeyTyped

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
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Home;
    private javax.swing.JButton Registro;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtactividad_a;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JFormattedTextField txthora_f;
    private javax.swing.JFormattedTextField txthora_i;
    private javax.swing.JTextField txtnip;
    private javax.swing.JTextArea txtob;
    private javax.swing.JTextField txtrecurso_a;
    // End of variables declaration//GEN-END:variables
}
