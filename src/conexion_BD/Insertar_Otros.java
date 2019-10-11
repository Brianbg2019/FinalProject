package conexion_BD;

import conexion_BD.*;
import conexion_BD.*;
import conexion_BD.MINED_Datos;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insertar_Otros {
    
    
    public void guardar(Otros_Datos Otros)throws Exception{
        Connection conexion=crearconexion();
        String sentenciaSQL="insert into otros (nombre, apellido, hora_i, hora_f, fecha, recurso_a, actividad_a, dui, ob) "+"values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ejecutorSQL= conexion.prepareStatement(sentenciaSQL);
        ejecutorSQL.setString(1, Otros.getNombre());
        ejecutorSQL.setString(2, Otros.getApellido());
        ejecutorSQL.setString(3, Otros.getHora_i());
        ejecutorSQL.setString(4, Otros.getHora_f());
        ejecutorSQL.setString(5, Otros.getFecha());
        ejecutorSQL.setString(6, Otros.getRecurso_a());
        ejecutorSQL.setString(7, Otros.getActividad_a());
        ejecutorSQL.setString(8, Otros.getDui()); 
        ejecutorSQL.setString(9, Otros.getOb());
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

