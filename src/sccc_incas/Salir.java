/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sccc_incas;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author desarrollo
 */

public class Salir extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Salir() {
        initComponents();
        bloquear();
        setLocationRelativeTo(null); //Centrar JFrame.
        setExtendedState(0); //Me Permite Bloquear Todo El Escritorio
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setAlwaysOnTop(true); //Revisar!!!!!!!!!!!!!!!!!!!!!Bloque Al Apagado.
        colortransparent();        
    }
    public void colortransparent(){
        Guardar.setBackground(new Color (0,0,0,0));
        Exit.setBackground(new Color (0,0,0,0));        
    }
    public void bloquear1(){
        
        cancel.setEnabled(false);
    }   
    public void bloquear(){
         Exit.setEnabled(false);
       
    }   
    public void desbloquear(){
        Exit.setEnabled(true);
        
    }  
    public void select(){
        int tiempo =Integer.parseInt((String) timer.getSelectedItem());
        switch (tiempo) {
     case 15:
        try {
            // Determinar en qué SO estamos
            String so = System.getProperty("os.name");
            String comando;
            // Comando para Linux
            if (so.equals("Linux"))
            comando = "shutdown -h +5";
            // Comando para Windows
            else
            comando = "cmd /c shutdown -s -t 900 -f";
            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(
            p.getErrorStream()));
    // Leemos la salida del comando
    JOptionPane.showMessageDialog(null, "Su ordenador se apagara en 15 minutos");
    // Leemos los errores si los hubiera
    String s;
    while ((s = stdError.readLine()) != null) {
        
        }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        break;
        case 30:
                try {
            // Determinar en qué SO estamos
            String so = System.getProperty("os.name");
            String comando;
            // Comando para Linux
            if (so.equals("Linux"))
            comando = "shutdown -h +30";
            // Comando para Windows
            else
            comando = "cmd /c shutdown -s -t 1800 -f";
            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(
            p.getErrorStream()));
    // Leemos la salida del comando
    JOptionPane.showMessageDialog(null, "Su ordenador se apagara en 30 minutos");
    // Leemos los errores si los hubiera
    String s;
    while ((s = stdError.readLine()) != null) {
        
        }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        break;
        case 1:
             try {
            // Determinar en qué SO estamos
            String so = System.getProperty("os.name");
            String comando;
            // Comando para Linux
            if (so.equals("Linux"))
            comando = "shutdown -h +60";
            // Comando para Windows
            else
            comando = "cmd /c shutdown -s -t 3600 -f";
            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(
            p.getErrorStream()));
    // Leemos la salida del comando
    JOptionPane.showMessageDialog(null, "Su ordenador se apagara en 1 hora");
    // Leemos los errores si los hubiera
    String s;
    while ((s = stdError.readLine()) != null) {
        
        }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }            
        break;       
        case 2:
            try {
            // Determinar en qué SO estamos
            String so = System.getProperty("os.name");
            String comando;
            // Comando para Linux
            if (so.equals("Linux"))
            comando = "shutdown -h +120";
            // Comando para Windows
            else
            comando = "cmd /c shutdown -s -t 7200 -f";
            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(
            p.getErrorStream()));
    // Leemos la salida del comando
    JOptionPane.showMessageDialog(null, "Su ordenador se apagara en 2 horas");
    // Leemos los errores si los hubiera
    String s;
    while ((s = stdError.readLine()) != null) {
       
        }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }                              
        break;      
        case 3:
            try {
            // Determinar en qué SO estamos
            String so = System.getProperty("os.name");
            String comando;
            // Comando para Linux
            if (so.equals("Linux"))
            comando = "shutdown -h +180";
            // Comando para Windows
            else
            comando = "cmd /c shutdown -s -t 10800 -f";
            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(
            p.getErrorStream()));
    // Leemos la salida del comando
    JOptionPane.showMessageDialog(null, "Su ordenador se apagara en 3 horas");
    // Leemos los errores si los hubiera
    String s;
    while ((s = stdError.readLine()) != null) {
        
        }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }                 
        break;        
        case 4:
            try {
            // Determinar en qué SO estamos
            String so = System.getProperty("os.name");
            String comando;
            // Comando para Linux
            if (so.equals("Linux"))
            comando = "shutdown -h +240";
            // Comando para Windows
            else
            comando = "cmd /c shutdown -s -t 14400 -f";
            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(
            p.getErrorStream()));
    // Leemos la salida del comando
    JOptionPane.showMessageDialog(null, "Su ordenador se apagara en 4 hora");
    // Leemos los errores si los hubiera
    String s;
    while ((s = stdError.readLine()) != null) {
       
        }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }                                           
        break;        
        default:                
        System.out.println("Helo");
        break;
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

        Exit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        timer = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apate ya !");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir_Boton.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 448, 75, 30));

        cancel.setBackground(new java.awt.Color(0, 153, 204));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancelar Apagado");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 285, -1, -1));

        timer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        timer.setForeground(new java.awt.Color(255, 255, 255));
        timer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "30", "1", "2", "3", "4" }));
        timer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 335, 75, -1));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_Boton.png"))); // NOI18N
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 385, 75, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_S.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        int click_actuales = 1;
        int click_maximo = 1;
        if(click_actuales == click_maximo){  //alerta
            bloquear1();
        }else{
            click_actuales++;//codigo restante

        }
        try {

            // Determinar en qué SO estamos
            String so = System.getProperty("os.name");

            String comando;

            // Comando para Linux
            if (so.equals("Linux"))
            comando = "shutdown -c";

            // Comando para Windows
            else
            comando = "cmd /c shutdown /a";
            bloquear();

            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                p.getInputStream()));

        BufferedReader stdError = new BufferedReader(new InputStreamReader(
            p.getErrorStream()));

    // Leemos la salida del comando
    JOptionPane.showMessageDialog(null, "Tarea Cancelada");
    // Leemos los errores si los hubiera
    String s;
    while ((s = stdError.readLine()) != null) {
        JOptionPane.showMessageDialog(null, s);
        }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_cancelActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        select();
        desbloquear();
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Salir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salir().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> timer;
    // End of variables declaration//GEN-END:variables
}
