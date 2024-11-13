package Taller15_Principio.producto;

public class Main {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto = new Producto("Laptop", "Laptop de última generación", 1500.00, 10);

        // Calcular el precio con descuento
        CalculadoraPrecio calculadoraPrecio = new CalculadoraPrecio();
        double precioConDescuento = calculadoraPrecio.calcularPrecio(producto);
        System.out.println("Precio con descuento: " + precioConDescuento);

        // Generar etiqueta del producto
        GeneradorEtiqueta generadorEtiqueta = new GeneradorEtiqueta();
        String etiqueta = generadorEtiqueta.generarEtiqueta(producto);
        System.out.println(etiqueta);
    }
}