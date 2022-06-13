package S01_StacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {

    public static void main(String[] args) {

        // .push() - Getting an element on top of the stack
        // .pop() - Removing an element on top of the stack
        // .peek() - Only revealing the element on top of the stack

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();

        for(String number : input){
            numbers.push(number);
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }

    }
}
