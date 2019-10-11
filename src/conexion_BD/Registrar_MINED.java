/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;

import conexion_BD.*;
import conexion_BD.MINED_Datos;
import conexion_BD.Insertar_MINED;

public class Registrar_MINED {
    
    public boolean guardarMINED(MINED_Datos MINED) throws Exception{
       
            Insertar_MINED insertar= new Insertar_MINED();
            insertar.guardar(MINED);
            return true;
                
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}