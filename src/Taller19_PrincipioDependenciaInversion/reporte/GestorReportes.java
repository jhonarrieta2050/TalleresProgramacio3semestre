package Taller19_PrincipioDependenciaInversion.reporte;

public class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void generar(String contenido) {
        generador.generarReporte(contenido);
    }
}