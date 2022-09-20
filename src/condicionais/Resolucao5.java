//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//a) para homens: (72.7 * h) – 58;
//b) para mulheres: (62.1 * h) – 44.7.

package condicionais;

import java.util.Scanner;

public class Resolucao5 {
    public static void main(String[] args) {

        double h;
        String sexo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual sua altura?");
        h = scan.nextDouble();
        System.out.println("ok, sua altura eh: " + h + " Agora digite M se for mulher e H se for homem");
        sexo = scan.next();
        if (sexo.equalsIgnoreCase("m")){
            double peso = (62.1 * h) - 44.7;
            System.out.println("Peso ideal eh de: " + peso);
        } else if (sexo.equalsIgnoreCase("h")){
            double peso = (72.7 * h) - 58;
            System.out.println("Peso ideal eh de: " + peso);
        } else {
            System.out.println("vc nao digitou um valor valido, comece novamente");
        }

    }
}
