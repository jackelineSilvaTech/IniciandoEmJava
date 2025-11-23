package praticandojavavariaveisetipos;

public class VariavelDoTipoStringComOFormat {

        public static void main(String[] args) throws Exception {

            String canal = "Academia dos Devs";
            String mensagem = "Se inscreva no canal";
            String mensagem2 = "Obrigado!";

            String mensagemFinal = String.format("%s %s. %s", mensagem , canal , mensagem2);//o simbolo de porcentagem com o "s" serve para identificar as variáveis de nome "mensagem", "canal"; "mensagem2". OBS.:sempre ficar atenta a ordem dos operadores que esotu passando para ver se está condizente com o que desejo.

            System.out.println(mensagemFinal); //println - dá um "espacinho" no console.



        }
    }

