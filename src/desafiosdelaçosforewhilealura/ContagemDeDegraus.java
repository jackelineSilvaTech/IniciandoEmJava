package desafiosdelaçosforewhilealura;

import java.util.Scanner;

public class ContagemDeDegraus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degraus = 1;


        while ((degraus > 0 ) && (degraus <= 4)) {
            System.out.println("Digite a quantidade de degraus: ");
            degraus = scanner.nextInt();

            System.out.println("Subindo o degrau " + degraus);
        }

        //após sair do loop, esse será o prompt.
        System.out.println("Vocẽ chegou ao topo!");


        scanner.close();

    }
}
