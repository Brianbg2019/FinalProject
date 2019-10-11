package conexion_BD;

import conexion_BD.*;
import conexion_BD.Docente_Datos;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insertar_Docente {
    
    
    public void guardar(Docente_Datos docente)throws Exception{
        Connection conexion=crearconexion();
        String sentenciaSQL="insert into docente (nombre, apellido, hora_i, hora_f, fecha, recurso_a, actividad_a, nip, ob) "+"values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ejecutorSQL= conexion.prepareStatement(sentenciaSQL);
        ejecutorSQL.setString(1, docente.getNombre());
        ejecutorSQL.setString(2, docente.getApellido());
        ejecutorSQL.setString(3, docente.getHora_i());
        ejecutorSQL.setString(4, docente.getHora_f());
        ejecutorSQL.setString(5, docente.getFecha());
        ejecutorSQL.setString(6, docente.getRecurso_a());
        ejecutorSQL.setString(7, docente.getActividad_a());
        ejecutorSQL.setString(8, docente.getNip());
        ejecutorSQL.setString(9, docente.getOb());
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

