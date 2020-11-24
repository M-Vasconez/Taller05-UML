/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Date;

/**
 *
 * @author Matias Vasconez
 */
public class Paciente extends Persona{
    protected String email;
    
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, String email) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.email=email;
    }
    
    public void solicitarCita(){
        
    }
    
}
