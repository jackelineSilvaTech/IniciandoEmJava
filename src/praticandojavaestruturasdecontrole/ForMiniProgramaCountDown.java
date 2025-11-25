package praticandojavaestruturasdecontrole;

public class ForMiniProgramaCountDown {
    public static void main(String[] args) throws InterruptedException {

// for loop = executar código de forma limitada, por um cerot período de vezes.

        int start = 10;

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); // to pause while the numbers go down
        }

        System.out.println("Happy 2027!!"); // when we escape the for loop, we will print this.
    }
}
