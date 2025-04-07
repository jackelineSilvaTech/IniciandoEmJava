package praticandojavavariaveisetipos;

public class VerificacaoDeIdadeEEscopoDeVariaveis {
    public static void main(String[] args) {
        int idade = 17; // declarei variável antes da verificação.
        String mensagemIdade; // string foi declarada, mas não inicializada.

        if (idade >= 18) {
            mensagemIdade = "Você é maior de idade.";
        } else {
            mensagemIdade = "Você é menor de idade.";
        }
        System.out.println(mensagemIdade);
    }
}
