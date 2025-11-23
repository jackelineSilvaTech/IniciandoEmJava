package praticandogeral;

public class MaisOperacoesComVariaveis {
    public static void main (String[] args) {
        double precoOriginal = 98.95;
        double percentualDesconto = 0.10;
        double valorDoDescontoEmReal = precoOriginal * percentualDesconto;
        precoOriginal = valorDoDescontoEmReal;

        System.out.println(precoOriginal);
    }
}

