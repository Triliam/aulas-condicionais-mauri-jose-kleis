//Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento.
//Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
//Código Condição de pagamento
//a) À vista em dinheiro ou cheque, recebe 10% de desconto
//b) À vista no cartão de crédito, recebe 15% de desconto
//c) Em duas vezes, preço normal de etiqueta sem juros
//d) Em 10 vezes, preço normal de etiqueta mais juros de 10%

package condicionais;

import java.util.Scanner;

public class Resolucao6 {
    public static void main(String[] args) {

        double preco;
        int opcao;
        double valor;

        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o valor do produto");
        preco = scan.nextDouble();
        System.out.println("Entre com a forma de pagamento, digite 1 para: À vista em dinheiro ou cheque, recebe 10% de desconto. Digite 2 para: À vista no cartão de crédito, recebe 15% de desconto. Digite 3 para: Em duas vezes, preço normal de etiqueta sem juros. Digite 4 para: Em 10 vezes, preço normal de etiqueta mais juros de 10%");
        opcao = scan.nextInt();
        if (opcao == 1) {
            valor = preco * 0.9;
            System.out.println("Ganhouuu 10% de desconto! viva!: " + valor);
        }
        if(opcao == 2) {
            valor = preco * 0.85;
            System.out.println("Ganhouuu 15% de desconto! viva!: " + valor);
        }
        if (opcao == 3) {
            System.out.println("Mesmo valor: " + preco);
        }
        if (opcao == 4) {
            valor = preco + (0.10 * preco);
            System.out.println("Sera acrescentado 10% no valor total, valor: " + valor);
        }
    }
}
