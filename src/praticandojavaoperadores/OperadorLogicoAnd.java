package praticandojavaoperadores;

import java.util.Scanner;

/*public class OperadorLogicoAnd {
    public static void main(String[] args) {
        boolean temDinheiro = false;
        boolean vaiViajar = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Você tem dinheiro? ");
        boolean temDinheiro2 = sc.nextBoolean();
        System.out.println("Você vai viajar? ");
        boolean vaiViajar2 = sc.nextBoolean();

        boolean resultadoDeDecisaoViagem = temDinheiro == temDinheiro2 && vaiViajar == vaiViajar2;

        System.out.println(resultadoDeDecisaoViagem);

        sc.close();

    }
}*/
/// fazer logica correta

public class OperadorLogicoAnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Você tem dinheiro? ");
        boolean temDinheiro2 = sc.nextBoolean();
        System.out.println("Você vai viajar? ");
        boolean vaiViajar2 = sc.nextBoolean();

        boolean resultadoDeDecisaoViagem = temDinheiro2 && vaiViajar2;

        System.out.println(resultadoDeDecisaoViagem);

        sc.close();

    }
}


