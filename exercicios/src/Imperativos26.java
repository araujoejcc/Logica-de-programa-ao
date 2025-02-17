package exercicios.src;

import java.util.Scanner;

public class Imperativos26 {

//     Questão 26: Troca de Valores
// Faça um programa para ler dois valores nas variáveis A e B, e efetuar as trocas dos
// valores de forma que a variável A passe a possuir o valor da variável B e a variável
// B passe a possuir o valor da variável A. Apresentar os valores trocados.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor da primeira variável.");
    var varA = scan.nextLine();

    System.out.println("Informe o valor da segunda variável.");
    var varB = scan.nextLine();

    var trocaA = varB;
    var trocaB = varA;

    System.out.println("Valor da primeira variável trocado. " + trocaA);
    
    System.out.println("Valor da segunda variável trocado. " + trocaB);

    scan.close();
}

}
