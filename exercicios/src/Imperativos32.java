package exercicios.src;

import java.util.Scanner;

public class Imperativos32 {
    
    // Faça um programa que receba o preço de custo de um produto e mostre o valor de
    // venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um
    // percentual informado pelo usuário.


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço de custo do produto");
        double preco = scan.nextDouble();

        System.out.println("Informe o percentual de acréscimo");
        int acrescimo = scan.nextInt();

        double precoFinal = preco + (preco * acrescimo) / 100;

        System.out.printf("O preço final é: R$ %.2f \n", precoFinal);

        scan.close();
        
    }
}
