package praticandojavacondicionaisifeelse;

public class IfElse2 {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.0;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento){ //isento == false, pode ser assim mas é mais comum com a exclamação (que ssignifica negativo!).
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor irrf: " + irrf);
        } else if (isento){ //aninhar o if para ele fazer algo antes de chegar no else (último else).
            System.out.println("Contribuinte isento de IRRF");
        }
        else {
            System.out.println("Não há valores de irrf.");
        }

    }
}

