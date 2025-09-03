package praticandojavacondicionaisifeelse;

public class VerificandoAprovacacaoEmUmaDisciplina {
    public static void main(String[] args) {
        double mediaDeAprovacao = 8.2;

        if (mediaDeAprovacao >= 7.0) {
            System.out.println("Parabéns, você está aprovado com a nota " + mediaDeAprovacao);
        } else if (mediaDeAprovacao >= 5.0 && mediaDeAprovacao < 7.0) {//ponto #1 - quando tiver 'entre uma coisa ou outra', utilizar essa lógica; ponto #2 - no else if eu poderia apenas colocar (media >= 5.0) ao invés de ficar mencionando a variável.
            System.out.println("Você está em recuperação " + mediaDeAprovacao);
        } else {
            System.out.println("Você está reprovado com a nota " + mediaDeAprovacao);
        }
    }
}