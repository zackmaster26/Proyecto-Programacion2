
package Datos;

public class NuevoIngrediente {
 
    private static String nombre;
    private static int costo;
    private static String cantidad;
    private static int unidad;
    private static int calorias;
    private static int proteinas;
    private static int grasas;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        NuevoIngrediente.nombre = nombre;
    }

    public static int getCosto() {
        return costo;
    }

    public static void setCosto(int costo) {
        NuevoIngrediente.costo = costo;
    }

    public static String getCantidad() {
        return cantidad;
    }

    public static void setCantidad(String cantidad) {
        NuevoIngrediente.cantidad = cantidad;
    }

    public static int getUnidad() {
        return unidad;
    }

    public static void setUnidad(int unidad) {
        NuevoIngrediente.unidad = unidad;
    }

    public static int getCalorias() {
        return calorias;
    }

    public static void setCalorias(int calorias) {
        NuevoIngrediente.calorias = calorias;
    }

    public static int getProteinas() {
        return proteinas;
    }

    public static void setProteinas(int proteinas) {
        NuevoIngrediente.proteinas = proteinas;
    }

    public static int getGrasas() {
        return grasas;
    }

    public static void setGrasas(int grasas) {
        NuevoIngrediente.grasas = grasas;
    }
}
