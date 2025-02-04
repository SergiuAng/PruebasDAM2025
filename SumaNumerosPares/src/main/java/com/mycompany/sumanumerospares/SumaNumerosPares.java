package com.mycompany.sumanumerospares;

import java.util.Scanner;

public class SumaNumerosPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero y positivo.");
        int num = scanner.nextInt();
        int suma = 0;
        int i = 1;
        if (num < 0 || num == 0) {
            System.out.println("Los numeros negativos o el 0 no valen.");
        }
        while (i <= num) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
            i++;
        }
        System.out.println("La suma es " + suma);
    }
}
