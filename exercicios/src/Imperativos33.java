package exercicios.src;

import java.util.Scanner;

public class Imperativos33 {
    
//     O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
// percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre
// o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado).
// Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%.
// Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao
// consumidor do mesmo.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o custo de fábrica");
    double custo = scan.nextDouble();

    double impostos = custo * 1.45;
    double valorFinal = impostos * 1.28;

    System.out.printf("O valor para o consumidor é de: R$ %.2f \n", valorFinal);

    scan.close();
}


}
