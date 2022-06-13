package S01_StacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            // "1 {string}.split(" ") -> ["1", "{string}"]
            // "2 {count}.split(" ") -> ["2", "{count}"]
            // "3 {index}".split(" ") -> ["3", "{index}"]
            // "4.split(" ") -> ["4"]

            int commandNumber = Integer.parseInt(command.split("\\s+")[0]); // 1, 2, 3, 4
            switch (commandNumber){
                case 1:
                    textStack.push(currentText.toString());
                    String stringForAppend = command.split("\\s+")[1];
                    // appending stringForAppend to the current text
                    currentText.append(stringForAppend);
                    break;
                case 2:
                    textStack.push(currentText.toString());
                    int countElementsForDelete = Integer.parseInt(command.split("\\s+")[1]);
                    // deleting countElementsForDelete number of elements
                    int startIndexForDelete = currentText.length() - countElementsForDelete;
                    currentText.delete(startIndexForDelete, startIndexForDelete + countElementsForDelete);
                    break;
                case 3:
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    // print current element of given index
                    System.out.println(currentText.charAt(index - 1));
                    break;
                case 4:
                    if(!textStack.isEmpty()) currentText = new StringBuilder(textStack.pop());
                    break;
            }
        }
    }
}
