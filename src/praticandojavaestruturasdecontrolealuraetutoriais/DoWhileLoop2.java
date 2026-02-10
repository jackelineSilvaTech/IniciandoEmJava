package praticandojavaestruturasdecontrolealuraetutoriais;

import java.util.Scanner;

/* public class DoWhileLoop2 {
    public static void main(String[] args) {
//let's use the basic WHILE loop first - here the program will check the condition first. If in the condition there is some piece that's true, it will get ouf of the while loop and show the message. If the condition is 100% negative/false, the while loop will keep running until user types a valid number
        Scanner scanner = new Scanner (System.in);

        int number = 0;

        while(number < 1 || number > 10){ //if i type 11, 12 and 13 here, the program will say "enter a number between 1- 10" until I type a valid number because these number are higher than 10 so it will not pick and will not say "You picked..."
            System.out.println("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }

        System.out.println("You picked " + number);

        scanner.close();
    }
} */
//now let's convert to DO WHILE loop - here the program will execute a piece of code at least once and then after, check condition.

public class DoWhileLoop2 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number = 0;

    do { //execute this at least one time
        System.out.println("Enter a number between 1 - 10: ");
        number = scanner.nextInt();

    }while(number < 1 || number > 10); //now check the condition


    System.out.println("You picked " + number);

    scanner.close();

    }
}

//THESE LOOPS ARE VERY USEFUL WHEN ACCEPTING USERS IN0UTU, BECAUSE USERS MIGHT NOT TYPE SOMETHING THAT'S VALID.
