package exercicio1dio;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado de um quadrado: ");
        var tamanhoDeLadoDeQuadrado = scanner.nextDouble();
        var calculandoArea = tamanhoDeLadoDeQuadrado * tamanhoDeLadoDeQuadrado;

        System.out.printf("Olá, a área do quadrado é %s \n", calculandoArea);

    }
}
