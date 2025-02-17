package exercicios.src;

import java.util.Scanner;

public class Imperativos23 {

    // Questão 23: Tempo de Download
    // Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
    // velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
    // de download do arquivo usando este link (em minutos).

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo para download (Mb).");
        double tamanho = scan.nextInt();

        System.out.println("Informe a velocidade do link de internet (Mbps).");
        double velocidade = scan.nextInt();

        double tempo = (tamanho / velocidade) / 60;

        System.out.println("O tempo aproximado de download será de " + tempo + " minutos");

        scan.close();

    }

}
