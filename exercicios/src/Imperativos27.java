package exercicios.src;

import java.util.Scanner;

public class Imperativos27 {

    // Questão 27: Conversão de Unidades (Moeda)
    // Elaborar um programa que efetue a apresentação do valor da conversão em real
    // (R$) de um valor lido em dólar (US$). O programa deverá solicitar o valor da
    // cotação do dólar e a quantidade de dólares disponíveis com o usuário.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor em Dólares (US$).");
    double valorDolar = scan.nextDouble();

    System.out.println("Informe a cotação do dólar.");
    double cotacao = scan.nextDouble();

    double valorReal = valorDolar * cotacao;
    System.out.printf("US$ %.2f, convertido em Reais é: %.2f. \n", valorDolar, valorReal);

    scan.close();
    
}


}
