//Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois,
// caso contrário multiplique A por B.
// Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.

package condicionais;

import java.util.Scanner;

public class Resolucao2 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        //int a, b, c;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor do primeiro numero");
        a = scan.nextInt();
        System.out.println("Entre com o valor do segundo numero");
        b = scan.nextInt();

        if (a == b) {
            c = a + b;
            System.out.println("Sendo numeros iguais, a soma eh: " + c);
        } else {
            c = a * b;
            System.out.println("Sendo numeros diferentes, a multiplicacao eh: " + c);
        }
    }
}
