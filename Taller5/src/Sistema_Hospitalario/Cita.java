/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema_Hospitalario;

import java.time.LocalDateTime;
import Persona.Paciente;
import Persona.Doctor;
import Persona.Secretaria;
/**
 *
 * @author Matias Vasconez
 */
public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagado;
    protected String registradoPor;
}
