package Taller19_PrincipioDependenciaInversion.reporte;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en PDF...");
        System.out.println("Contenido del PDF: " + contenido);
    }
}