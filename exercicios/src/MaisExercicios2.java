package exercicios.src;

import java.util.Scanner;

public class MaisExercicios2 {

    // Questão 2: Salário de Funcionário
    // Escreva um programa que leia o nome de um funcionário, seu número de horas
    // trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A
    // seguir, mostre o nome e o salário desse funcionário, com duas casas decimais.
    // Entrada
    // O arquivo de entrada contém um texto, um número inteiro e um número com duas
    // casas decimais, representando o nome, quantidade de horas trabalhadas e o valor
    // que o funcionário recebe por hora trabalhada, respectivamente.
    // Saída
    // Imprima o nome e o salário do funcionário, conforme exemplos fornecidos, com um
    // espaço em branco antes e depois da igualdade. No caso do salário, também deve
    // haver um espaço em branco após o R$.

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do Funcionário");
        String nome = scan.nextLine();

        System.out.println("Informe o número de horas trabalhadas");
        int horas = scan.nextInt();

        System.out.println("Informe o valor por hora trabalhada");
        double valor = scan.nextDouble();

        double salario = horas * valor;
        System.out.printf("FUNCIONÁRIO = %s \n", nome);
        System.out.printf("SALARIO = R$ %.2f \n", salario);

        scan.close();

    }

}
