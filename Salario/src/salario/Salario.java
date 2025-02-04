
package salario;


import java.util.Scanner;


public class Salario {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un salario: ");
        int salario = scanner.nextInt();
        if (salario < 1000) {
            System.out.println("Tu salario es muy malo.");
        } else if (salario < 1500) {
            System.out.println("Tu salario es malo.");
        } else if (salario < 3000) {
            System.out.println("Tu salario es bueno.");
        } else {
            System.out.println("Tu salario es muy bueno.");
        }
        

    }
    /* public static*/
}
/*Public class*/