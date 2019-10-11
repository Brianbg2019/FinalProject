/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;

import Imagenes.entidades.Estudiantes;
import conexion_BD.Alumno_Datos;
import Imagenes.entidades.Guardar.Insertar_Alumnos;

public class Registrar_Alumnos {


public boolean guardaEstudiante(Estudiantes estudiante) throws Exception{
    Insertar_Alumnos insertar = new Insertar_Alumnos();
    insertar.guardar(estudiante);
    return false;
}
    
    
}