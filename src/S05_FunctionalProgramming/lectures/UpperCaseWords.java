package S05_FunctionalProgramming.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UpperCaseWords {

    /**
     * This program receives text and prints count of uppercase words
     * and then each word in a new line
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // checks if the word starts with upper case letter
        Predicate<String> upperCasePredicate = word -> Character.isUpperCase(word.charAt(0));

        Consumer<String> printer = word -> System.out.println(word); // prints (return String)

        List<String> upperCaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(upperCasePredicate)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("Count: " + upperCaseWords.size());
        upperCaseWords.forEach(printer);
    }
}
