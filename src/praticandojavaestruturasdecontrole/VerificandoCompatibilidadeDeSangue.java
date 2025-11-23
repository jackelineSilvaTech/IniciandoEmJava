import java.util.Scanner;

public class VerificandoCompatibilidadeDeSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner scanner = new Scanner(System.in); cria um objeto Scanner que lê a entrada do teclado (System.in). Esse objeto scanner é então usado para obter a idade e o peso do doador. System.in é um objeto que permite meu programa ler dados de entrada do usuário através do teclado.
        System.out.println("Digite a idade do doador: "); //println é um método usado para imprimir uma linha de texto na tela (saída padrão).
        int idadeDoDoador = scanner.nextInt();

        System.out.println("Digite o peso do doador: ");
        int pesoDoDoador = scanner.nextInt();

        //importante declarar as variáveis antes de colocar dentro do bloco das condições.
        boolean idadeValida= idadeDoDoador >= 18 && idadeDoDoador<=65;
        boolean pesoValido= pesoDoDoador> 50;

        if (idadeValida && pesoValido) {
            System.out.println("Legal, você é compatível para doação de sangue");

        } else {
           if (!idadeValida && !pesoValido) {//! operador lógico de não. então, se não estiver dentro d eidade e peso válidos...
               System.out.println("Infelizmente você não é compatível, pois não possui idade e peso adequados.");
           } else if (!idadeValida) {
               System.out.println("Infelizmente você não é compatível, pois não possui a idade adequada. Deve ter entre 18 e 65 anos.");
           } else {
               System.out.println("Infelizmente vocẽ não é compatível, pos não possui peso adequado. Deve pesar mais de 50kg.");
           }
        }
        scanner.close();
    }
}