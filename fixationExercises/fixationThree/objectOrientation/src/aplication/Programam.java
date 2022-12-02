package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Programam {
    // Foi feita uma classe com  os atriburos a, b, c para ser usada tanto para o triangulo x tanto para o y.
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y; // Um triãngulo é uma variável do tipo triângulo, que vem da classe do entities
        x = new Triangle(); // Instância
        y = new Triangle(); // Instância


        System.out.println("Enter the measures of triangle X: ");
        // Acessando os atributos da classe Triangle, para armazernar o valor digitado pelo usuário.
        x.a = scanner.nextDouble(); 
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        // Acessando os atributos da classe Triangle, para armazernar o valor digitado pelo usuário.
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double p = (x.a +x.b+ x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p -x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b ) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        scanner.close();
    }
}
