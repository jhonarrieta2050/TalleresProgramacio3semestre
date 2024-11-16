package Taller19_PrincipioDependenciaInversion.reporte;

public class Main {
    public static void main(String[] args) {

        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        gestorPDF.generar("Reporte de ventas - Octubre");

        System.out.println("------------------------------");

        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        gestorExcel.generar("Reporte de inventario - Noviembre");
    }
}
