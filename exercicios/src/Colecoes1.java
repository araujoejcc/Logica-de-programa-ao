package exercicios.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // int[] numeros = new int[10];     

        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.printf("Digite o %dº número: \n", i + 1);
        //     numeros[i] = scan.nextInt();
        // }
        // scan.close();

        // for (int i = numeros.length - 1; i >= 0; i--) {
        //     System.out.println(numeros[i]);
        // }
        
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: \n", i + 1);
            numeros.add(scan.nextInt());
        }
        scan.close();

        for (int i = numeros.size() -1; i >= 0; i--) {
            System.out.println(numeros.get(i));
        }

    }

}
