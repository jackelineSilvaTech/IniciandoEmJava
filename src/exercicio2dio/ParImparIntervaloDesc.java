package exercicio2dio;

import java.util.Scanner;

public class ParImparIntervaloDesc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int primeiroNumeroDigitado = 0;
        int segundoNumeroDigitado = 0;
        String modalidadeDeNumero = "";

        System.out.println("Digite um número: ");
        primeiroNumeroDigitado = scanner.nextInt();
        System.out.println("Agora digite um número maior que o que você digitou: ");
        segundoNumeroDigitado = scanner.nextInt(); //deixa um ENTER preso.
        scanner.nextLine(); //limpa o ENTER que sobrou quando digitei o número INT acima.
        System.out.println("Por fim, escolha: PAR ou ÍMPAR ");
         modalidadeDeNumero = scanner.nextLine(); // agora sim lê o texto certo, porque antes sem o scanner.NextLine() acima, ele nem deixava eu escolher entre par e ímpar.

        // Este loop começa do número maior (segundoNumeroDigitado)
       // e vai diminuindo até chegar no número menor (primeiroNumeroDigitado).
      // Como usamos i--, ele gera os números em ordem decrescente.
     // Assim garantimos que:
   //  ✔️ percorremos apenas o intervalo informado pelo usuário
  //  ✔️ começamos do maior e terminamos no menor
  //  ✔️ depois filtramos PAR ou ÍMPAR dentro desse intervalo
        for(int i = segundoNumeroDigitado; i >= primeiroNumeroDigitado; i--){
            if (modalidadeDeNumero.equalsIgnoreCase("par")){ //se for igual a "par", independentemente de letra maiúsc ou minisc.
                if (i % 2 == 0) { //número par é divisível por 2. o módulo retorna o resto. SE FOR PAR!! /
                    // todo número PAR tem resto 0 ao ser dividido por 2.
                    System.out.println(i);
                }
            }else{
                if (i % 2 != 0) { // se o resto de uma divisão por 2 for diferente de 0, o número é ímpar. SE FOR ÍMPAR!!
                    // != significa “diferente de”
                    System.out.println(i);

                }
            }
        }



        scanner.close();
    }
}

