package praticandojavaestruturasdecontrole;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacaoDeIdade {
    public static void main(String[] args) {
        int maiorDeIdade = 18;
        Scanner scanner = new Scanner(System.in);//ao invés de colocar uma variavél que espera resultado coloco assim (?). Estou usando Scanner para capturar a entrada do usuário.

        System.out.println("Digite a sua idade: ");

        try {
            int idadeQueUsuarioDigitou = scanner.nextInt();//o nextInt é usado para ler/capturar um valor inteiro.

            if (idadeQueUsuarioDigitou >= maiorDeIdade) {
                System.out.println("Você é maior de idade");
            } else {
                System.out.println("Você é menor de idade");
            }

        } catch (InputMismatchException e) {// o e aqui é apenas o nome de variável que representa a exceção que foi capturada;
            System.out.println("Por favor, digite um número válido:  ");
        } finally {
            scanner.close();
        }
    }
}
