package praticandojavaoperadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        String usuario = "jackeline123";
        String senha = "12345";

        String usuarioDigitado = "joão";
        String senhaDigitada = "joao12";

        boolean loginEstaCorreto = usuario == usuarioDigitado && senha == senhaDigitada; //and só vai ser verdadeiro se as condições da esquerda e direita forem verdadeiras.
        System.out.println(loginEstaCorreto);



        /*
        && - and
       || - or
       ! - negação. não
       obs.: através deles, posso criar mais de uma opção booleana.
         */
    }
}
