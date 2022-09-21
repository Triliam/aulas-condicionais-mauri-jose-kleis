//Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.

package condicionais;

import java.util.Scanner;

public class Resolucao4 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        boolean valoresIguais = true;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Conforme forem sendo pedidos, digite numeros inteiros e diferentes");
            System.out.println("Digite um numero inteiro");
            a = scan.nextInt();
            System.out.println("Digite um numero inteiro");
            b = scan.nextInt();
            System.out.println("Digite um numero inteiro");
            c = scan.nextInt();
            if (a != b && a !=c && b != c) {
                valoresIguais = false;
                System.out.println("parabens");
            }
                if ((a > b) && (b > c)) {
                    System.out.println(a + " " + b + " " + c);
                }
                if ((b > a) && (a > c)) {
                    System.out.println(b + " " + a + " " + c);
                }
                if ((c > b) && (b > a)) {
                        System.out.println(c + " " + b + " " + a);
            //abc, acb, bac, bca, cab, cba
            }
        } while (valoresIguais);
    }
}
