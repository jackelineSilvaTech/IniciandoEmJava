import java.util.Scanner;

public class OutroExemploLendoInputDoTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por gentileza, digite o seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + "que tem " + idade + " anos, irá investir R$ " + valor + "esse mês.");

        scanner.close();
    }
}
