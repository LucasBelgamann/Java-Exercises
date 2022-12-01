import java.util.Scanner;

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
}
