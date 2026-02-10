package praticandojavaestruturasdecontrolealuraetutoriais;

import java.util.Scanner;

public class ComissaovendasLacosRepeticao {
    public static void main(String[] args) { //método principal onde irei "trazer" e chamar o que estou declarando no método abaixo.
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00}; //vendas de cada uma das pessoas do array vendedores acima

        //o loop geralmente entra no main? aqui nesse laço de repetição, me vai ser mostrado as comissões de todo mundo.
        for (int i = 0; i < vendedores.length ; i++) { //code snippet: "fori" e já me apresenta a estrutura do for.; codição de parada é o tamanho da lista de vendedores, nesse caso 4.
            //aqui já temos o incremento. Com o while, precisamos fazer manualmente ele.
            System.out.printf("%s - comissão %.2f\n", vendedores[i],
                    calcularComissao(vendas[i]));
            // o "$s" vai ser substituído pelo o nome do vendedor; "%.2f" - utilizado para formatar o valor da comissão com duas casas decimais.
            // /n é uma nova linha
        }

        System.out.println("\n Testando com o While");
        int j = 0; //preciso de um iterador e aqui será o 'j'.
        boolean  imprimeOutro = true;      //vou criar condição booleana. enquanto eu falar que quero imprimir, ele vai imprimir a condição
        Scanner leitura = new Scanner(System.in);

        while (imprimeOutro) {
            System.out.printf("%s - comissão %.2f\n", vendedores[j],
                    calcularComissao(vendas[j]));
            //preciso incrementar meu j, se não ele vai ter um loop infinito.
            j++;

            System.out.println("Deseja imprimir outro?"); //para q eu possa ler essa resposta, preciso usar a classe scanner.
            imprimeOutro = leitura.nextBoolean();
        }

        System.out.println("Você saiu da lista de empregados e suas comissões!");

    }


    //vamos criar um método para ele fazer o cálculo pra mim da comissão.
    public static double calcularComissao(double totalVendas) { //estamos recebendo por argumentos o total de vendas
        if (totalVendas <= 5000) {
            return totalVendas * 0.03; //e baseado no valor, ele vai aplicar um percentual, seja 3, 5 ou 7%.
        } else if (totalVendas <= 10000) {
            return  totalVendas * 0.05;
        } else {
            return totalVendas * 0.07;
        }
    }
}
