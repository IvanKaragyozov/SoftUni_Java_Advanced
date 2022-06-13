package S05_FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightOfHonor {

    /**
     *  This program receives names spaced by "\\s+" (one or more spaces)
     *  and prints Sir in front of each name
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String> printName = name -> System.out.println("Sir " + name);

        // 1st way
        Arrays.stream(names).forEach(printName);

        // 2nd way
        /*for (String name : names) {
            printName.accept(name);
        }*/

    }
}
