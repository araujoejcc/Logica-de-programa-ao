package exercicios.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes10 {

    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int[] arrayNumeros = new int[5];    
    ArrayList<Integer> listaNumeros = new ArrayList<>();

    for (int i = 0; i < arrayNumeros.length; i++) {
        System.out.printf("Informe o %dº número: \n", i + 1);
        arrayNumeros[i] = scan.nextInt();
        listaNumeros.add(arrayNumeros[i]);
    }

    scan.close();
    System.out.println("------------------------------------------");
    for (int i : listaNumeros) {
        System.out.println(i);
    }

    }

}