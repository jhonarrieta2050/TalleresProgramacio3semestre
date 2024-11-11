package Taller2_ModificadorPrivate;

import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();

        System.out.println("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(scanner.nextLine());
        System.out.println("Ingrese la edad del estudiante: ");
        estudiante.setEdad(scanner.nextInt());
        System.out.println("Ingrese la nombre del estudiante: ");
        estudiante.setNotaPromedio(scanner.nextDouble());

        System.out.println(estudiante);
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getNotaPromedio());

    }
}
