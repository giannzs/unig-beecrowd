import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanciaPercorridaKm = scanner.nextInt();
        double combustivelGastoLitros = scanner.nextDouble();

        double consumoMedio = distanciaPercorridaKm / combustivelGastoLitros;

        System.out.printf("%.3f km/l\n", consumoMedio);

        scanner.close();
    }
}

