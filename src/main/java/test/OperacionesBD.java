/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import beans.Patines;
import connection.DBConnection;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author wilca
 */
public class OperacionesBD {
  public static void main (String[] args){
      listarbicicleta();
    }
    
    public static void actualizarbicicleta(int id, String genero){
        DBConnection con = new DBConnection();
        String sql = "UPDATE bicicleta SET genero = '"+genero+"' where id = "+id;
        
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            con.desconectar();
        }
    }
    
    public static void listarbicicleta(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM bicicleta";
        
        try{
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String tamaño = rs.getString("tamaño");
                boolean novedad = rs.getBoolean("novedad");
               
              Patines bicicleta=new Patines(id, marca, modelo, tamaño, novedad);  
               
              System.out.println(bicicleta.toString());
            }
            st.executeQuery(sql);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            con.desconectar();
        }
    }  
}
