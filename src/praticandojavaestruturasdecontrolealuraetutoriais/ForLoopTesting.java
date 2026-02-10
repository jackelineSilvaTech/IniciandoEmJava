package praticandojavaestruturasdecontrolealuraetutoriais;

public class ForLoopTesting {
    public static void main(String[] args) {
        //USAGE 1= REPEAT CODE OVER AND OVER AGAIN
        /*for(int i = 0; i < 2001; i++) {
            System.out.println("Coding is hard");
            System.out.println("While I am learning to code, it feels like I am back in Canada learning English and getting a bit mentally crazy LOL");
            System.out.println("I will learn to code!");
        }*/
        //USAGE 2= REPEAT CODE AND USE THAT SPECIAL VARIABLE "i" TO ACCESS ELEMENTS OF AN ARRAY
        String[] myAffirmations = {"Coding is hard", "While I am learning to code, it feels like I am back in Canada learning English and getting a bit mentally crazy LOL", "I will learn to code!"};

        for(int i = 0; i < myAffirmations.length; i++) { //não preciso mais repetir o comando do system.out.println 3 vezes, pois quem repete agora é o For. Então, enquanto essa condição for verdadeira, execute tudo que está aqui dentro
            System.out.println((i + 1) + "- " + myAffirmations[i]);//ele acessou cada um e está dizendo o que tem dentro de cada um e adiciomnalmente a isso, está dizendo a ordem. DIFICULDADE EM ENTENDER, PRATICAR MAIS PARA MELHORAR ENTENDIMENTO.
        }
        /*USAGE 3= REPEAT CODE WITH SPECIAL VARIABLE "i"
        /*String [] myAffirmations = {"Coding is hard", "While I am learning to code, it feels like I am back in Canada learning English and getting a bit mentally crazy LOL", "I will learn to code!"};

        for(int i= 0; i< myAffirmations.length; i++) {
            System.out.println(myAffirmations[i]);
        }


    }*/
    }
}


