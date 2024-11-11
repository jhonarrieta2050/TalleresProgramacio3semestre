package Taller1_Contructores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Numero de paginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine();
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        System.out.print("Numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

    }
}