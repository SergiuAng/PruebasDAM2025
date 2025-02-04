package sumanumparesfor;

import java.util.Scanner;

public class SumaNumParesFOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("Los numeros pares que hay hasta " + num + " son " + i);
            }
        }
    }
}
