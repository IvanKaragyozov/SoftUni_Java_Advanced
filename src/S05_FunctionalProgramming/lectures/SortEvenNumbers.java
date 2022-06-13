package S05_FunctionalProgramming.lectures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] stringNumbers = scanner.nextLine().split(", ");
        int[] numbers = new int[stringNumbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                evenNumbers.add(numbers[i]);
            }
        }
        List<String> evenNumbersAsStrings = new ArrayList<>();
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenNumbersAsStrings.add(String.valueOf(evenNumbers.get(i)));
        }

        System.out.println(String.join(", ", evenNumbersAsStrings));
        Collections.sort(evenNumbers, (left, right) -> left.compareTo(right));
        // System.out.println(String.join(", ", evenNumbers));

    }
}
