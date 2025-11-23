package praticandojavaestruturasdecontrole;//esta linha package define o pacote em que minha classe está localizada.Isso é usado para oragnizar minhas classes em grupos.O Scanner é uma classe que precisa ser importada para que você possa usá-la, e por isso deve ser adicionada com a linha import java.util.Scanner; O Scanner é uma classe que precisa ser importada para que eu possa usá-la, e por isso deve ser adicionada na linha seguinte.

import java.util.Scanner;// Me certificar de que a linha import java.util.Scanner; esteja presente antes da declaração da sua classe. Se eu não adicionar, o compilador não saberá o que é Scanner.

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        String senhaPreDefinida = "123456"; //Senhas podem incluir letras, números e caracteres especiais, como @, #, $, etc. por isso que é string e não int.
        Scanner scanner = new Scanner(System.in);// Scanner com letra maiúscula = classe que estou utilizando; scanner com letra minúscula = variável que estou criando, aqui essa variável seŕa responsável por ler a entrada. O new é uma palavra-chave que cria uma nova instância (ou objeto) da classe Scanner. O Scanner(System.in) é o construtor da classe Scanner. O System.in é um fluxo de entrada padrão que representa a entrada do console (ou seja, o que o usuário digita).

        System.out.println("Digite a senha: ");
        String senhaDigitadaPeloFuncionario = scanner.nextLine();// nextLine() método da classe do Scanner que lê a próx linha de entrada do usuário, no caso a senha.

        scanner.close();

        if (senhaPreDefinida.equals(senhaDigitadaPeloFuncionario)) {//O operador == compara referências de objetos, ou seja, verifica se as duas variáveis apontam para o mesmo objeto na memória. Já o método .equals() compara o conteúdo das strings, verificando se elas têm o mesmo valor. Portanto, para comparar o valor das senhas, o correto é usar .equals().
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }


    }
}