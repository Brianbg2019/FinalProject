package Imagenes.entidades.Guardar;

import Imagenes.entidades.Estudiantes;
import Imagenes.entidades.Nie;
import conexion_BD.Alumno_Datos;
import conexion_BD.*;
import conexion_BD.Alumno_Datos;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Alumnos {
    
    
    public void guardar(Estudiantes estudiante)throws Exception{
        Connection conexion=crearconexion();
        String sentenciaSQL="insert into estudiantes(nombre, apellido, idNie, idSeccion) "+"values (?,?,?,?)";
        PreparedStatement ejecutorSQL= conexion.prepareStatement(sentenciaSQL);
        ejecutorSQL.setString(1, estudiante.getNombre());
        ejecutorSQL.setString(2, estudiante.getApellido());
        ejecutorSQL.setInt(3, estudiante.getIdnie().getNie());
        ejecutorSQL.setString(4, estudiante.getIdseccion().getSeccion());
        ejecutorSQL.executeUpdate();
        conexion.close();        
    }
    

    
    private Connection crearconexion() throws SQLException,ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost/scc";
        Connection conexion= DriverManager.getConnection(url,"root","equipo5");
        return conexion;
    }
    
    
}

