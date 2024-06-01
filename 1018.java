import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(N);

        for (int cedula : cedulas) {
            int quantidadeCedulas = N / cedula;
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeCedulas, cedula);
            N %= cedula;
        }

        scanner.close();
    }
}
