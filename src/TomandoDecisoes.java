public class TomandoDecisoes {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoDePlano = "plus";

        if(anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");

        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano /* == true */ && tipoDePlano.equals("plus")) { // n é obrigatório usar o igual true, pq a loing faz isso automaticamente
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }

}

