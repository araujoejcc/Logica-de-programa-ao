package exercicios.src;
import java.util.Scanner;

public class Imperativos11 {

    // Questão 11: Cálculo da Área de um Triângulo
    // Implemente um programa em Java que receba a base e a altura de um triângulo e
    // imprima sua área. A fórmula da área do triângulo é dada por: 𝐴 = 𝑏𝑎𝑠𝑒 × 𝑎𝑙𝑡𝑢𝑟𝑎 / 2.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da base.");
        double base = scan.nextDouble();

        System.out.println("Informe a altura.");
        double altura = scan.nextDouble();

        double area = (base * altura)/2;
        System.out.println("A área do triângulo é: " + area);

        scan.close();
    }

}
