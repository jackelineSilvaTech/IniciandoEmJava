package praticandojavavariaveisetipos;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 7;

        if (numero % 2!= 0 ) { //se o resto da divisão (%) por 2 for diferente (!) de 0, significa que o número não é divisível por 2, logo, ele é ímpar.
            System.out.println("O número é ímpar.");
        } else {
            System.out.println("O número é par.");
        }
    }
}


