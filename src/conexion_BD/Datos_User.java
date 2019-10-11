/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. valores igual a la tabla ctr-espacio
   luego se genera con refactor y encapsulado de campos.
 */ 
package conexion_BD;

/**
 *
 * @author Usuario
 */
public class Datos_User{
 private String usuario;
 private String contraseña;

    public Datos_User() {
        
    }
 
 
    public Datos_User(String contraseña, String usuario) {
            this.contraseña=contraseña;
            this.usuario=usuario;
             
    }
  
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
                     */
    public String getClave() {
        return contraseña;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.contraseña = clave;
    }
    
}
