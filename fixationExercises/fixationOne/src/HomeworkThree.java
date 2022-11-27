import java.util.Scanner;

public class HomeworkThree {
    public static void main(String[] args) throws Exception {
        // Estrutura de repetição while
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);

        // Operador ternário
        String guarda = (soma == 11) ? "É ONZE" : "NÃO É ONZE";
        System.out.println(guarda);

        // Estrutura condicional if
        if (soma < 11) System.out.println("É MENOR QUE ONZE!");
        if (soma > 11) System.out.println("PASSOU LONGE!");

        sc.close();
    }
}
