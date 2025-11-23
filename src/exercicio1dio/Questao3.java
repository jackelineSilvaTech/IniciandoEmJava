package exercicio1dio;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do triângulo: ");
        var valorDeBaseDeRetangulo = scanner.nextDouble();
        System.out.println("Agora digite o valor da altura do triângulo: ");
        var valorDeAlturaDeRetangulo = scanner.nextDouble();
        var calculandoAreaDeRetangulo = valorDeBaseDeRetangulo * valorDeAlturaDeRetangulo;


        System.out.printf("Olá, a área do retângulo é %s \n", calculandoAreaDeRetangulo);

    }
}
