/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.CallableStatement;

/**
 *
 * @author Eparrales
 */
public class Prueba {

    public static void main(String[] args) {
        Oraclep ora = new Oraclep();

        try {
            
            CallableStatement cs = ora.getCon().getConexion().prepareCall("call p_modEsp(?,?,?,?,?,?,?,?,?)");
            cs.setInt(1,5);
            cs.setString(2, "20202020");
            cs.setString(3, "20202020");
            cs.setString(4, "20202020");
            cs.setString(5, "20202020");
            cs.setString(6, "20202020");
            cs.setString(7, "20202020");
            cs.setString(8, "20202020");
            cs.setString(9, "20202020");
             cs.execute();

           
            
        } catch (Exception e) {
        }

    }

}
