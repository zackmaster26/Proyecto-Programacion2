
package Datos;

import java.util.ArrayList;


public class Ingrediente {
    
    private static ArrayList id; 
    private static ArrayList nombre;
    private static ArrayList cantidad;
    private static ArrayList unidad;

    public ArrayList getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList nombre) {
        this.nombre = nombre;
    }

    public ArrayList getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList getUnidad() {
        return unidad;
    }

    public void setUnidad(ArrayList unidad) {
        this.unidad = unidad;
    }

    public ArrayList getId() {
        return id;
    }

    public void setId(ArrayList id) {
        this.id = id;
    }
    
}
