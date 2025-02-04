package maximonumsfunciones;

import java.util.Scanner;

public class MaximoNumsFunciones {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();
        compara(num1,num2);
        System.out.println("El mayor de esos numeros es: " + compara(num1,num2));
    }
    
    
    static int compara(int num1,int num2){
        int mayor;
        if (num1 > num2){
            mayor = num1;
        } else {
            mayor = num2;
        }
        return(mayor);
    }
}
