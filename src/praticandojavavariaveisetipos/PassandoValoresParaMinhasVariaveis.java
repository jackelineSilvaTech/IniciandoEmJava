package praticandojavavariaveisetipos;

import java.util.Scanner;

public class PassandoValoresParaMinhasVariaveis {

    public static void main(String[] args) {
        int numero;

        Scanner leitor = new Scanner(System.in); //variavél do tipo "Scanner" com "S" (MAIÚSCULO) indica que esse tipo de variável é  uma classe.
        numero = leitor.nextInt();//nextInt é um método que está dentro de Scanner.

        System.out.println("Sua idade é: " + numero);
    }
}