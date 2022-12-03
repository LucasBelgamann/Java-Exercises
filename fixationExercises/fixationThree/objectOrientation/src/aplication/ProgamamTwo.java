package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgamamTwo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = scanner.nextInt();

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);


        scanner.close();
    }
}
