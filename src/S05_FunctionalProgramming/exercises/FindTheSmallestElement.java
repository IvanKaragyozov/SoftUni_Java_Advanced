package S05_FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindTheSmallestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // 1st way
        // list -> print index of smallest element
        Consumer<List<Integer>> printIndexOfMinElement = list -> System.out.println(list.lastIndexOf(Collections.min(list)));
        printIndexOfMinElement.accept(numbers);

        // 2nd way
        // list -> return index of smallest element

        // indexOf() -> returns first index of when the element occurred
        // lastIndexOf() -> returns last index of when the element occurred
        /*Function<List<Integer>, Integer> getIndexOfMinElement = list -> list.lastIndexOf(Collections.min(list));
        System.out.println(getIndexOfMinElement.apply(numbers));*/

    }
}
