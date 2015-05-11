/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;

/**
 *
 * @author Eparrales
 */
public class Conectar {

    private String usuario;
    private String url;
    private String passwd;
    private Connection conexion;
    private boolean estado;

    public Conectar() {
        url = "jdbc:oracle:thin:@192.168.0.2:1521:orcl";
        usuario = "proyecto";
        passwd = "proyecto";
        estado = false;

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean isEstado() {
        return estado;
    }

    public Conectar(String usuario, String url, String passwd) {
        this.usuario = usuario;
        this.url = url;
        this.passwd = passwd;
    }

    public void conectar() {

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            conexion = DriverManager.getConnection(url, usuario, passwd);
            if (conexion != null) {

                this.estado = true;

            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
