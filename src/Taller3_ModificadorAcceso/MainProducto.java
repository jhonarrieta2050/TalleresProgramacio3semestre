package Taller3_ModificadorAcceso;

public class MainProducto {
    public static void main(String[] args) {

        Producto producto = new Producto("Laptop", 1200.99, 10);

        producto.nombre = "Tablet";
        producto.precio = 800.50;
        producto.stock = 5;

        producto.mostrarInfo();
    }
}