package praticandojavavariaveisetipos;

import javax.swing.*;

public class CriandoJanelaParaLerEExibirInformacoes {

    public static void main(String[] args) {
        String filme = JOptionPane.showInputDialog(null, "Qual é o seu filme favorito?");//JOptionpane usamos para criar janelinha de interação com usuário. Ele sempre retorna uma String, então se quisermos que retorn um Int, por exemplo, devemos fazer a conversão
        String texto = JOptionPane.showInputDialog(null, "Digite um número:  "); //criei outra janelinha de interação
        int numero = Integer.parseInt(texto); //Aqui estou convertendo o que o JoptionOane retorna (String) para Int. Integer.parseInt() transforma a variável "texto" em um número inteiro (int).
        System.out.println(filme);
        System.out.println(texto + 10);
        System.out.println(numero + 2);

    }
}
