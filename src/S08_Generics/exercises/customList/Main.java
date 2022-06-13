package S08_Generics.exercises.customList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();
        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")){
            // "Add {element}" - Adds the given element to the end of the list.
            // "Remove {index}" - Removes the element at the given index.
            // "Contains" {element}" - Prints if the list contains the given element (true or false).
            // "Swap {index1} {index2}" - Swaps the elements at the given indexes.
            // "Greater {element}" - Counts the elements that are greater than the given element and prints their count
            // "Max" - Prints the maximum element in the list.
            // "Min" - Prints the minimum element in the list.
            // "Print" - Prints all elements in the list, each on a separate line.
            // "END" - stops the reading of commands.

            switch (command[0]){
                case "Add":
                    String addIndex = command[1];
                    customList.add(addIndex);
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(command[1]);
                    customList.remove(removeIndex);
                    break;
                case "Contains":
                    String checkElement = command[1];
                    System.out.println(customList.contains(checkElement));
                    break;
                case "Swap":
                    int firstIndex  = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String elementForCheck = command[1];
                    System.out.println(customList.countGreaterThan(elementForCheck));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
                case "Sort":
                    customList.sort();
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }

    }
}
