package exercicio1dio;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var nome = scanner.next();
        System.out.println("Agora digite o seu ano de nascimento: ");
        var anoDeNascimento = scanner.nextInt();
        var idade = java.time.Year.now().getValue() - anoDeNascimento;

        System.out.printf("Olá, %s, você tem %s anos \n", nome, idade);

    }
}

