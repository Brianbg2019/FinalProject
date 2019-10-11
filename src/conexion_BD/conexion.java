/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion_BD;

/**
 *
 * @author jonathan
 */
//import form.x;
import sccc_incas.Admin;
import java.awt.HeadlessException;
import java.sql.*;
//import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
//import org.jvnet.substance.SubstanceLookAndFeel;


public class conexion
{
java.sql.Connection con;
java.sql.Statement st;
java.sql.ResultSet res;

   
    public Connection conexion = null;
    //public String bd = "Usuario";
    public String login = "dakenavid";
    public String password ="2017_dakenavid";
    public final String CONTROLADOR_JDBC = "org.postgresql.Driver";
    public final String URL_BASEDEDATOS = "jdbc:postgresql://192.168.3.2:5432/sccc_incas";
//    Statement snt;

    public conexion() {
        try {
            try{
                Class.forName(CONTROLADOR_JDBC);
                System.out.println("driver correcto");
                //new Login().setVisible(true);
            }catch (ClassNotFoundException ex){
                System.out.println("error cargando.... ");
            }
            con=DriverManager.getConnection("jdbc:postgresql://192.168.3.2/sccc_incas", "dakenavid", "2017_dakenavid");
        }catch (SQLException ex){
            System.out.println("no se pudo conctar ni ...");
        }
    }

    /** public conexion()// constructor
    {
        try  // todo bien
        {
            // Se registra el Driver de Postgres
             Class.forName( CONTROLADOR_JDBC );
             conexion = DriverManager.getConnection(URL_BASEDEDATOS,login,password);
             
             JOptionPane.showMessageDialog(null, "YA ESTAS CONECTADO  A LA BASE DE DATOS" , "Bienvenido",
             JOptionPane.INFORMATION_MESSAGE);

             new Login().setVisible(true);//llama al menu

        } catch (HeadlessException | ClassNotFoundException | SQLException e) // error de conexion
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema con la conexion" , "Verifique",
            JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        }
    }
    **/
    public static void main(String[] args) // programa principal
	{
	//new conexion();// llama al constructor
	}
public boolean validar (String sql){
   java.sql.ResultSet hoja_resultado=null;
   try {
       st=con.createStatement();
       hoja_resultado=st.executeQuery(sql);
       if (hoja_resultado.next()){
           return true;
       }       
       else {
           return false;
       }
   }catch (SQLException ex){
       System.out.println("error consultando:"+ex.toString());
       return false;
    }
   }



}
