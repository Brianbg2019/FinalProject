/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;

import conexion_BD.*;
import conexion_BD.Docente_Datos;
import conexion_BD.Insertar_Docente;

public class Registrar_Docente {
    
    public boolean guardarDocente(Docente_Datos docente) throws Exception{
       
            Insertar_Docente insertar= new Insertar_Docente();
            insertar.guardar(docente);
            return true;
                
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}