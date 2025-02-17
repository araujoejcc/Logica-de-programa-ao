package exercicios.src;

import java.util.Scanner;

public class Imperativos17 {

// Questão 17: Cálculo de Peso Ideal I
// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
// calcule seu peso ideal, usando a seguinte fórmula: (72.7 * altura) - 58.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe sua altura.");
    double altura = scan.nextDouble();

    double pesoIdeal = (72.7 * altura) - 58.0;

    System.out.println("Seu peso ideal é: " + pesoIdeal);

    scan.close();
}

}
