package praticandojavaestruturasdecontrole;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){ // while this condition remains true,
            System.out.println("Digite seu nome: "); // continue this code
            name = scanner.nextLine();               // continue this code forever, until this condition is no longer true. We only escape the while loop when we type something, if we don't type it will keep repeating "Digite seu nome: " forever. This is good because it prevents user to not skip filling up spaces in a program.
        }

        System.out.println("Olá, " + name);

        scanner.close();
    }
}

//in the while loop I need to be careful: the infinite loop.EX=

/*public class WhileLoop {
    public static void main(String[] args) {

        while (1 == 1) { //condition here I can't change, that's why I have an infinite loop. I need some way to update my condition!!
            System.out.println("Help! I'm stuck in a loop!");
        }

    }*/

   /* //Changing my condition in another example...
    public class WhileLoop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String response = "";

            while (!response.equals("Q")) {  //for my condition to be able to escape the while loop, I need to use the 'not' logical operator. The person needs to press the letter "Q" to escape. I'M SAYING: "WHILE THE RESPONSE DOES NOT EQUALS A Q, THIS WILL KEEP BEING SHOWN TO THE USER". ONCE IT DOES, MY CONDITION WILL BE UPTDATED WITH THE Q THE USER TYPED.
                System.out.println("You are playing a game");
                System.out.println("Press Q to quit");
                response = scanner.next().toUpperCase(); //updating my condition with the correct answer from the user and then we loop will be finished.
            }

            //once we escape the while loop, we will print...
            System.out.println("You have quit the game");

            scanner.close();
        }
    }
}
*/