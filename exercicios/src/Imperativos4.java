package exercicios.src;
import java.util.Scanner;

public class Imperativos4 {

/*Questão 4: Média de Notas Bimestrais
Faça um programa que peça as 4 notas bimestrais de um aluno e imprima a média */

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double nota1, nota2, nota3, nota4;
    double media;

    System.out.println("Informe a primeira nota bimestral: ");
    nota1 = scan.nextFloat();
    System.out.println("Informe a segunda nota bimestral: ");
    nota2 = scan.nextFloat();
    System.out.println("Informe a terceira nota bimestral: ");
    nota3 = scan.nextFloat();
    System.out.println("Informe a quarta nota bimestral: ");
    nota4 = scan.nextFloat();

    media = ((nota1 + nota2 + nota3 + nota4)/4);
    System.out.println("A média das notas é: " + media);
    scan.close();
}

}