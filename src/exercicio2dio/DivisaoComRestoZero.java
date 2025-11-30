package exercicio2dio;

import java.util.Scanner;

public class DivisaoComRestoZero {
    public static void main(String[] args) {
 //a execução desse programa só para quando o número informado NÃO for mais divisível pelo primeiro número. → se o resto da divisão for diferente de 0 → PARE
        Scanner scanner = new Scanner(System.in);

        int numeroInicialDigitadoPeloUsuario = 0;
        int numerosPosterioresDigitadosPeloUsuario = 0;

        System.out.println("Digite um primeiro número: ");
        numeroInicialDigitadoPeloUsuario = scanner.nextInt();

        System.out.println("Digite um segundo número: ");
        numerosPosterioresDigitadosPeloUsuario= scanner.nextInt();

        //o loop deve continuar enquanto o número digitado tiver resto 0, ou seja, enquanto eu conseguir dividir ele pelo o primeiro número digitado.
        while (numerosPosterioresDigitadosPeloUsuario % numeroInicialDigitadoPeloUsuario == 0){ //usar while porque não sei quantos números o usuário irá digitar

            System.out.println("Digite outro número: ");
            numerosPosterioresDigitadosPeloUsuario = scanner.nextInt();

            //se o número digitado for MENOR que o primeiro número - IGNORA
            if (numerosPosterioresDigitadosPeloUsuario < numeroInicialDigitadoPeloUsuario) {
                System.out.println("Este número é menor que o número inicial, logo estarei descartando...");
                continue;
                // daí ele volta pro o while, fazendo a verificação e pedindo outro número.
            }

            // Se o número não for divisível pelo número inicial (resto diferente de zero), o programa deve encerrar
            if (numerosPosterioresDigitadosPeloUsuario % numeroInicialDigitadoPeloUsuario != 0) {
                System.out.println("Esse número não é divisível pelo número inicial. Encerrando programa");
                break;
            }
        }

        scanner.close();
    }
}
