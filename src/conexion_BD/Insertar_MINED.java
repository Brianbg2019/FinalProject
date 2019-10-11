package conexion_BD;

import conexion_BD.*;
import conexion_BD.MINED_Datos;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insertar_MINED {
    
    
    public void guardar(MINED_Datos mined)throws Exception{
        Connection conexion=crearconexion();
        String sentenciaSQL="insert into mined (nombre, apellido, hora_i, hora_f, fecha, recurso_a, actividad_a, dui, ob) "+"values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ejecutorSQL= conexion.prepareStatement(sentenciaSQL);
        ejecutorSQL.setString(1, mined.getNombre());
        ejecutorSQL.setString(2, mined.getApellido());
        ejecutorSQL.setString(3, mined.getHora_i());
        ejecutorSQL.setString(4, mined.getHora_f());
        ejecutorSQL.setString(5, mined.getFecha());
        ejecutorSQL.setString(6, mined.getRecurso_a());
        ejecutorSQL.setString(7, mined.getActividad_a());
        ejecutorSQL.setString(8, mined.getDui()); 
        ejecutorSQL.setString(9, mined.getOb());
        ejecutorSQL.executeUpdate();
        conexion.close();        
    }
    

    
    private Connection crearconexion() throws SQLException,ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://192.168.3.2/sccc_incas";
        Connection conexion= DriverManager.getConnection(url,"dakenavid","2017_dakenavid");
        return conexion;
    }
    
    
}

