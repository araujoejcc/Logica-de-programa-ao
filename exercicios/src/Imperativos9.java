package exercicios.src;
import java.util.Scanner;

public class Imperativos9 {

// Questão 9: Conversão de Unidades (Temperatura)
// Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
// mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
// A fórmula de conversão é: 𝐹 = 9 / 5 × 𝐶 + 32

public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

System.out.println("Informe a temperatura em graus Farenheit.");
double temperaturaF = scan.nextDouble();
double temperaturaC = 5 * ((temperaturaF - 32.0)/9.0);

System.out.printf("A temperatura convertida é: %.2fºC \n", temperaturaC);

scan.close();
}

}
