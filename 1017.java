import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoViagemHoras = scanner.nextInt();
        int velocidadeMediaKmh = scanner.nextInt();

        double consumoVeiculo = 12.0;

        double distanciaPercorrida = tempoViagemHoras * velocidadeMediaKmh;

        double litrosNecessarios = distanciaPercorrida / consumoVeiculo;

        System.out.printf("%.3f\n", litrosNecessarios);

        scanner.close();
    }
}
