package Taller12_HerenciaMultiple.pez;

public class Pez implements Nadador, Respirador {
    private String especie;

    public Pez(String especie) {
        this.especie = especie;
    }

    @Override
    public void nadar() {
        System.out.println(especie + " está nadando.");
    }

    @Override
    public void respirar() {
        System.out.println(especie + " está respirando bajo el agua.");
    }

    public void mostrarDetalles() {
        System.out.println("Especie de pez: " + especie);
    }
}