/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author Eparrales
 */

public class Oraclep {
    private Conectar con;
    private ResultSet rst;
    private ResultSetMetaData rstmdata;
    private CallableStatement cs;

    public Oraclep() {
        con=new Conectar();
        con.conectar();
       
    }

    public Conectar getCon() {
        return con;
    }



    public ResultSet getRst() {
        return rst;
    }

    public ResultSetMetaData getRstmdata() {
        return rstmdata;
    }
    
    
    
    
    public void regisData(String sql) {
        try {
            Statement sentencia;
            sentencia = con.getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            con.getConexion().commit();
            sentencia.close();
           
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
    
    public void consultar(String sql) {

        try {
            Statement sentencia;
            sentencia = con.getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            rst = sentencia.executeQuery(sql);
            rstmdata = rst.getMetaData();
            con.getConexion().commit();

          
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
 
    
}
