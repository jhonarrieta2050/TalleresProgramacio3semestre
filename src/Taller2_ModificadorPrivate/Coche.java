package Taller2_ModificadorPrivate;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima >= 0) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
        }
    }
}