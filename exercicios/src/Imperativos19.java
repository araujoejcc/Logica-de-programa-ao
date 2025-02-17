package exercicios.src;

import java.util.Scanner;

public class Imperativos19 {

    // Questão 19: Multa sobre o Excesso
    // João Papo-de-Pescador, homem de bem, comprou um microcomputador para
    // controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
    // peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
    // (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
    // você faça um programa que leia a variável peso (peso de peixes) e calcule o
    // excesso.
    // Gravar na variável excesso a quantidade de quilos além do limite e na variável
    // multa o valor da multa que João deverá pagar. Imprima os dados do programa com
    // as mensagens adequadas.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso total de peixes");
        double pesoTotal = scan.nextDouble();

        double excedente = pesoTotal - 50.0;
        double multa = 4.0 * excedente;

        System.out.printf("O excedente de peso é %.2f: kg. \n", excedente);
        System.out.printf("A multa é de R$ %.2f", multa);

        scan.close();

    }

}
