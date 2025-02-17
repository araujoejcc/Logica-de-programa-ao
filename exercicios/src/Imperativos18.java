package exercicios.src;

import java.util.Scanner;

public class Imperativos18 {

    // Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
    // que calcule seu peso ideal, utilizando as seguintes fórmulas:
    // a. Para homens: (72.7*h) - 58
    // b. Para mulheres: (62.1*h) - 44.7

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a altura.");
        double altura = scan.nextDouble();
        double pesoIdealM = (72.7 * altura) - 58;
        double pesoIdealF = (62.1 * altura) - 44.7;

        System.out.println("O peso ideal para homem é: " + pesoIdealM);
        System.out.println("O peso ideal para mulher é: " + pesoIdealF);

        scan.close();
        }

    }

