package exercicio2dio;

import java.util.Scanner;

public class TabuadaDeNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDigitadoPeloUsuario = 0;

        System.out.println("Digite um número que deseja ver a tabuada: ");
        numeroDigitadoPeloUsuario = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numeroDigitadoPeloUsuario + " X " + i + " = " + (numeroDigitadoPeloUsuario * i));
            // i = É o número do loop. Ele começa em 1, depois 2, depois 3... até 10.
            // (numeroDigitadoPeloUsuario * i) = É onde de fato acontece a multiplicação. Os parênteses servem só para garantir que o Java faça a multiplicação antes de juntar com o texto.

        }

        scanner.close();
    }
}
