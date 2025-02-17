package exercicios.src;

import java.util.Scanner;

public class MaisExercicios6 {

    // Calcule o consumo médio de um automóvel sendo fornecidos a distância total
    // percorrida (em km) e o total de combustível gasto (em litros).
    // Entrada
    // O arquivo de entrada contém dois valores: um valor inteiro X representando a
    // distância total percorrida (em km) e um valor real Y representando o total de
    // combustível gasto, com um dígito após o ponto decimal.
    // Saída
    // Apresente o valor que representa o consumo médio do automóvel com duas casas
    // decimais, seguido da mensagem "km/l"

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a distância percorrida (km):");
        int distancia = scan.nextInt();
        
        System.out.println("Informe o total de combustível gasto (l):");
        double combustivel = scan.nextDouble();

        double consumo = distancia / combustivel;

        System.out.printf("Consumo médio: %.2f km/l \n", consumo);

        scan.close();
    }

}
