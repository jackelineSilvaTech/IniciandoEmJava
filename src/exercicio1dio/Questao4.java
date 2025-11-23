package exercicio1dio;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome e sua idade: ");
        String nomePessoa1 = scanner.next();
        int idadePessoa1 = scanner.nextInt();

        System.out.println("Digite seu nome e sua idade: ");
        String nomePessoa2 = scanner.next();
        int idadePessoa2 = scanner.nextInt();

        var diferencaIdadeDasPessoas = Math.abs(idadePessoa1 - idadePessoa2);
        System.out.printf("A diferença das idades é %s ano", diferencaIdadeDasPessoas);
    }
}
