package exercicios.src;

import java.util.Scanner;

public class Imperativos31 {

//     Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias
// e mostre-a expressa apenas em dias, suponha todos os meses com 30 dias.

public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

System.out.println("Informe a quantidade de anos");
int idadeAno = scan.nextInt();

System.out.println("Informe a quantidade de meses");
int idadeMes = scan.nextInt(); 

System.out.println("Informe a quantidade de dias");
int idadeDia = scan.nextInt();

int conversaoAno = idadeAno * 365;
int conversaoMes = idadeMes * 30;

System.out.printf("A idade em dias é: %d \n", idadeDia + conversaoAno + conversaoMes);

scan.close();

}

}
