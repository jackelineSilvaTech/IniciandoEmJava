package praticandogeral;

public class FuncaoComRetorno {
    //função pra retornar média, no caso, fazer operação de média
    //tenho que fazer função dentro da classe, mas fora das outras funções q existirem

    //ela vai nos devolver um dado, e esse dado eu estou dizendo que será "float"
    public static float media(float a, float b, float c) { //tenho que definir o tipo de cada um deles
        float resultado = (a+b+c)/3;
        return resultado;
    }

    //o main tem que semore está dentro de uma classe. aqui ele esa dentro da classe FunçãoComRetorno

    public static void main(String[] args) {
        float mediaCalculada = media(1,10,100); //estou dizendo os valores do q será calculadoe e tô chamando eles.
        System.out.println("A média é: " +  mediaCalculada);//estou exibindo o que de fato foi calculado, no caso, a média.
        //se eu quisesse, ao invés de criar uma variavel aqui no main (float mediaCalculada), eu poderia já colocar o q será chamado dentro do system.out, mas não é tão legível. SEGUE:
        //System.out.println("Média " + mediaCalculada(2,3,5));
    }
}

