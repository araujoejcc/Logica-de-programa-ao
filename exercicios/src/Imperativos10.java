package exercicios.src;
import java.util.Scanner;

public class Imperativos10 {

    // Questão 10: Cálculo do Volume de uma Esfera
    // Implemente um programa em Java que receba o raio de uma esfera e retorne seu
    // volume. A fórmula do volume de uma esfera é dado por: 𝑉 = 4 / 3 × 𝜋 × 𝑟³

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio.");
        double raio = scan.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.println("O volume da esfera é: " + volume + " m³");

        scan.close();
    }

}
