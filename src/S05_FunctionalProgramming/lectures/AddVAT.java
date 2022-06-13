package S05_FunctionalProgramming.lectures;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AddVAT {

    /**
     *  This program receives prices and prints them with VAT (+20%)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] prices = scanner.nextLine().split(", ");

        Function<String, Double> parseToDouble = e -> Double.parseDouble(e);
        // Function<Double, Double> addVAT = e -> e * 1.2;
        UnaryOperator<Double> addVAT = e -> e * 1.2; // equals the same as above
        Consumer<Double> printer = e -> System.out.printf("%.2f%n", e);

        System.out.println("Prices with VAT:");
        Arrays.stream(prices)
                .map(parseToDouble)
                .map(addVAT)
                .forEach(printer);

    }
}
