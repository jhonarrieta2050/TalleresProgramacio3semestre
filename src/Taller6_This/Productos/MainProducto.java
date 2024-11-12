package Taller6_This.Productos;

public class MainProducto {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Camiseta", 19.99);
        Producto producto2 = new Producto("Zapatos", 49.99);

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();
    }
}