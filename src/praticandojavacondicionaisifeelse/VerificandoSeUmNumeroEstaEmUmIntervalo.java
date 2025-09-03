package praticandojavacondicionaisifeelse;

import java.util.Scanner; // aqui, estamos importando a classe Scanner da biblioteca Java. Essa classe nos permite receber dados digitados pelo usuário.

public class VerificandoSeUmNumeroEstaEmUmIntervalo {
    public static void main(String[] args) { // este é o método principal, onde o programa irá começar a ser executado.
        Scanner scanner = new Scanner(System.in);// recebo o que usuário irá digitar. para isso, criamos um objeto Scanner chamado scanner. Usamos System.in para indicar que o Scanner deve ler a entrada do teclado.
        System.out.print("Digite o valor do empréstimo: "); // peço o valor
        int valor = scanner.nextInt(); // armazeno o valor na variável q foi o que o usuário digitou.

        if (valor >= 1000 && valor <= 5000) {// em java, n existe operador equivalente a "entre", em vez disso usamos op. de comparação p/ verificar se um valor está dentro de um intervalo
            System.out.println("O número digitado, " + valor + " ,está dentro do intervalo permitido");
        } else {
            System.out.println("O número digitado, " + valor + ", não está dentro do intervalo permitido");

            scanner.close();
        }
    }


}
