package praticandojavavariaveisetipos;

public class ConversordeMoedas {
    public static void main(String[] args) {
        double valorReais = 451.50;
        double taxaCambio = 5.25;
        double convertendoRealEmDolar = valorReais / taxaCambio;

        System.out.println("O valor em dólares é: " + "US$ " + convertendoRealEmDolar);
    }
}
