package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class VerificandoCodigoDeAcessoENivelDePermissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de acesso: ");
        int codigoDeAcessoDigitado = scanner.nextInt();

        System.out.println("Digite o nível de permissão: ");
        int nivelDePermissaoDigitado = scanner.nextInt();

// valores corretos
        int codigoDeAcessoCorreto = 2023;
        boolean niveisDePermissaoCorretos = (nivelDePermissaoDigitado == 1 ||
                nivelDePermissaoDigitado == 2 ||
                nivelDePermissaoDigitado == 3);

        if (codigoDeAcessoDigitado == codigoDeAcessoCorreto && niveisDePermissaoCorretos) {// se a condição for verdadeira, execute isso
            System.out.println("Acesso permitido. Bem-vindo ao sistema!"); //possibilidade 1= codigo e nivel digitados corretamente

        } else {  // senão, faça isso aqui (caso nenhum dos anteriores seja verdadeiro). aqui detalha o motivo da falha no codigo e/ou níveis de acesso. o else aqui é o "resto"< o que sobra, o que não entrou em nenhum caso antes
            if (codigoDeAcessoDigitado != codigoDeAcessoCorreto && !niveisDePermissaoCorretos) { // possibilidade 2= código e nível digitados incorretamente
                System.out.println("Acesso negado. Código incorreto e nível de permissão inválido!");
            } else if (codigoDeAcessoDigitado != codigoDeAcessoCorreto) { // possibilidade 3= apenas código digitado incorretamente. else if - senão, teste outra condição. devo utilizar quando tenho OUTRAS condições possíveis.
                System.out.println("Acesso negado. Código incorreto!");
            } else { // possibilidade 4= nível de permissão digitado incorretamente. else - senão, faça isso aqui (caso nenhum dos anteriores seja verdadeiro).
                System.out.println("Acesso negado. Seu nível de permissão digitado está incorreto!");

                scanner.close();

            }
        }
    }
}

// como treinar de forma eficiente > preciso traduzir sempre em linguagem humana primeiro
// exemplo:
// Se o código está certo e o nível também → permito e envio mensagem.
// Se os dois estão errados → digo  que ambos estão errados.
// Se só o código está errado → digo que o código está errado.
// Senão (resto) → o nível está errado.
// 👉 Depois transformo em if, else if, else.

//📌 Resumindo: if → primeira pergunta; else if → outras perguntas possíveis; else → o resto, quando nenhuma condição foi atendida.
