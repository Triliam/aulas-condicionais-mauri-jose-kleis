//Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

package condicionais;

import java.util.Scanner;

public class Resolucao3 {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero positivo ou negativo");
        num = scan.nextInt();
        if (num > 0) {
            System.out.println("Escolheu um numero positivo, entao o dobro do numero escolhido eh: " + num * 2);
        } else {
            System.out.println("Escolheu um numero negativo, entao o triplo do numero escolhido eh: " + num * 3);
        }
    }
}
