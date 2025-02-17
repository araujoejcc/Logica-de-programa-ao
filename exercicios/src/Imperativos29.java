package exercicios.src;

import java.util.Scanner;

public class Imperativos29 {

//     A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações
// sem juros. Faça um programa que receba um valor de uma compra e mostre o valor
// das prestações.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor da compra: ");
    double valor = scan.nextDouble();

    scan.close();

    double prestação = valor /5;

    System.out.printf("Valor da parcela: R$ %.2f \n", prestação);


}

}
