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
        product.name = scanner.nextLine(); // TV
        System.out.print("Price: "); 
        product.price = scanner.nextDouble(); // 900.00
        System.out.print("Quantity: ");
        product.quantity = scanner.nextInt(); // 10

        System.out.println("Product data: " + product);
        // Saída: TV, 900.00, 10 units, Total: 9000.00

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        scanner.close();
    }
}
