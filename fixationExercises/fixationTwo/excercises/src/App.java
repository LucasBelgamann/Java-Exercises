import java.util.Scanner;

// Funções em java

public class App {
    public static void main(String[] args) throws Exception {
        // Operadores bitwise
        Scanner scanner = new Scanner(System.in);

        int mask = 0b100000; // ou o numero 32
        int n = scanner.nextInt();

        // Testando se o 6th é true
        if ((n & mask) != 0) {
            System.out.println("6th bit id true!");
        } else {
            System.out.println("6th bit is false!");
        }

        scanner.close();
    }

    public static void mainTwo(String[] args) throws Exception {
        // Algumas funções uteis
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Descobrindo o maior numero com if 
        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }

        scanner.close();
    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

    public static void mainThree(String[] args) throws Exception {
        // Algumas funções uteis
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Descobrindo o maior numero através de callback 
        int higher = max(a, b, c);

        showResult(higher);

        scanner.close();
    }
}
