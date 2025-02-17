package exercicios.src;

import java.util.Scanner;

public class Imperativos14 {

    // Questão 14: Cálculo do Volume de um Cubo
    // Implemente um programa em Java que receba o comprimento da aresta de um
    // cubo e retorne seu volume. A fórmula do volume do cubo é: 𝑉 = 𝑎𝑟𝑒𝑠𝑡𝑎³.
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor da aresta");
        
        double aresta = scan.nextDouble();
        double volume = Math.pow(aresta, 3);

        System.out.println("O volume total é: " + volume);

        scan.close();

    }

}
