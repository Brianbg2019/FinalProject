package conexion;

import static JFames.MantenimientoEstudiante.PASSWORD;
import static JFames.MantenimientoEstudiante.URL;
import static JFames.MantenimientoEstudiante.USERNAME;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Conexion {
    
    Connection con;
    public static final String URL = "jdbc:mysql://localhost:3306/scc";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public static void main(String[] args) {
       Conexion con = new Conexion();
        Statement st;
        ResultSet rs;
        
        try {
            st=con.con.createStatement();
            rs=st.executeQuery("SELECT nie FROM nie");
            if (rs.next()) {
                System.err.println(rs.getString("nie"));
            }
            con.con.close();
            
        } catch (Exception e) {
        }
    }
}
