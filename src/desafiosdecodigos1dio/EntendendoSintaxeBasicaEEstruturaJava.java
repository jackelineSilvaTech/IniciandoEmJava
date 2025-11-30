package desafiosdecodigos1dio;

import java.util.Scanner;

public class EntendendoSintaxeBasicaEEstruturaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solicitacao = scanner.nextLine();
        String texto = solicitacao.toLowerCase();
        // TODO: Imprima o serviço AWS correspondente de acordo com as palavras-chave presentes na solicitação.
        // Dica: Use if/else if/else e o método contains para identificar o serviço correto.
        if (texto.contains("preciso de um servidor para rodar aplicacoes")){
            System.out.println("EC2");
        } else if (texto.contains("quero armazenar imagens e videos")){
            System.out.println("S3");
        } else if (texto.contains("necessito de um banco de dados relacional")){
            System.out.println("RDS");
        } else if (texto.contains("preciso executar funcoes sem servidor")){
            System.out.println("Lambda");
        } else {
            System.out.println("Servico desconhecido");
        }
        scanner.close();
    }

}
