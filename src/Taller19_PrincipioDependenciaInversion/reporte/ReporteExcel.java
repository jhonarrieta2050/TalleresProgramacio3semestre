package Taller19_PrincipioDependenciaInversion.reporte;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en Excel...");
        System.out.println("Contenido del Excel: " + contenido);
    }
}