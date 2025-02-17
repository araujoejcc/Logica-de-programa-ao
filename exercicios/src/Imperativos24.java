package exercicios.src;

import java.util.Scanner;

public class Imperativos24 {

    // Questão 24: Calculadora I
    // Faça um programa que receba dois números e ao nal mostre a soma, subtração,
    // multiplicação e a divisão dos números lidos.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número.");
        double numero1 = scan.nextDouble();

        System.out.println("Informe o segundo número.");
        double numero2 = scan.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + subtracao);
        System.out.println("A multiplicação dos valores é: " + multiplicacao);
        System.out.println("A divisão dos valores é: " + divisao);

        scan.close();
    }

}
