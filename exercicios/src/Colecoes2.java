package exercicios.src;

import java.util.ArrayList;

import java.util.Scanner;

public class Colecoes2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;

/*        int[] numeros = new int[5];
        int soma = 0;
        

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número. \n", i + 1);
            numeros[i] = scan.nextInt();
            soma += numeros[i];
        }
        
        double media = soma / (double) numeros.length;

        System.out.printf("Soma: %d.\n", soma);
        System.out.printf("Média: %f.\n", media);  

*/

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número. \n", i + 1);
            int numero = scan.nextInt();
            numeros.add(numero);
            soma += numero;
        }    
        
        scan.close();

        System.out.printf("Soma: %d.\n", soma);
    }
}