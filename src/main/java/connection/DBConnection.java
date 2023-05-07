/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author wilca
 */
public class DBConnection {
    Connection connection;
    static String bd = "patin_renta";
    static String port = "8000";
    static String login = "root";
    static String password = "";
    
    public DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+DBConnection.port +"/"+DBConnection.bd;
            connection = DriverManager.getConnection(url, DBConnection.login, DBConnection.password);
            System.out.println(url);
            System.out.println("Conexion establecida");
        }catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public void desconectar(){
        connection = null;
    }
}
