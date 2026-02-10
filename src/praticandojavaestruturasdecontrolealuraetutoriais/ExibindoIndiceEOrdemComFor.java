package praticandojavaestruturasdecontrolealuraetutoriais;

public class ExibindoIndiceEOrdemComFor {
    public static void main(String[] args) {
        String [] refeicoes = {"Café da Manhã", "Lanche diurno", "Almoço", "Jantar", "Lanche noturno"};

        for(int i= 0; i < refeicoes.length; i++) {
            //System.out.println((i+1) + "ª refeição é: " + refeicoes[i]);
            // o i funciona como contador do for; a cada repetição ele muda de valor.
            // o (i + 1) é usado apenas para mostrar a ordem humana (1ª, 2ª, 3ª...),
            // enquanto refeicoes[i] acessa o conteúdo de cada posição do array.

            System.out.println(
                       "Refeição " + (i+1) + " de " + refeicoes.length + " : " + refeicoes[i] // se eu quiser fazer a contagem da refeição que a pessoa está tendo até alcançar o número máximo de refeições.
            );
        }
    }
}
