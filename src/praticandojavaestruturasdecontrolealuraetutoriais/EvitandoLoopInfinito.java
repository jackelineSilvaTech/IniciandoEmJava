package praticandojavaestruturasdecontrolealuraetutoriais;

import java.util.Scanner;

public class EvitandoLoopInfinito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter your age: "); //here i'm kind of saying the user really needs to type a number.
        age = scanner.nextInt(); //here i'm updating my while loop to avoid a forever loop. I get the number and then i test it above.
                                //the user needs to type a positive number (int), not negative. So, when the user does that, then the loop will be over.

        while(age < 0 ){ // we only enter here if the condition is TRUE.
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt(); //here i'm updating my while loop to avoid a forever loop. I get the number and then i test it right here in this block of code.
            //the user need to type a positive number (int), not negative. So, when the user does that, then the loop will be over.
        }

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}

