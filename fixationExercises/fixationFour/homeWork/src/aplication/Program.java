package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    // A declaração final, transforma a variável em uma constante, ou seja, o valor
    // não pode ser alterado.
    public static final double PI = 3.14159;

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in); // Atribuição do Scanner para a variável scanner

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble(); // Responsável em faze a leitura do valor que o usuário colocar.

        double c = circumference(radius); // Função para calcular a circunferência
        double v = volume(radius); // Função para calcular a volume.

        System.out.printf("circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        scanner.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
