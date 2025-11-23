package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class VerificacaoDeDiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em letras minúsculas: ");
       String diaDaSemanaDigitado = scanner.nextLine();
       scanner.close();

       if (diaDaSemanaDigitado.equals("segunda") || diaDaSemanaDigitado.equals("terça") ||
               diaDaSemanaDigitado.equals("quarta") || diaDaSemanaDigitado.equals("quinta") ||
               diaDaSemanaDigitado.equals("sexta")) {
           System.out.println(diaDaSemanaDigitado + " é um dia últil.");
       } else {
           System.out.println(diaDaSemanaDigitado + " não é um dia útil. ");
       }

    }
}
