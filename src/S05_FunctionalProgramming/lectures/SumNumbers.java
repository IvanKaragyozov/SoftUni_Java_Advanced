package S05_FunctionalProgramming.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {

    /**
     * This program receives integers separated by ", " and prints their count and sum
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        Function<String, Integer> parser = e -> Integer.parseInt(e);
        List<Integer> numbers = Arrays.stream(input)
                .map(parser)
                .collect(Collectors.toList());

        // Arrays.stream(input).map(e -> Integer.parseInt(e)).collect(Collectors.toList()); // Stream<Integer>
        // Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).sum(); // IntStream

        int sum = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).sum();

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);

    }
}
