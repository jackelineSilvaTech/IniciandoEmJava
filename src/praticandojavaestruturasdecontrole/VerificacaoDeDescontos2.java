package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class VerificacaoDeDescontos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorDaCompra = scanner.nextDouble();

        if (valorDaCompra >= 200.0){
            double calculadoQuantidadeDeDesconto = valorDaCompra * 0.15;//primeiro calculo a quant de desc
            double calculandoValorFinalAposDesconto= valorDaCompra - calculadoQuantidadeDeDesconto;//depois calculo a subtraçao desse descontro dentro do valor da compra
            System.out.println("Desconto de 15% aplicado.\nNovo valor: R$ " + calculandoValorFinalAposDesconto);//por último digo qual é o valor atualizado do preço do item após cálculos e, considerando, se for => que 200 reais.
        } else {
            System.out.println("Desconto não aplicado.\nValor total: R$ " + valorDaCompra);
        }

        scanner.close();
    }
}
