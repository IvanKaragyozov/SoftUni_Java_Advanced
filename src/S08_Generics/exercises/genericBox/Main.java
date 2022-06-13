package S08_Generics.exercises.genericBox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // 1. Generic Box
        // Takes n given Strings and prints them with their class type
        /*
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
         */

        // 2. Generic Box of Integer
        // Takes n given integers and prints them with their class type
        /*
        Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }
        System.out.println(box);
         */

        // 3. Generic Swap Method Strings
        /*
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }

        int firstIndex  = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        box.swap(firstIndex, secondIndex);
        System.out.println(box);
         */

        // 4. Generic Swap Method Integers
        //
        /*
        Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }

        int firstIndex  = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        box.swap(firstIndex, secondIndex);
        System.out.println(box);
         */

        // 5. Generic Count Method String

        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        String element = scanner.nextLine(); // check how many elements are bigger than {element} ascii code
        System.out.println(box.countGreaterThan(element));


        // 6. Generic Count Method Double
        /*
        Box<Double> box = new Box<>();
        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            box.add(number);
        }
        Double element = Double.parseDouble(scanner.nextLine()); // check how many elements are bigger than {element} ascii code
        System.out.println(box.countGreaterThan(element));
         */


    }
}
