package S05_FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        // name -> true(length <= n) / false(length >= n)
        Predicate<String> checkValidLength = name -> name.length() <= n; // names remain only if true

        // print
        Arrays.stream(names).filter(checkValidLength).forEach(System.out::println);

    }
}
