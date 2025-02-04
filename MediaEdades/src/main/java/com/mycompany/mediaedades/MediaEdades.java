package com.mycompany.mediaedades;

import java.util.Scanner;

public class MediaEdades {

    public static void main(String[] args) {
        System.out.println("Introduce las edades de los alumnos del centro: ");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        int sumaEdad = 0;
        int contAlumno = 0;
        int mayorEdad = 0;
        while (edad >= 0){
            sumaEdad = edad + sumaEdad;
            contAlumno++;
            if (edad >= 18){
                mayorEdad++;
            }
            edad = scanner.nextInt();
        }
        if (sumaEdad <= 0){
            System.out.println("Esa edad no es valida, introduce una edad valida");
        } else {
        double media = (double)sumaEdad / (double)contAlumno;
        System.out.println("La suma de las edades es: " + sumaEdad);
        System.out.println("La media de las edades es: "+ media);
        System.out.println("El numero de alumnos totales es: "+ contAlumno);
        System.out.println("Los alumnos mayores de edad son: "+ mayorEdad);
        }
    }
}
