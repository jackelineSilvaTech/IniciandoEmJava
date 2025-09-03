package praticandojavacondicionaisifeelse;

import java.util.Scanner; //esta linha importa a classe Scanner, que permite ler a entrada do usuário pelo console.

public class VerificacaoDeDescontos1 { //meu código estará organizado aqui.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criei um objeto scanner da classe Scanner para ler a entrada do usuário pelo console.

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();//aqui eu leio o valor que o usuário digitiou e armazeno nesta variável.

        if (valorCompra >= 100.00) {
            double desconto = valorCompra * 0.10;//se a condição fo verdadeira, calculo o desconto de 10% sobre o valor da compra. vou descobrir o valor do desconto.
            double valorComDesconto = valorCompra - desconto;// calculo o novo valor da compra após aplicar o desconto. Valor da compra sendo subtraindo com o valor do desconto que a pessoa tem direito.
            System.out.printf("Desconto de 10%% aplicado.\nNovo valor: R$ %.2f\n", valorComDesconto);//o f no print(printf) é um objeto usado para incluir variáveis e formatar a saída; %d é um espaço reservado para um número inteiro; Para números decimais, usamos %f. Se quisermos mostrar duas casas decimais, escrevemos %.2f; \n: isso cria uma nova linha.
        } else {
            System.out.printf("Nenhum desconto aplicado. \nValor total: R$ %.2f\n", valorCompra);

        }
        scanner.close();
    }
}