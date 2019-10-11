package conexion_BD;

import conexion_BD.*;

public class Docente_Datos {
    
    private int idd;
    private String nombre, apellido, hora_i, hora_f, fecha, recurso_a, actividad_a, nip, ob;
    
    public Docente_Datos(String nombre, String apellido, String hora_i,
    String hora_f, String fecha, String recurso_a, String actividad_a, String nip, String ob){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.hora_i = hora_i;
        this.hora_f = hora_f;
        this.fecha = fecha;
        this.recurso_a = recurso_a;
        this.actividad_a = actividad_a;
        this.nip = nip;
        this.ob = ob;
        
        
    }
       
    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getHora_i() {
        return hora_i;
    }

    public void setHora_i(String hora_i) {
        this.hora_i = hora_i;
    }
    
    public String getHora_f() {
        return hora_f;
    }

    public void setHora_f(String hora_f) {
        this.hora_f = hora_f;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getRecurso_a() {
        return recurso_a;
    }

    public void setRecurso_a(String recurso_a) {
        this.recurso_a = recurso_a;
    }
    
   
    
    public String getActividad_a() {
        return actividad_a;
    }

    public void setActividad_a(String actividad_a) {
        this.actividad_a = actividad_a;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getOb() {
        return ob;
    }

    public void setOb(String ob) {
        this.ob = ob;
    }
  
    
   
}



