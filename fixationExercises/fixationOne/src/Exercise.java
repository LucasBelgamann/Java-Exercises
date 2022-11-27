import java.util.Locale;

public class Exercise {
 
    public static void main(String[] args) throws Exception {
        String product1 = "Computer";
        String product2 = "Office desk";
    
        int age = 30;
        int code = 5200;
        char gender = 'F';
    
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
    
        // print na tela de variáveis e textos!
        System.out.printf("%s, which price is $ %.2f%n", product1, price1); // Saída: Computer, which price is $ 2100,00
        System.out.printf("%s, which price is $ %.2f%n", product2, price2); // Saída: Office desk, which price is $ 650,50
        System.out.printf("%s years old, code %d and gender: %s %n", age, code, gender); // Saída: 30 years old, code 5200 and gender: F
        System.out.printf("%.8f%n", measure); // Saída: 53,23456700
        System.out.printf("%.3f%n", measure); // Saída: 53,235
        System.out.printf("%.3f%n", measure); // Delimitação de casa decimais
        Locale.setDefault(Locale.US); // US decimal poit Saída: 53.235
    }

    // Processamento de dados. casting em Java

    public static void mainTwo(String[] args) throws Exception {
      int a, b; // Declaração de váriavel
      double resultado; // Declaração de váriavel

      a = 5;
      b = 2;

      resultado = (double) a / b; // Conversão explicita dos valores casting
      // obs: o resultado seria de um número inteiro por causa da declaração int de A e B, 
      // para o resultado sair com decimal colocamos a expressão (double).

      System.out.println(resultado);
    }


    public static void mainThree(String[] args) throws Exception {
        double a; // Declaração de váriavel
        int b; // Declaração de váriavel
  
        a = 5.0;
        b = (int) a; // Conversão explicita dos valores casting
        // obs: da mesma forma que fizemos no exemplo acima, colocamos a expressão int para
        // para ser possível a variável b do tipo (int), receber a do tipo (double).
  
  
        System.out.println(b);
      }

}