package praticandojavavariaveisetipos;

public class PlanejandoUmaViagemConsumoEAutonomia {
    public static void main(String[] args) {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaximaDoVeiculo = consumoMedio * capacidadeTanque;
        double autonomiaAtualDoVeiculo = consumoMedio * combustivelAtual;

        System.out.println("Autonomia máxima do veículo: " + autonomiaMaximaDoVeiculo);
        System.out.println("Autonomia atual do veículo: " +  autonomiaAtualDoVeiculo);
        System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");

    }
}
