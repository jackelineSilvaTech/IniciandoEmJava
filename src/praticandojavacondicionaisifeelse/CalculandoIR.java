package praticandojavacondicionaisifeelse;

import java.util.Scanner;

public class CalculandoIR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua renda mensal: ");
        double rendaMensal = scanner.nextDouble();

        if (rendaMensal >= 3000.0){//em java, se escrevo 3.00 o compilador não entende que estou me referindo a um número decimal (double). Ele pode interpretar isso como um número inteiro
            double oQueVoceDevePagarDeIR = rendaMensal * 0.20;
            double valorRestante  = rendaMensal - oQueVoceDevePagarDeIR;
            System.out.println("Imposto aplicado.\nValor do imposto: R$ " + oQueVoceDevePagarDeIR);
            System.out.println("Valor que restou depois de pagar o imposto: R$ " + valorRestante);

        } else {
            System.out.println("Nenhum imposto aplicado.\nValor total: R$ " + rendaMensal);
        }

        scanner.close();
    }
}
