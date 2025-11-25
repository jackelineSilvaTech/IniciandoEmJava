package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class WhileComRegex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entradaDoUsuario = ""; //declarei variável do que o usuário vai digitar (pode ser números por extenso...)
        int idade = 0; //declarei a variável do que seŕá a idade considerada válida.

        while (true) {
            System.out.println("Digite sua idade: ");
            entradaDoUsuario = scanner.nextLine(); //vou armazenar o que o usuário digitar.

            //vai fazer primeira verificação: "o usuário digitou apenas número (com ou sem sinal + ou -)?" esta linha de código abaixo serve pra quando o usuário digita número por extenso ou caracteres diversos.
            if (!entradaDoUsuario.matches("[+-]?\\d+")) { // [+-]? - significa um sinal opcional (+ OU -); \\d+ significa "um ou mais dígitos" (somente números). Juntos, formam um número inteiro com ou sem sinal.
                //estou usando as barras ANTES DAS ASPAS DUPLAS para java interpretar as aspas como um caracter da string e não fechar ou abrir uma string.
                System.out.println("A idade tem que conter apenas números (\"1\", \"2\", \"3\", etc anos) , não pode escrever por extenso(\"Um\", \"Dois\", \"Três\", etc anos");
                continue; // fica repetindo o loop, isto é, volta pro início do while. Aí vai repetir o prompt de digitar idade e da idade ser somente números.

            }
            // aqui estou convertendo a string para número inteiro.
            idade = Integer.parseInt(entradaDoUsuario);
            // quando usuário digita números, q é o q quero, vai fazer segunda verificação: "Tem números negativos?"
            if (idade < 0) {
                System.out.println("A idade não pode ser negativa.");
                continue;
            }
            //acaba e temos a opção válida
            break;
        }
        //tendo a opção válida, iremos apresentar agora este prompt final:
        System.out.println("Você tem " + idade + " anos de idade. ");

        scanner.close();
    }
}
