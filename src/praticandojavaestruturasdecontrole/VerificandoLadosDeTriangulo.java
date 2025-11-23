package praticandojavaestruturasdecontrole;

import java.util.Scanner;

public class VerificandoLadosDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        int valorDoPrimeiroLado = scanner.nextInt();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        int valorDoSegundoLado = scanner.nextInt();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        int valorDoTerceiroLado = scanner.nextInt();

        if (valorDoPrimeiroLado + valorDoSegundoLado > valorDoTerceiroLado && valorDoPrimeiroLado + valorDoTerceiroLado > valorDoSegundoLado && valorDoSegundoLado + valorDoTerceiroLado > valorDoPrimeiroLado){
            System.out.println( " A soma dos lados podem formar um triângulo. ");
        } else {
            System.out.println("Os lados não podem formar um triângulo. ");
        }
        scanner.close();
        }
    }


