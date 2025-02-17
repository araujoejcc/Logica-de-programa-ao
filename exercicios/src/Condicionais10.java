package exercicios.src;

import java.util.Scanner;

public class Condicionais10 {

//     Faça um programa que pergunte em que turno você estuda. Peça para digitar M
// (Matutino), V (Vespertino) ou N (Noturno). Imprima a mensagem "Bom Dia!", "Boa
// Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Em que turno você estuda? (M, V ou N)");
    char turno = scan.nextLine().toUpperCase().charAt(0);

    System.out.println("Turno selecionado: " + turno);

    if (turno == 'M') {
        System.out.println("Bom dia!");
    } else if (turno == 'V'){
        System.out.println("Boa tarde!");
    } else if (turno == 'N'){
        System.out.println("Boa noite!");
    } else {
        System.out.println("Valor Inválido");
    }
    scan.close();

}

}
