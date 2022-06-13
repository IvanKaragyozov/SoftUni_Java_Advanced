package S05_FunctionalProgramming.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbersWithStream {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] stringNumbers = scanner.nextLine().split(", ");

        List<String> evenNumbers = Arrays.stream(stringNumbers)
                // parse to int
                .map(Integer::parseInt)
                // filter odd numbers
                .filter(e -> e % 2 == 0)
                // convert to String
                .map(e -> e.toString())
                .collect(Collectors.toList());
        // print
        System.out.println(String.join(", ", evenNumbers));

        evenNumbers = evenNumbers
                .stream()
                .map(e -> Integer.parseInt(e))
                .filter(e -> e % 2 == 0)
                // sort by value (small to large)
                .sorted((left, right) -> left.compareTo(right))
                .map(e -> e.toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ", evenNumbers));

    }
}
