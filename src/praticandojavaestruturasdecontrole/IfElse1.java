package praticandojavaestruturasdecontrole;

public class IfElse1 {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.0;
        int numeroDependentes = 2;

        if (salario > 2259.20){
            double irrf = salario / 100 *7.5;
            System.out.println("Valor irrf: " + irrf);
        } else {
            System.out.println("Não há valores de irrf.");
        }

    }
}
