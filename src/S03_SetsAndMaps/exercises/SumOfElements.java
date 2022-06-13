package S03_SetsAndMaps.exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //"4 3"
        int sizeFirstSet  = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);;

        Set<Integer> firstSet  = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        // 1. fill both sets
        for (int i = 1; i <= sizeFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 1; i <= sizeSecondSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        // 2. get elements that occur in both sets
        /*
        Set<Integer> duplicateElements = new LinkedHashSet<>();
        for(int number : firstSet){
            if(secondSet.contains(number)){
                duplicateElements.add(number);
            }
        }
        duplicateElements.forEach(e -> System.out.print(e + " "));
         */

        // shorter version using .retainAll() method
        firstSet.retainAll(secondSet); // left are elements that only occur in second set
        firstSet.forEach(e -> System.out.print(e + " "));

    }
}
