// import java.util.Scanner;

public class Homework {
    // Funções matemáticas em java.
    // public static void main(String[] args) throws Exception {
    // Scanner sc = new Scanner(System.in); // Leitura de entrada de dados. Entrada
    // // do que foi escrito pelo teclado no terminal.

    // String x;
    // // int, double, char
    // x = sc.next(); // Armazena o que foi digitado, sendo texto.
    // // x = sc.nextInt(); // Armazena o que foi digitado, sendo um número inteiro.
    // // x = sc.nextDouble(); // Armazena o que foi digitado, sendo um número
    // //decimal.
    // // x = sc.next().charAt(0); // Armazena o que foi digitado, para pegar o
    // // primeiro caracter digitado.
    // // obs: para ler varios tipos de dados é necessario colocar os nexts de
    // // acordo
    // // com as variáveis que
    // // foram declaradas.
    // // x = sc.nextLine(); // Armazena o que foi digitado até a quebra de linha,
    // //  ou seja, até o enter.
    // System.out.println("Você digitou: " + x); // Saída do que foi digitado.

    // sc.close();
    // }

    public static void main(String[] args) throws Exception {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        double delta;
        double x1, x2;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + x + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + "elevado a " + y + " = " + A);
        System.out.println(x + "elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(x);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        // Saída:
        // Raiz quadrada de 3.0 = 1.7320508075688772
        // Raiz quadrada de 3.0 = 2.0
        // Raiz quadrada de 25 = 5.0
        // 3.0elevado a 4.0 = 81.0
        // 3.0elevado ao quadrado = 9.0
        // 5 elevado ao quadrado = 25.0
        // Valor absoluto de 4.0 = 3.0
        // Valor absoluto de -5.0 = 5.0

        // Exemplo de função para calcular o delta.
        delta = Math.pow(B, 2.0) - 4 * A * C;

        x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
        x2 = (-B + Math.sqrt(delta)) / (2.0 * A);

        System.out.println(x1);
        System.out.println(x2);
    }
}
