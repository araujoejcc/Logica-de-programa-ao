package exercicios.src;

import java.util.Scanner;

public class Imperativos34 {
    
    // Dado um número inteiro, positivo e menor do que 1000, imprimir a quantidade de
    // centenas, dezenas e unidades desse número.
    // Exemplo: Dado o número 764, imprimir:
    // Centena = 7, Dezena = 6 e Unidade = 4

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro, positivo e menor do que 1000");
        int numero = scan.nextInt();

        int centena = numero / 100;
        int restoCentena = numero % 100;
        int dezena = restoCentena / 10;
        int restoDezena = restoCentena % 10;
        int unidade = restoDezena;

        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);

        scan.close();

    }

}
