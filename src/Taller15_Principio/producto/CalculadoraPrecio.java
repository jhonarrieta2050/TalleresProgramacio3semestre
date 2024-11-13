package Taller15_Principio.producto;

public class CalculadoraPrecio {
    public double calcularPrecio(Producto producto) {
        return producto.getPrecioBase() - (producto.getPrecioBase() * producto.getDescuento() / 100);
    }
}