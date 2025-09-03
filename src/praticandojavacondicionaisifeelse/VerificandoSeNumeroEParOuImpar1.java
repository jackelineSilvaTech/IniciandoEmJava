package praticandojavacondicionaisifeelse;

public class VerificandoSeNumeroEParOuImpar1 {
    public static void main(String[] args) {
        int valor = 7;
        if (valor % 2 == 0 ) { // Aqui estamos perguntando: "O resto da divisão de valor por 2 é igual a 0?"Se for verdade (ou seja, se valor for par), o que está dentro das chaves {} seguintes será executado.
            System.out.println("O número  " + valor + " é par.");
        } else {
            System.out.println("O número " + valor + " é ímpar.");
        }
    }

}
