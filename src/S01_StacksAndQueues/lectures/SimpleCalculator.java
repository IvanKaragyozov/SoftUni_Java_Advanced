package S01_StacksAndQueues.lectures;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String args[]) {

        //read input
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        //convert the string to a stack
        ArrayDeque<String> tokens = new ArrayDeque<>();
        Collections.addAll(tokens, input);

        while (tokens.size() > 1){
            int firstNumber  = Integer.parseInt(tokens.pop());
            String operator  = tokens.pop();
            int secondNumber = Integer.parseInt(tokens.pop());
            int result;

            if(operator.equals("+")) result = firstNumber + secondNumber;
            else result = firstNumber - secondNumber;

            tokens.push(String.valueOf(result));
        }

        //read output
        System.out.println(tokens.peek());
    }
}
