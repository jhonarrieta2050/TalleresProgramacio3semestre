package Taller15_Principio.producto;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precioBase;
    private double descuento;


    public Producto(String nombre, String descripcion, double precioBase, double descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.descuento = descuento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }


    public double calcularPrecio() {
        return precioBase - (precioBase * descuento / 100);
    }


    public String generarEtiqueta() {
        return "Producto: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: " + precioBase + " (con descuento: " + descuento + "%)";
    }
}