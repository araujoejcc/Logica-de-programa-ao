package exercicios.src;

import java.util.Scanner;

public class Imperativos13 {

    // Questão 13: Cálculo da Área de um Retângulo
    // Implemente um programa em Java que receba a largura e a altura de um retângulo
    // e imprima sua área. A fórmula da área do retângulo é: 𝐴 = 𝑙𝑎𝑟𝑔𝑢𝑟𝑎 × 𝑎𝑙𝑡𝑢𝑟𝑎.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a largura.");
        double largura = scan.nextDouble();

        System.out.println("Informe a altura.");
        double altura = scan.nextDouble();

        double area = largura * altura;
        System.out.println("A área do retângulo é: " + area);

        scan.close();
    }


}
