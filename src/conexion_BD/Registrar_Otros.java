/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;

import conexion_BD.*;
import conexion_BD.*;
import conexion_BD.Otros_Datos;
import conexion_BD.Insertar_Otros;

public class Registrar_Otros {
    
    public boolean guardarOtros(Otros_Datos Otros) throws Exception{
       
            Insertar_Otros insertar= new Insertar_Otros();
            insertar.guardar(Otros);
            return true;
                
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}