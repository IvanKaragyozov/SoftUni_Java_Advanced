package S05_FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CustomMinFunction {

    /**
     * This program prints the lowest number
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // 1st way
        /*Function<List<Integer>, Integer> getMinNumber = list -> Collections.min(list);
        System.out.println(getMinNumber.apply(numbers));*/

        // 2nd way
        Consumer<List<Integer>> printMinNumber = list -> System.out.println(Collections.min(list));
        printMinNumber.accept(numbers);

        // 3rd way
        /*System.out.println(Collections.min(numbers));*/

    }
}
