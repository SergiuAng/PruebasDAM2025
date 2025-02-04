
package entornosdesarrollo;

import java.util.Scanner;

public class EntornosDesarrollo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de comida que hay");
        double comidaDiaria = scanner.nextDouble();
        System.out.println("Introduce los animales que hay");
        double numAnimales = scanner.nextDouble();
        System.out.println("Los kilos que come cada animal");
        double KilosPorAnimal = scanner.nextDouble();
        double consumo = numAnimales * KilosPorAnimal;

        if (consumo <= comidaDiaria) {
            System.out.println("Hay comida de sobra y a cada animal le corresponden " + KilosPorAnimal + " Kilos.");
        } else {
            System.out.println("No tenemos la comida necesaria para cada animal");
            System.out.println("Por lo tanto a cada animal se le dará comida de forma porporcional.");

        }

    }
}