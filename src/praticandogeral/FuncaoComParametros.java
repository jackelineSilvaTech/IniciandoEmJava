package praticandogeral;

public class FuncaoComParametros {//tudo em java fica dentro de uma classe

    public static void alo(int horario) { //estou criando função para falar "alô". uso funções para modularizar o meu código, essa função void não retorna nada.
                            //posso tbm passar parâmetros para minha função. aqui estou passando parâmetros de horário
        System.out.println("Alô pessoal");
        if(horario >=6 && horario <=12) {
            System.out.println("BOM DIA");
        }
        else if (horario >12 && horario <=18) {
            System.out.println("BOA TARDE");
        }
        else {
            System.out.println("BOA NOITE");
        }

    }

    public static void main(String[] args) {
        //preciso chamar a função criada acima, aqui no main.
        //alo(); //chamei 1x
        //alo(); //chamei outra vez
        //se eu quiser chamar ela agora com os parâmetros que coloquei:
        alo(10);
        alo(22);



        //a execução do código será iniciada aqui no main
        //tentação não é tão importante, mas para deixar código mais legível é interessante ter
        //todos comandos termina em ";"
        //função "main" marca que a primeira a ser executada
        //o float pode representar valores com fração
        //void diz respeito ao que a função me retorna.  nesse caso, ela não retorna nada
        // ao passar parâmetro para função,
        // xxx

    }
}
