package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        // while - enquanto condição for verdadeira, o nosso código ficará rodando. independente se condição for verdadeira ou não, ele vai rodar pelo menos uma vez.
        var scanner = new Scanner(System.in);
        var nome = "";
        while (!nome.equals("Sair")) { //enquanto o nome digitado for diferente da palavra sair, continue rodando este bloco de código
            System.out.println("Informe um nome: ");
            nome = scanner.next();
            System.out.println(nome);
        }
    }
}
