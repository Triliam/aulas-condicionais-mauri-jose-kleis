//Entre com um numero e verifique se ele eh par ou impar

package condicionais;

import java.util.Scanner;

public class Resolucao1 {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro");
        num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("O numero eh PAR !!");
        } else {
            System.out.println("O numero eh IMPAR !");
        }


    }
}
