package exercicios.src;

import java.util.Scanner;

public class Condicionais2 {

    // Questão 2: Positivo ou Negativo
    // Faça um programa que peça um número ao usuário e imprima na tela se o valor é
    // positivo ou negativo.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número.");
        int numero = scan.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo");    
        } else {
            System.out.println("O número é 0.");
        }

        scan.close();
    }

}
