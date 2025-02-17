package exercicios.src;

import java.util.Scanner;

public class Imperativos21 {

    // Questão 21: Quantidade de Latas de Tintas I
    // Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
    // em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
    // de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
    // litros, que custam R$ 80,00. Informe ao usuário as quantidades de latas de tinta a
    // serem compradas e o preço total.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a área a ser pintada (m²).");
        double area = scan.nextDouble();
        double cobertura = area / 3;
        int qtdLatas = (int) Math.ceil(cobertura / 18);
        double valorTotal = qtdLatas * 80;

        System.out.println("Serão necessárias " + qtdLatas + " latas.");
        System.out.printf("O valor total será de R$ %.2f. \n", valorTotal);

        scan.close();
    }

}
