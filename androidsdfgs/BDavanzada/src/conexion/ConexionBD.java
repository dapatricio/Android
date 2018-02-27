/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Daniel Peñarreta
 * Cristian Mendoza
 * Jairo Valle
 * 
 * Fecha: 21/07/2016
 */
public class ConexionBD {
    public static Connection con;
    private Connection conexion;
    Statement stSentencias;
    ResultSet rsDatos;
    PreparedStatement psPrepararSentencias;

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public ConexionBD conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:xe";

            conexion = DriverManager.getConnection(BaseDeDatos, "HR", "hr");
            if (conexion != null) {
                System.out.println("Conexion exitosa conectar!");
            } else {
                System.out.println("Conexion fallida conectar!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
    public ConexionBD conectarTripletas() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:xe";

            conexion = DriverManager.getConnection(BaseDeDatos, "SYSTEM", "primos14");
            if (conexion != null) {
                System.out.println("Conexion exitosa tripletas!");
            } else {
                System.out.println("Conexion fallida tripletas!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
    public ConexionBD conectarPost() throws SQLException, ClassNotFoundException{
        try{
     
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/";
            conexion=DriverManager.getConnection(url,"postgres","primos14");
            
            if(conexion !=null){
                System.out.println("Conexion exitosa Postgrades");
                
        }else{
                System.out.println("Conexion fallida Postgrades");
        }
        } catch (ClassCastException | SQLException ex){
            throw ex;
        }
        return this;
    }
    
    public ConexionBD conectarPost2() throws SQLException, ClassNotFoundException{
        
        String db = (String) finalfantastic.comboMysql.getSelectedItem();
        try{
            
            Class.forName("org.postgresql.Driver");
            String url=("jdbc:postgresql://localhost:5432/"+db);
            conexion=DriverManager.getConnection(url,"postgres","primos14");
            
            if(conexion !=null){
                System.out.println("Conexion exitosa Postgrades");
                
        }else{
                System.out.println("Conexion fallida Postgrades");
        }
        } catch (ClassCastException | SQLException ex){
            throw ex;
        }
        return this;
    }
    
    public ConexionBD conectarMysql() {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/", "root", "primos14");
            
            if (conexion != null) {
                System.out.println("Conexion exitosa Mysql");
            } else {
                System.out.println("Conexion fallida Mysql");
            }
        }catch(Exception e){
        
            e.printStackTrace();
        }        
        return this;
    }    
    public ConexionBD conectarMysql2() {
        
        String db = (String) finalfantastic.comboMysql.getSelectedItem();
        try{          
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/"+db, "root", "primos14");
            
            if (conexion != null) {
                System.out.println("Conexion exitosa Mysql");
            } else {
                System.out.println("Conexion fallida Mysql");
            }
        }catch(Exception e){
        
            e.printStackTrace();
        }        
        return this;
    }
}
