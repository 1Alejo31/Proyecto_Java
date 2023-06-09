package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import beans.patin;
import connection.DBConnection;

public class PatinController implements IPatinController {

    @Override
    public String listar(boolean ordenar, String orden) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from patins";

        if (ordenar == true) {
            sql += " order by modelo " + orden;
        }

        List<String> patins = new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String tamaño = rs.getString("tamaño");
                boolean novedad = rs.getBoolean("novedad");

                Patin patin = new patin(id, marca, modelo, tamaño, novedad);

                patins.add(gson.toJson(patin));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(patins);

    }
}
