package exercicios.src;
import java.util.Scanner;

public class Imperativos12 {

    // Questão 12: Cálculo do Volume de um Cilindro
    // Implemente um programa em Java que receba o raio da base e a altura de um
    // cilindro e retorne seu volume. A fórmula do volume do cilindro é: 𝑉 = 𝜋 × 𝑟² × ℎ.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do raio da base.");
        double raio = scan.nextDouble();

        System.out.println("Informe o valor da altura.");
        double altura = scan.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume é: " + volume);

        scan.close();
    }

}
