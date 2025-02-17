package exercicios.src;

import java.util.Scanner;

public class Imperativos15 {

    // Questão 15: Cálculo do Volume de um Cone
    // Implemente um programa em Java que receba o raio da base e a altura de um
    // cone e retorne seu volume. A fórmula do volume do cone é: 𝑉 = 1 / 3 × 𝜋 × 𝑟² × ℎ.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da base.");
        double raio = scan.nextDouble();

        System.out.println("Informe a altura.");
        double altura = scan.nextDouble();

        double volume = 1.0 / 3.0 * Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("O volume é: %.2f", volume);

        scan.close();
    }

}
