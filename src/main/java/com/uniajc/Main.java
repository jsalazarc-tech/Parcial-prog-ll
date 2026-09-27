package com.uniajc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==========================================
        // 1. LIBRO 1 - CONSTRUCTOR CON PARAMETROS
        // ==========================================

        Libro libro1 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                5,
                2
        );

        System.out.println("========== LIBRO 1 ==========");
        System.out.println(libro1);


        // ==========================================
        // 2. LIBRO 2 - CONSTRUCTOR POR DEFECTO
        // ==========================================

        Libro libro2 = new Libro();

        System.out.println("\n========== LIBRO 2 ==========");

        System.out.print("Ingrese el título: ");
        libro2.setTitulo(sc.nextLine());

        System.out.print("Ingrese el autor: ");
        libro2.setAutor(sc.nextLine());

        System.out.print("Ingrese el número de ejemplares: ");
        libro2.setNumeroEjemplares(sc.nextInt());

        System.out.print("Ingrese el número de ejemplares prestados: ");
        libro2.setNumeroEjemplaresPrestados(sc.nextInt());

        sc.nextLine();

        System.out.println("\nDatos del libro 2:");
        System.out.println(libro2);


        // ==========================================
        // 3. LIBRO TEXTO UNIAC
        // ==========================================

        LibroTextoUNIAC libroUniac = new LibroTextoUNIAC(
                "Programación Orientada a Objetos",
                "Juan Pérez",
                10,
                3,
                "Programación II",
                "Facultad de Ingeniería"
        );

        System.out.println("\n========== LIBRO TEXTO UNIAC ==========");
        System.out.println(libroUniac);


        // ==========================================
        // 4. NOVELA
        // ==========================================

        Novela novela = new Novela(
                "1984",
                "George Orwell",
                4,
                1,
                "Ciencia ficción"
        );

        System.out.println("\n========== NOVELA ==========");
        System.out.println(novela);


        // ==========================================
        // 5. PRUEBA DE PRESTAMO
        // ==========================================

        System.out.println("\n========== PRESTAMO ==========");

        if (libro1.prestamo()) {
            System.out.println("El préstamo se realizó correctamente.");
        } else {
            System.out.println("No hay ejemplares disponibles.");
        }

        System.out.println(libro1);


        // ==========================================
        // 6. PRUEBA DE DEVOLUCION
        // ==========================================

        System.out.println("\n========== DEVOLUCION ==========");

        if (libro1.devolucion()) {
            System.out.println("La devolución se realizó correctamente.");
        } else {
            System.out.println("No hay libros prestados.");
        }

        System.out.println(libro1);

        sc.close();
    }
}