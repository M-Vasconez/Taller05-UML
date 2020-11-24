/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Date;
import Persona.Secretaria;
/**
 *
 * @author Matias Vasconez
 */
public class Doctor extends Persona{

    public Doctor(int regDoctor, String especialidad, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
    }
    protected int regDoctor;
    protected String especialidad;
    
    public void recetar(){
        
    }
    
    public void agegarPlanNut(){
        
    }
    
    public void imprimirReceta(){
        
    }
    
    public void registrarSecretaria(){
        //Secretaria sc = new Secretaria(); 
    }
    
}
