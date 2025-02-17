package exercicios.src;

import java.util.Scanner;

public class Condicionais4 {

    // Questão 4: Positivo ou Negativo
    // Faça um programa que verique se uma letra digitada é vogal ou consoante.

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe uma letra: ");
    char letra = scan.nextLine().toLowerCase().charAt(0);

    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        System.out.println("Você digitou uma vogal.");
    } else if (letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || 
    letra == 'h' || letra == 'j' || letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || 
    letra == 'p' || letra == 'q' || letra == 'r' || letra == 's' || letra == 't' || letra == 'v' || 
    letra == 'w' || letra == 'x' || letra == 'y' || letra == 'z'){
        System.out.println("Você digitou uma consoante.");
    } else {
        System.out.println("Você digitou um símbolo.");
    }

    scan.close();
}


}
