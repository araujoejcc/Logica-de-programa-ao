package exercicios.src;
import java.util.Scanner;

public class Imperativos7 {

    // Questão 7: Área de um Quadrado
    // Faça um programa que calcule a área de um quadrado, em seguida imprima o
    // dobro desta área para o usuário. A área de um quadrado é dada por 𝐴 , onde
    // 𝑄 = 𝐿
    // 2
    // 𝐿
    // é o comprimento do lado do quadrado.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do lado do quadrado:");

        double lado = scan.nextDouble();
        double area = Math.sqrt(lado);
        double resultado = 2 * area;

        System.out.println("O dobro da área do quadrado é: " + resultado);

        scan.close();

    }

}
