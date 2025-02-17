package exercicios.src;
import java.util.Scanner;

public class Imperativos5 {

/*Questão 5: Conversão de Unidades (Comprimento)
Faça um programa que converta metros para centímetros (1m = 100cm).
 */

 public static void main(String[] args) {
    
int numMetros;
int numCentimetros;

Scanner scan = new Scanner(System.in);

System.out.println("Informe o número em metros: ");
numMetros = scan.nextInt();

numCentimetros = numMetros * 100;

System.out.println("O número " + numMetros + " equivale a " + numCentimetros + " centímetros");

scan.close();
}

}
