import java.util.Scanner;

public class AvaliarLivros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        // Laço while para pedir notas
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o livro (0 a 10) ou -1 para encerrar:");
            nota = leitura.nextDouble();

            // Condição if para somar notas válidas
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        // Verificação e exibição da média
        if (totalDeNotas > 0) {
            System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }
    }
}