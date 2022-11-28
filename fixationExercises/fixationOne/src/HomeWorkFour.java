import java.util.Locale;
import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;


        // Função para transformar graus Celsius em Fahrenheit, Atráves da estrutura de repetição (do While).
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
