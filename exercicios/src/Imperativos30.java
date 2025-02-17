package exercicios.src;

import java.util.Scanner;

public class Imperativos30 {

    // Escrever um programa que leia o nome de um vendedor, o seu salário xo e o total
    // de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
    // ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o
    // salário xo e salário no nal do mês.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor");
        String vendedor = scan.nextLine();

        System.out.println("Informe o salário fixo do vendedor: " + vendedor);
        double salario = scan.nextDouble();

        System.out.println("Informe o total de vendas do vendedor: " + vendedor);
        double vendas = scan.nextDouble();
        
        double comissão = vendas * 0.15;

        System.out.printf("Nome do funcionário: %s \n", vendedor);
        System.out.printf("Salário do funcionário: %.2f \n", salario + comissão);

        scan.close();

    }

}
