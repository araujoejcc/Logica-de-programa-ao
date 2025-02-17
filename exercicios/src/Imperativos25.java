package exercicios.src;

import java.util.Scanner;

public class Imperativos25 {

//     Questão 25: Calculadora II
// Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre:
// a. O produto do dobro do primeiro com metade do segundo.
// b. A soma do triplo do primeiro com o terceiro.
// c. O terceiro elevado ao cubo.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o primeiro número inteiro.");
    int numero1 = scan.nextInt();

    System.out.println("Informe o segundo número inteiro.");
    int numero2 = scan.nextInt();
    
    System.out.println("Informe o número real.");
    double numero3 = scan.nextDouble();

    double calculo1 = (numero1 * 2) * (numero2 / 2);
    System.out.println("O produto do dobro do primeiro com metade do segundo é: " + calculo1);

    double calculo2 = (numero1 * 3) + numero3;
    System.out.println("A soma do triplo do primeiro com o terceiro é: " + calculo2);

    double calculo3 = Math.pow(numero3, 3);
    System.out.println("O terceiro elevado ao cubo é: " + calculo3);
    
    scan.close();

}

}
