package exercicios.src;
import java.util.Scanner;

public class Imperativos3 {
    
/*Questão 3: Soma de Dois Números
Faça um programa que peça dois números e imprima a soma. */

public static void main(String[] args) {
    
double numero1;
double numero2;

Scanner scan = new Scanner(System.in);
System.out.println("Informe o primeiro número: ");
numero1 = scan.nextDouble();
System.out.println("Informe o segundo número: ");
numero2 = scan.nextDouble();

double resultado = numero1 + numero2;
System.out.println("A soma dos números é: " + resultado);
scan.close();
}

}
