package S01_StacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] commandNumbers = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(commandNumbers[0]); // numbers of elements to be added to the stack
        int s = Integer.parseInt(commandNumbers[1]); // numbers fo elements to pop out of the stack
        int x = Integer.parseInt(commandNumbers[2]); // element to check if it is present in the stack

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int count = 1; count <= n; count++) {
            numbers.push(scanner.nextInt());
        }

        for (int i = 1; i <= s; i++) {
            numbers.pop(); // removes the top element
        }

        if (numbers.contains(x)) { // x is in the stack
            System.out.println("true");
        } else { // x is not present in the stack
            if (!numbers.isEmpty())
                System.out.println(Collections.min(numbers)); // prints the number with the smallest value
            else System.out.println(0);
        }
    }
}
