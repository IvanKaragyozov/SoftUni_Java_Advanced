package S05_FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {

    /**
     * - On the first line receives numbers separated by a single space
     * use "add" command to add 1 to each element
     * use "multiply" to multiply all numbers by 2
     * use "subtract" to subtract 1 from each number
     * use "print" to print the current numbers
     *
     * The program will not stop until "end" command is given
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        // adds another element to the list
        Function<List<Integer>, List<Integer>> add = list -> list.stream()
                .map(number -> number += 1).collect(Collectors.toList());

        // multiplies by 2 each element
        Function<List<Integer>, List<Integer>> multiply = list -> list.stream()
                .map(number -> number *= 2).collect(Collectors.toList());

        // subtracts 1 from each element
        Function<List<Integer>, List<Integer>> subtracts = list -> list.stream()
                .map(number -> number -= 1).collect(Collectors.toList());

        // prints
        Consumer<List<Integer>> printer = list -> list.forEach(number -> System.out.print(number + " "));

        while (!command.equals("end")){

            switch (command){

                case "add":
                    numbers = add.apply(numbers);
                    break;

                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;

                case "subtract":
                    numbers = subtracts.apply(numbers);
                    break;

                case "print":
                    printer.accept(numbers);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
