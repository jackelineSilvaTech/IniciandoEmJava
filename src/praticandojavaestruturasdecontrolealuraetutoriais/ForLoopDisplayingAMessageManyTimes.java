package praticandojavaestruturasdecontrolealuraetutoriais;

public class ForLoopDisplayingAMessageManyTimes {

    public static void main(String[] args) {
        //What to consider while writing a foor loop code: 1) how many times I want to repeat the code & 2) what I want to repeat
        for (int i = 0; i < 100; i++) { // 100 - how many times I want to repeat thi code I'm creating; "I love birds" text - what I want to repeat
            System.out.println("I love birds");
        }//USAGE 1= REPEAT CODE OVER AND OVER AGAIN

        for(int i = 0 ; i <= 15; i++) { //Very useful if I want to display all my array elements
            System.out.println(i);
        } //USAGE 2= REPEAT CODE WITH SPECIAL VARIABLE "i"

        int [] grades = {10, 9, 8, 7, 6}; //Length: 1- 10; 2- 9; 3- 8; 4- 7 e 5- 6.

        for(int i= 0; i < grades.length; i++) { // i++- to say we will go up by one each time
            System.out.println(grades[i]);// Print the values inside of grades. Ele vai puxar esses valores com base no índice de cada elemento.

        }//USAGE 3= REPEAT CODE AND USE THAT SPECIAL VARIABLE "i" TO ACCESS ELEMENTS OF AN ARRAY
    }

}
