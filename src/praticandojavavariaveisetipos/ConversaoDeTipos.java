package praticandojavavariaveisetipos;

public class ConversaoDeTipos {

    public static void main(String[] args) {
        double valorDouble = 19.5; //double é maior que int e todos os tipos, então é necessário realizar conv. explícita (typecasting)
        int convertendoDoubleEmInt = (int) valorDouble;

        System.out.println("O valor inteiro do produto é: " + convertendoDoubleEmInt);



    }
}

