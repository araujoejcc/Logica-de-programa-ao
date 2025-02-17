package exercicios.src;

import java.util.Scanner;

public class MaisExercicios3 {

    // Faça um programa que lê o nome de um vendedor, o seu salário xo e o total de
    // vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
    // 15% de comissão sobre suas vendas efetuadas, informar o total a receber no nal
    // do mês, com duas casas decimais.
    // Entrada
    // O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de
    // dupla precisão com duas casas decimais, representando o salário xo do vendedor
    // e o montante total das vendas efetuadas por este vendedor, respectivamente.

    public static void main(String[] args) {
        
                Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor");
        String vendedor = scan.nextLine();

        System.out.println("Informe o salário fixo do vendedor: " + vendedor);
        double salario = scan.nextDouble();

        System.out.println("Informe o total de vendas do vendedor: " + vendedor);
        double vendas = scan.nextDouble();
        
        double comissão = vendas * 0.15;

        System.out.printf("TOTAL: R$ %.2f \n", salario + comissão);

        scan.close();

    }

}
