package exercicios.src;

import java.util.Scanner;

public class MaisExercicios1 {

public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

// System.out.println("Informe a primeira nota");
// float notaA = scan.nextFloat();

// System.out.println("Informe a segunda nota");
// float notaB = scan.nextFloat();

// float media = (float) (((notaA * 3.5) + (notaB * 7.5)) / 11);

// System.out.printf("MÉDIA = %f", media);


System.out.println("Informe a primeira nota");
double notaA = scan.nextFloat();

System.out.println("Informe a segunda nota");
double notaB = scan.nextFloat();

double media = (notaA * 3.5 + notaB * 7.5) / 11;

System.out.printf("MÉDIA = %.5f", media);

scan.close();

}
    
}
