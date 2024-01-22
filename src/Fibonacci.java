public class Fibonacci {

    // Sequencia de Fibonacci
    public static void fibonnacci(int size) {
        int[] fibonacciNumbers = new int[size];
        int initial = 0;

        for (int i = 0; i < size; i++) {
            initial = initial + 1;
            fibonacciNumbers[i] = initial;
            System.out.println(initial);
        }
    }

    // O que é esse numero?
    public static String whatIsThisNumber(int number) {
        String parity = "ímpar";
        String positiveOrNegative = "negativo";

        if (number > 0) {
            positiveOrNegative = "positivo";
        }
        if (number % 2 == 0) {
            parity = "par";
        }
        return number + " é " + parity + " e " + positiveOrNegative;
    }

}
