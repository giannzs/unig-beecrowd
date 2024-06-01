import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println(meses[mes - 1]);
        }

        scanner.close();
    }
}
