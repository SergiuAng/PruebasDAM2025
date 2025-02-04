package vocalfuncion;

import java.util.Scanner;

public class VocalFuncion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra y te dire si es una vocal o consonante");
        char c = sc.next().charAt(0);
        vocal(c);
    }
    
    static void vocal(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            System.out.println("Es una vocal"); 
        } else {
            System.out.println("Es una consonante");
        }
    }
    
}
