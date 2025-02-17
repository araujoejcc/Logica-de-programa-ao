package exercicios.src;

import java.util.Scanner;

public class MaisExercicios7{

//     Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
// no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10,
// 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
// Entrada
// O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
// Saída
// Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
// necessárias, conforme o exemplo fornecido.

public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

System.out.println("Informe um valor inteiro");
int valor = scan.nextInt();

int notas100 = valor / 100;
int resto100 = valor % 100;

int notas50 = resto100 / 50;
int resto50 = resto100 % 50;

int notas20 = resto50 / 20;
int resto20 = resto50 % 20;

int notas10 = resto20 / 10;
int resto10 = resto20 % 10;

int notas5 = resto10 / 5;
int resto5 = resto10 % 5;

int notas2 = resto5 / 2;
int resto2 = resto5 % 2;

int notas1 = resto2;

System.out.println(valor);
System.out.printf("%d nota(s) de R$ 100,00 \n", notas100);
System.out.printf("%d nota(s) de R$ 50,00 \n", notas50);
System.out.printf("%d nota(s) de R$ 20,00 \n", notas20);
System.out.printf("%d nota(s) de R$ 10,00 \n", notas10);
System.out.printf("%d nota(s) de R$ 5,00 \n", notas5);
System.out.printf("%d nota(s) de R$ 2,00 \n", notas2);
System.out.printf("%d nota(s) de R$ 1,00 \n", notas1);

scan.close();

}


}
