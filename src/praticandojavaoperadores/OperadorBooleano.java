package praticandojavaoperadores;

import java.util.Scanner;

public class OperadorBooleano {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var canDrive = age > 17; //posso usar outros operadores pra o boolean retornar T ou F
        //var resposta = canDrive + " > Esta é a resposta"; - se eu quiser algo "mais humano"
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);//(%s)formatação de strings


    }
}
