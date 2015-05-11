/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Eparrales
 */
public class Especialista extends Persona{
    private String tarjPro;
    private String cargo;

    public Especialista() {
    }

    public Especialista(String tarjPro, String cargo, int dni, String nombres, String apellidos, String email, String telfono, String num_cel) {
        super(dni, nombres, apellidos, email, telfono, num_cel);
        this.tarjPro = tarjPro;
        this.cargo = cargo;
    }

    public String getTarjPro() {
        return tarjPro;
    }

    public void setTarjPro(String tarjPro) {
        this.tarjPro = tarjPro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
   
    
  
    
}
