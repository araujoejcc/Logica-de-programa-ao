package exercicios.src;

import java.util.Scanner;

public class ExericioSala {

    // Questão 1: Validação de Valor da Nota
    // Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
    // caso o valor seja inválido e continue pedindo até que o usuário informe um
    // valor
    // válido.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Exercicio 1
        // System.out.println("Informe uma nota.");
        // double nota = scan.nextDouble();

        // while (nota < 0 || nota > 10) {
        // System.out.println("Valor inválido. Tente novamente.");
        // nota = scan.nextDouble();
        // }
        // System.out.printf("O valor digitado foi: %.1f", nota);

        // Questão 2: Validação de Senha
        // Faça um programa que leia um nome de usuário e a sua senha e não aceite a
        // senha
        // igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir
        // as
        // informações.

        // System.out.println("Informe o nome de usuário: ");
        // String usuario = scan.nextLine().toLowerCase();
        // System.out.println("Informe a senha: ");
        // String senha = scan.nextLine().toLowerCase();

        // while (senha.equals(usuario) || senha.length() < 6 ||
        // senha.contains(usuario)) {
        // System.out.println("Senha inválida. Tente novamente: ");
        // senha = scan.nextLine().toLowerCase();
        // }

        // System.out.println("Cadastrado com sucesso!");

        // Questão 3: Validação de Entradas
        // Faça um programa que leia e valide as seguintes informações:
        // a. Nome: maior que 3 caracteres;
        // b. Idade: entre 0 e 150;
        // c. Salário: maior que zero;
        // d. Sexo: 'f' ou 'm';
        // e. Estado Civil: 's', 'c', 'v', 'd'.

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        while (nome.length() <= 3) {
            System.out.println("Valor inválido. Tente novamente.");
            nome = scan.nextLine();
        }

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Valor inválido. Tente novamente.");
            idade = scan.nextInt();
        }

        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();

        while (salario < 0) {
            System.out.println("Valor inválido. Tente novamente.");
            salario = scan.nextDouble();
        }

        System.out.println("Digite seu sexo: ");
        char sexo = scan.next().charAt(0);

        while (!(sexo == 'f' || sexo == 'm')) {
            System.out.println("Valor inválido. Tente novamente.");
            sexo = scan.next().charAt(0);
        }

        System.out.println("Digite seu estado civil: 's', 'c', 'v', 'd'");
        char estadoCivil = scan.next().charAt(0);

        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.println("Valor inválido. Tente novamente.");
            estadoCivil = scan.next().charAt(0);
        }
        scan.close();

        System.out.println("Cadastrado com sucesso!");
    }
}
