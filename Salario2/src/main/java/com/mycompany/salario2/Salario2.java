package com.mycompany.salario2;

import java.util.Scanner;

public class Salario2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un salario: ");
        int salario = scanner.nextInt();
        if (salario < 1000) {
            System.out.println("Tu salario es muy malo.");
        } else if (salario >= 1000 && salario < 1500) {
            System.out.println("Tu salario es malo.");
        } else if (salario >= 1500 && salario < 3000) {
            System.out.println("Tu salario es bueno.");
        } else {
            System.out.println("Tu salario es muy bueno.");
        }
        

    }
}
