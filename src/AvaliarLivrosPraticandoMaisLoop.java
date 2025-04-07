import java.util.Scanner;

public class AvaliarLivrosPraticandoMaisLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double notaAtual = 0;
        int totalDeNotas = 0;
        double mediaDasAvaliacoes = 0;

        //Laço while para pedir notas
        while (notaAtual != -1) {
            System.out.println("Digite a sua avaliação para o livro lido ou -1 para sair ");
            notaAtual = leitura.nextDouble();
        }

        if (notaAtual != -1) {
            mediaDasAvaliacoes += notaAtual;
            totalDeNotas++;
        }

        if (totalDeNotas > 0) {
            System.out.println("Média de avaliações " + mediaDasAvaliacoes / totalDeNotas);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }
    }
}