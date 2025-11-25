package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class MoreWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt(); // assign user's age here, in this variable.

        while(age < 0){
            System.out.println("Your age can't be negative"); //enquanto estiver no loop, esse será o prompt.
            System.out.println("Enter your age: "); //enquanto estiver no loop, esse será o prompt.
            age = scanner.nextInt(); //quando usuário digitar resposta correta, a resposta será armazenada aqui.
        }
        //após sair do loop, esse será o prompt.
        System.out.println("You are " + age + " years old");


        scanner.close();
    }
}
