package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeUsuario = 0;

        //do this code first at least once.
        do{
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age: ");
            idadeUsuario = scanner.nextInt();

            //then check the condition in the end
        }while(idadeUsuario < 0);

        System.out.println("You are " + idadeUsuario + " years old");

        scanner.close();


    }
}
