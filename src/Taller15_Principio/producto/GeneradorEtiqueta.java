package Taller15_Principio.producto;

public class GeneradorEtiqueta {
    public String generarEtiqueta(Producto producto) {
        return "Producto: " + producto.getNombre() + "\nDescripción: " + producto.getDescripcion() + "\nPrecio: " + producto.getPrecioBase() + " (con descuento: " + producto.getDescuento() + "%)";
    }
}
