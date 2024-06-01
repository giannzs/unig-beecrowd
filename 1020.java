import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeEmDias = scanner.nextInt();

        int anos = idadeEmDias / 365;

        int meses = (idadeEmDias % 365) / 30;

        int dias = (idadeEmDias % 365) % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);

        scanner.close();
    }
}
