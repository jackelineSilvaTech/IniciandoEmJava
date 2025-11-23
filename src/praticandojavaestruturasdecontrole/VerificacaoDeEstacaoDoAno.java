package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class VerificacaoDeEstacaoDoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o mês de ano que estamos agora (em letras minúsculas: ");
        String mes = scanner.nextLine();
        scanner.close();//estou colocando aqui, no início, porque não irei mais ler entradas do usuário após essa leitura.

        if (mes.equals("março") || mes.equals("abril") || mes.equals("maio")){
            System.out.println( mes + " faz parte da estação primavera " );
        } else if (mes.equals("junho") || mes.equals("julho") || mes.equals("agosto")){ //usar else if para verificar a próxima condição
            System.out.println( mes + " faz parte da estação verão " );
        } else if (mes.equals("setembro") || mes.equals("outubro") || mes.equals("novembro")){ //Mais else if: Continuar adicionando else if para cada estação do ano.
            System.out.println( mes + " faz parte da estação outono " );
        } else if (mes.equals("dezembro") || mes.equals("janeiro") || mes.equals("fevereiro")){
            System.out.println( mes + " faz parte da estação inverno " );

        } else { //Por fim, usar um else para capturar qualquer entrada que não corresponda a nenhuma das condições anteriores.
            System.out.println("Digite uma opção válida!" );
        }

    }
}
