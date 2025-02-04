package com.mycompany.porpuesto31;

import java.util.Scanner;

public class Porpuesto31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una edad");
        int edad = scanner.nextInt();
        int edadMin = edad;
        int edadMax = edad;
        while (edad >= 0) {
            if (edad < edadMin) {
                edadMin = edad;
            }
            if (edad > edadMax) {
                edadMax = edad;
            }
            edad = scanner.nextInt();
            if (edad < 0) {
                System.out.println("La edad Minima es " + edadMin + " y la edad Maxima es " + edadMax);
            }
        }
        if (edadMin < 0 && edadMax < 0) {
            System.out.println("Esa edad no vale prueba a poner un numero positivo");
        }
    }
}
