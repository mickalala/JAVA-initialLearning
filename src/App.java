public class App {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(whatIsThisNumber(-3));
        System.out.println(whatIsThisNumber(8));
        fibonnacci(7);
        multiple(5);

        String[] numbers = piramide(9);
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] array1 = new String[] { "Morango", "Banana", "Maçã", "Uva", "Caqui", "um", "dois" };
        String[] array2 = new String[] { "Manga", "Caqui", "Morango", "Amora", "um", "dois" };

        notDoubles(array1, array2);
    };

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
    };

    // Sequencia de Fibonacci
    public static void fibonnacci(int size) {
        int[] fibonacciNumbers = new int[size];

        if (size >= 1) {
            fibonacciNumbers[0] = 0;
            System.out.println(fibonacciNumbers[0]);
        }
        if (size >= 2) {
            fibonacciNumbers[1] = 1;
            System.out.println(fibonacciNumbers[1]);
        }
        for (int i = 2; i < size; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            System.out.println(fibonacciNumbers[i]);
        }
    };

    // Multiplica Aí
    public static void multiple(int mult) {
        String title = "Tabela de multiplicação por " + mult;
        System.out.println(title);

        for (int i = 1; i <= 10; i++) {
            System.out.println(mult + " x " + i + " = " + mult * i);
        }
    };

    // Pirâmide de números
    public static String[] piramide(int size) {
        String[] numbers = new String[size + 1];

        for (int i = 1; i <= size; i++) {
            String initial = i + "";
            while (initial.length() < i) {
                initial += i + "";
            }
            numbers[i] = initial;
        }
        return numbers;
    };

    // Duplicados nãoo!
    public static void notDoubles(String[] array1, String[] array2) {
        String[] exampleArray = new String[] { "Morango", "Banana", "Maçã", "Uva", "Caqui", "um", "dois" };
        String[] exampleArray2 = new String[] { "Manga", "Caqui", "Morango", "Amora", "um", "dois" };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++)
                if (exampleArray[i] == exampleArray2[j]) {
                    System.out.println(exampleArray[i]);
                }
        }
    }

}
