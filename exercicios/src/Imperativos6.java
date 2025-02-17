package exercicios.src;

import java.util.Scanner;

public class Imperativos6 {

    /*
     * Questão 6: Área de um Círculo
     * Faça um programa que peça o raio de um círculo, calcule e imprima sua área. A
     * área de um círculo é dada por 𝐴 , onde é o raio do círculo. Considere
     * 𝐶 = 2 × π × 𝑅
     * 2 𝑅
     * π = 3,14.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do círculo.");
        double raio = scan.nextDouble();

        double area = (Math.PI * (Math.pow(raio, 2)));
        System.out.printf("A área do círculo informado é: %..2f \n", area);

        scan.close();
    }

}
