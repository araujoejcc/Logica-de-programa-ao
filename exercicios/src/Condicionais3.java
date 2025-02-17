package exercicios.src;

import java.util.Scanner;

public class Condicionais3 {

    // Questão 3: Masculino ou Feminino
    // Faça um programa que verique se uma letra digitada é "F" ou "M". Conforme a
    // letra digitada pelo usuário, o programa deve imprimir: F - Feminino, M -
    // Masculino,
    // ou Sexo Inválido.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o sexo: (F) ou (M).");
        String input = scan.nextLine().toLowerCase();

        if (input.charAt(0) == 'f') {
            System.out.println("F - Feminino");
        } else if (input.charAt(0) == 'm') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }

        scan.close();
    }

}
