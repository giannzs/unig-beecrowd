import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;
        if (horaFinal <= horaInicial) {
            duracao = horaFinal + 24 - horaInicial;
        } else {
            duracao = horaFinal - horaInicial;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);

        scanner.close();
    }
}
