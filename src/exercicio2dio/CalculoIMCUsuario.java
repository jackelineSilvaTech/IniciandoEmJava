package exercicio2dio;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMCUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double alturaUsuario = 0;
        double pesoUsuario = 0;


        System.out.println("Digite sua altura: ");
        alturaUsuario = scanner.nextDouble(); // ele só consegue ler se estiver com ".", se eu colocar vírgula ocorre um erro, então nas próximas vezes eu poderia receber tanto a altura quando o peso em string e usar o replace para trocar a virgula digitada pelo usuário por ponto,pois o java só consegue entender ponto como deparador de decimal do double e não vírgula. Aí depois disso, eu poderia converter a string para um número com Double.paseDouble(), ficaria=
        //System.out.print("Digite sua altura (em metros): ");
        //String alturaStr = scanner.nextLine();      // lê como texto
        //alturaStr = alturaStr.replace(',', '.');    // substitui vírgula por ponto
        //double altura = Double.parseDouble(alturaStr); // converte para double

        System.out.println("Digite o seu peso: ");
        pesoUsuario = scanner.nextDouble();

        double calculandoIMC = pesoUsuario / (alturaUsuario * alturaUsuario); //preciso calcular o IMC após ler os valores, pra evitar dar NaN e meus Ifs nunca funcionarem, visto que sempre que for ter a comparação de CalculandoIMC (NaN) vai dar false. Por isso, devo calcular apenas quando tiver recebido algo do usuário, q ai no meu calculandoIMC já terei algo do usuário.

        if (calculandoIMC <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (calculandoIMC >= 18.6 && calculandoIMC <= 24.9) {
            System.out.println("Peso ideal");
        } else if (calculandoIMC >= 25.0 && calculandoIMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (calculandoIMC >= 30.0 && calculandoIMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (calculandoIMC >= 35.0 && calculandoIMC <= 39.9) {
            System.out.println("Obesidade Grau II Severa");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
    }
}

//opção de solução mais limpa
/*import java.util.Scanner;

public class CalculoIMCUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);
        //mensagem padrão, pra não ficar repetindo em cada caso.
        // %f - imprime um número double ; .2 - com duas casas decimais ; %n - quebra a linha (equivalente a \n). Seria tipo "imprima um número decimal com 2 casas e depois pule uma linha."

        String classificacao;

      // Nos blocos "else if", não preciso usar && porque:
     // → Se o código chegou aqui, é porque as condições anteriores já falharam.
     // → Portanto, parte do intervalo já está garantido automaticamente.
     // PARA EU LEMBRAR BEM: Em uma cadeia de if/else if, cada condição já exclui parte dos valores.
     //Por isso, nos próximos else if, eu só testo o intervalo restante, não o intervalo todo.

        if (imc <= 18.5) {
            classificacao = "Abaixo do peso";
        }
        else if (imc <= 24.9) {
            classificacao = "Peso ideal";
        }
        else if (imc <= 29.9) {
            classificacao = "Levemente acima do peso";
        }
        else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        }
        else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II (Severa)";
        }
        else {
            classificacao = "Obesidade III (Mórbida)";
        }

        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}*/

