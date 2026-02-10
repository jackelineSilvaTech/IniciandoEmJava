package praticandojavaestruturasdecontrolealuraetutoriais;

import java.util.Scanner;

public class DoWhileLoopIsOppositeToWhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeUsuario = 0;

        //do this code first at least once.
        do{
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age: ");
            idadeUsuario = scanner.nextInt(); //what i want (a positive number - int).

            //then check the condition in the end
        }while(idadeUsuario < 0);

        System.out.println("You are " + idadeUsuario + " years old");

        scanner.close();


    }
}

//in the while loop, we may not enter the while loop at all if some condition is false. If the condition is true, we enter in the loop.