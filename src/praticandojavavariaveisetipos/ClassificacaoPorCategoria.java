package praticandojavavariaveisetipos;

public class ClassificacaoPorCategoria {
    public static void main(String[] args) {
        double preco= 150.00;

        if (preco <= 50.00) {
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 50.00 && preco < 200.00) {// esses operadores são utilizados quando temos uma comparação. ex.: preço entre 50 e 200.
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: Premium");
        }

    }
}
