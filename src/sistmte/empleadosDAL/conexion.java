/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistmte.empleadosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HALG
 */
public class conexion {
    
    String strigConexionDB="jdbc:sqlite:C:/Users/HALG/Documents/Programas/sistemas.s3db";
    Connection conn= null;
    
    public conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strigConexionDB);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Conexion fallida "+ e);
        }
    }
    
    public int executeSQL(String strSentenceSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenceSQL);
            pstm.execute();
            return 1;
            
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenceSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenceSQL);
            ResultSet resp = pstm.executeQuery();
            return resp;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
