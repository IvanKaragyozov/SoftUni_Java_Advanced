package S05_FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers); // reverses numbers {1, 2, 3, 4, 5} - {5, 4, 3, 2, 1}

        // remove all numbers that are divisible on n
        // 1st way
        /*Predicate<Integer> checkDivision = number -> number % n == 0;
        numbers.removeIf(checkDivision);*/

        // 2nd way
        Predicate<Integer> checkDivision = number -> number % n != 0;
        numbers = numbers.stream().filter(checkDivision).collect(Collectors.toList());

        // print
        numbers.forEach(number -> System.out.print(number + " "));

    }
}
