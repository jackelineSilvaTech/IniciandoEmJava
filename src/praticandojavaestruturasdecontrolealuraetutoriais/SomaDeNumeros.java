package praticandojavaestruturasdecontrolealuraetutoriais;

public class SomaDeNumeros {
    public static void main(String[] args) {

        int[] valores = {10, 20, 30, 40, 50}; //os números do grupo de array que desejo realizar soma
        int soma = 0;                        //variável acumuladora da soma

        for (int i = 0; i < valores.length; i++) {           //o meu contador de operação vai começar em 0, então ele soma 0+10, depois 10+ 20, depois 30 +... e assim vai indo até o tamanho do meu array se "acabar".
            soma += valores[i];                              // a cada volta do laço, soma recebe o valor do índice atual
        }

        System.out.println("A soma dos elementos é: " + soma);

        





    }
}

