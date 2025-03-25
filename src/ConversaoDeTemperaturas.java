public class ConversaoDeTemperaturas {

     public static void main(String[] args) {
         double temperaturaCelsius = 30.4;
         double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

         String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);

         System.out.println(mensagem);

         int temperaturaEmFahrenheitInteira = (int) temperaturaFahrenheit;
         System.out.println("A temperatura em Fahrenheit inteira é: " +  temperaturaEmFahrenheitInteira );
     }
}
