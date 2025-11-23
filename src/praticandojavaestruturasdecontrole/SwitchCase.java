package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 8:" );
        var option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Sábado");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            case 8:
                System.out.println("Domingo");
                break;
            default:// se não for nenhum dos casos acima, será este. (uma opção padrão)
                System.out.println("Digite uma opção válida");
                break;









        }
    }
}
