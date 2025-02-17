package exercicios.src;

import java.util.Scanner;

public class Imperativos28 {

    // Faça um programa que receba um valor que foi depositado e exiba o valor com
    // rendimento após um mês. Considere xo o juro da poupança em 0,50% a.m.
    
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um valor a ser depositado");
    double valor = scan.nextDouble();

    double rendimento = valor * 1.005;

    System.out.printf("Valor após o rendimento: R$ %.2f \n", rendimento);
    scan.close();
}

}
