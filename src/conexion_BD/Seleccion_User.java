/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;

/**
 *
 * @author Usuario
 */
public class Seleccion_User extends Datos_User{
    conexion_BD.conexion objConecta;

    public Seleccion_User(){
        objConecta = new conexion_BD.conexion();
    } 
   
   
public boolean valide(){
   String SQL="SELECT * FROM public.administrador WHERE usuario='"+super.getUsuario()+"' and contraseña='"+super.getClave()+"'";
   if (objConecta.validar(SQL)==false){
   return false;
} else {
    return true;
}    
}
}

