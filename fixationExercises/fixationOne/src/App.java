import java.util.Locale;

// import java.util.Locale;

public class App {
        // declaração de variável em Java
        int idade = 25; // numero inteiro
        double altura = 1.68; // numero com casas decimais 
        char sexo = 'M'; // caracter unicode
    public static void main(String[] args) throws Exception {
        int idade = 21;
        double x = 10.34784;
        // print na tela de variáveis e textos!
        System.out.println("Hello, World!");
        System.out.println(idade);
        System.out.printf("%.2f%n", x); // Delimitação de casa decimais
        Locale.setDefault(Locale.US); // Padrão United States
        String nome = "Maria";
        int age = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, age, renda); // Concatenar texto com variáveis
    }
}
