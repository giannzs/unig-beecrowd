import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        double novoSalario, valorReajuste;
        int percentualReajuste;

        if (salario <= 400.00) {
            percentualReajuste = 15;
        } else if (salario <= 800.00) {
            percentualReajuste = 12;
        } else if (salario <= 1200.00) {
            percentualReajuste = 10;
        } else if (salario <= 2000.00) {
            percentualReajuste = 7;
        } else {
            percentualReajuste = 4;
        }

        valorReajuste = salario * percentualReajuste / 100.0;
        novoSalario = salario + valorReajuste;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
        System.out.printf("Em percentual: %d %%\n", percentualReajuste);

        scanner.close();
    }
}
