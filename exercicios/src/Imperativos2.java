package exercicios.src;
import java.util.Scanner;

public class Imperativos2 {

/*Questão 2: Número Informado
Faça um programa que peça um número e então mostre a mensagem:
O número informado foi [número].
 */

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um número: ");
    double numero = scan.nextDouble();

    System.out.println("O número informado foi: " + numero);
    scan.close();

    }
    
}
