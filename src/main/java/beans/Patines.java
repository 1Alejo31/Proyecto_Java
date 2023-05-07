/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author wilca*/

public class Patines {
    private int id;
    private String marca;
    private String modelo;
    private String tamaño;  
    private boolean novedad;

    public Patines(int id, String marca, String modelo, String tamaño, boolean novedad) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño; 
        this.novedad =novedad;
       
    }
}
