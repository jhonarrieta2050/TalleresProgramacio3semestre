package Taller16_AbiertoCerrado.tienda;

public class DescuentoFijo extends Descuento{

    @Override
    public  double aplicarDescuento() {
        System.out.println("Aplicando Descuento fijo");
        return 0.0;
    }
}
