package praticandojavavariaveisetipos;

import java.util.Scanner;

public class CadastrodeLivrosRecebendoValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do título do livro: ");
        String titulo = input.next();
        System.out.println("Digite o nome do autor do livro: ");
        String autor = input.next();
        System.out.println("Digite o número de páginas do livro: ");
        int numeroDePaginas = input.nextInt();
        System.out.println("Digite o preço do livro: ");
        double precoDoLivro = input.nextDouble();
        System.out.println("Digite a categoria do livro: ");
        char categoria = (input.next()).charAt(0); //ele está pegando o primeiro (0-1a posição) caractere da string


        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao= "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }

        System.out.println("O seu livro " + titulo + " possui como autor: " + autor + ", e dispõe de " + numeroDePaginas + " número de páginas " + " . Está custando R$ " + precoDoLivro + " e faz parte da categoria " + categoriaDescricao);


    }
}





