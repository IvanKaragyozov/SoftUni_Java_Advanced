package S05_FunctionalProgramming.exercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {

    /**
     *  This program receives names spaced by "\\s+" (one or more spaces)
     *  and prints them on a new line
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        // without Consumer
        /*for(String name : names){
            System.out.println(name);
        }*/

        // with Consumer
        /*Consumer<String> printName = System.out::println;
        for(String name : names){
            printName.accept(name);
        }*/

        // with String array in Consumer
        Consumer<String[]> printName = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };
        printName.accept(names);
    }
}
