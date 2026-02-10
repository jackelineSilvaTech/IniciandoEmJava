package praticandojavaestruturasdecontrolealuraetutoriais;

import java.util.ArrayList;

public class ForEachLoop1 {
    //traversing technique to iterate through the elements in an array/collection; less steps, more readble than the for loop ; less flexibe compared to a standard for loop

    //let's create an array of animals
    public static void main(String[] args) {

        //String[] animals = {"cat", "dog", "bird"}; //collection
        ArrayList<String> animals = new ArrayList<String> ();  //an array list is a type of collection. String is the DATA TYPE

        animals.add("cat");         //we need to add values to each element of this arraylist
        animals.add("dog");
        animals.add("bird");

        for(String i : animals) { //the "i" represents "in". so I'm saying here "for every string in our array of animals, so list array or collection of name ath te end. Basically it will iterate once for each index of our array of animals.
            System.out.println(i); //display all of our elements in our array of animals.
        }
    }
}
