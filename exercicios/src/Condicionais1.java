package exercicios.src;



import java.util.Scanner;

public class Condicionais1 {

    // Questão 1: Maior de Dois Números
    // Faça um programa que peça dois números ao usuário e imprima o maior deles

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numero1 = scan.nextInt();

        System.out.println("Informe o segundo número:");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }

        scan.close();
    }

}
