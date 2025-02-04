package com.mycompany.resuevenumero;

import java.util.Scanner;

public class ResueveNumero {

    public static void main(String[] args) {
        System.out.println("Introduce un numero que alguien tendra que adivinar(Tiene que ser entre 1 y 100): ");
        Scanner scanner = new Scanner(System.in);
        int numSecreto = scanner.nextInt();
        System.out.println("Introduce el numero que crees que es. NO VALEN DECIMALES");
        int numIntroducido = scanner.nextInt();
        int numCont = 10;
        if (numSecreto <= 0){
            System.out.println("Los numeros negativos no valen, dile a tu compi que es un truan");
        } if (numSecreto > 100){
            System.out.println("Los numeros por encima de 100 no valen, dile a tu compi que es un truan");
        }
        System.out.println("TIENES 10 INTENTOS, ATENTO!");
        if (numIntroducido < 0){
            System.out.println("¿YA TE RINDES?");
        }   
        while (numSecreto > 0 && numSecreto <= 100) {
            if (numIntroducido < numSecreto){
                System.out.println("El numero introducido es menor que el secreto");
                numCont--;
                System.out.println("Te quedan " +numCont+ " intentos");
            }
            if (numIntroducido > numSecreto){
                System.out.println("El numero introducido es mayor que el secreto");
                numCont--;
                System.out.println("Te quedan " +numCont+ " intentos");

            }
            if (numIntroducido == numSecreto){
                System.out.println(" ¡Has acertado! ");
            } 
            numIntroducido = scanner.nextInt();
            if (numCont == 1){
                System.out.println("Se acabo el juego, te has quedado sin intentos");
                break;
            }
        }
        
    }
}
