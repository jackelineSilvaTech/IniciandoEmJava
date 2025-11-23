package praticandojavaestruturasdecontrole;

public class VerificandoSeNumeroEParOuImpar2 {
    public static void main(String[] args) {
        int valor = 10;

        if (valor % 2 == 0){//estou querendo dizer aqui que quando eu dividir meu valor por 2 e o resto dessa divisão for igual a zero ele é par.
            System.out.println("O número " + valor + " é par.");
        } else {
            System.out.println("O númemro " + valor + " é ímpar");
        }
    }
}
