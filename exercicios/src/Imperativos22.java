package exercicios.src;

import java.util.Scanner;

public class Imperativos22 {

    // Questão 22: Quantidade de Latas de Tintas II
    // Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
    // em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
    // é
    // de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
    // 18
    // litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
    // Informe
    // ao usuário as quantidades de tinta a serem compradas e os respectivos preços
    // em 3
    // situações:
    // ● Comprar apenas latas de 18 litros;
    // ● Comprar apenas galões de 3,6 litros;
    // ● Misturar latas e galões, de forma que o desperdício de tinta seja menor.
    // Acrescente 10% de folga e sempre arredonde os valores para cima, isto é,
    // considere latas cheias.


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a área a ser pintada (m²).");
        double area = scan.nextDouble();
        double cobertura = 1.1 * area / 6;


        int qtdLatas = (int) Math.ceil(cobertura / 18);
        double valorLatas = qtdLatas * 80;

        int qtdGaloes = (int) Math.ceil(cobertura / 3.6);
        double valorGaloes = qtdGaloes * 25;

        int qtdMistoLata = (int) cobertura / 18;

        double resto = cobertura % 18;
        int qtdMistoGaloes = (int) Math.ceil(resto / 3.6);


        // System.out.println("Informe o tamanho em m² da tinta a ser pintada");
        // double area = scan.nextDouble();

        // double litrosTinta = (area / 6) * 1.1;
        // double qtdLatas = litrosTinta / 18;
        // double latasArredondado = Math.ceil(qtdLatas);
        // double valorLatas = latasArredondado * 80;
        // System.out.printf("O valor em latas será de R$ %.2f .\n", valorLatas);

        // double qtdGaloes = litrosTinta / 3.6;
        // double galoesArredondado = Math.ceil(qtdGaloes);
        // double valorGaloes = galoesArredondado * 25;
        // System.out.printf("O valor em galões será de R$ %.2f .\n", valorGaloes);

        // double latasOpt = litrosTinta / 18;
        // double restante = litrosTinta % 18;
        // double galoesOpt = Math.ceil(restante / 3.6);

        // if (restante > 0) {
        //     galoesOpt++;
        // }

        // double valorOtimizado = (latasOpt * 80) + (galoesOpt * 25);
        // System.out.println("Serão necessários " + latasOpt + " latas e " + galoesOpt + "galões.");
        // System.out.printf("O valor otimizando latas e galões é: R$ %.2f", valorOtimizado);

        scan.close();
    }

}
