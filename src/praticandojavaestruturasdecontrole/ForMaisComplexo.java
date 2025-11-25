package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class ForMaisComplexo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //vai mostrar mensagem

        System.out.println("Digite quantas vezes você quer que fique com loop: "); // we create the message/the prompt
        int max = scanner.nextInt(); //o que o usuário digitou, guardei nesta variável.

        //agora vamos criar o for loop:

        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}



/*
public class ForMaisComplexo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //vai mostrar mensagem

        System.out.println("Digite seu nome e sobrenome: "); // we create the message/the prompt
        String nomeDoUsuario = scanner.nextLine(); //o que o usuário digitou, guardeu nesta variável.

        //agora vamos criar o for loop:
        //for aqui está sendo usado para percorrer cada letra
        //o programa imprime uma letra por linha.
        for(int i = 0; i < nomeDoUsuario.length(); i++) {
            System.out.println(nomeDoUsuario.charAt(i));
        }

        scanner.close();
    }
}

*/
