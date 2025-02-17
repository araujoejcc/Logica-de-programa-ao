package exercicios.src;

import java.util.Scanner;

public class Imperativos16 {

//     Questão 16: Conversor de Unidade (Peso)
// Implemente um programa em Java que receba um valor em quilogramas e retorne
// o valor equivalente em libras. Considere que 1 kg é equivalente a 2,20462 libras.

public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

System.out.println("Informe o valor em quilogramas.");
double quilogramas = scan.nextDouble();

double libras = quilogramas * 2.20462;
System.out.println("O valor em libras é: " + libras);

scan.close();

}

}
