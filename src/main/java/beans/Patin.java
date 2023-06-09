
package beans;



public class Patin {
    private int id;
    private String marca;
    private String modelo;
    private String tamaño;  
    private boolean novedad;

    public Patin(int id, String marca, String modelo, String tamaño, boolean novedad) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño; 
        this.novedad =novedad;
       
    }public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String titulo) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String genero) {
        this.modelo = modelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String autor) {
        this.tamaño = tamaño;
    }

  

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Patin{" + "id=" + id + ", marca =" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño  + ", novedad=" + novedad + '}';
    }
    
    
    
}


