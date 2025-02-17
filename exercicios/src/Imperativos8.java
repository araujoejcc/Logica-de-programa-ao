package exercicios.src;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Imperativos8 {

    // Questão 8: Cálculo de Salário
    // Faça um programa que pergunte quanto você ganha por hora e o número de horas
    // trabalhadas no mês. Calcule e imprima o total do seu salário no referido mês.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual o seu salário por hora.");
        double valorHora = scan.nextDouble();
        System.out.println("Informe o número de horas trabalhadas.");
        int horasTrabalhadas = scan.nextInt();
        double salario = valorHora * horasTrabalhadas;

        DecimalFormat format = new DecimalFormat("R$ #,##0.00");
        System.out.println("O valor do salário é: " + format.format(salario));

        scan.close();

    }

}
