/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author alexander
 */
public class Conexion_Consulta {
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    static ResultSetMetaData resultadometa;
    public static void conectar(){
        String ruta="jdbc:postgresql://localhost/sccc_incas";
        String user="postgres";
        String pass="1234";
        try {
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            sentencia= conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }
    public static ArrayList<Object[]> llenar_tabla(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM alumnos ";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData(); 
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
     public static ArrayList<Object[]> llenar_tabla2(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM docente ";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData(); 
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
     public static ArrayList<Object[]> llenar_tabla3(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM mined ";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData(); 
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
     
      public static ArrayList<Object[]> llenar_tabla4(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM otros ";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData(); 
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
 public static ArrayList<Object[]> buscar_tabla(String nombre){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM alumnos" + " WHERE fecha='"+nombre+"'";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
 
 public static ArrayList<Object[]> buscar_tabla2(String nombre){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM docente" + " WHERE fecha='"+nombre+"'";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
 public static ArrayList<Object[]> buscar_tabla3(String nombre){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM mined" + " WHERE fecha='"+nombre+"'";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
 public static ArrayList<Object[]> buscar_tabla4(String nombre){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM otros" + " WHERE fecha='"+nombre+"'";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
 
 
 
 
 
}
