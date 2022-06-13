package S01_StacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        boolean areBalanced = false; // if brackets are balanced -> true

        for (int index = 0; index < input.length(); index++) {
            char currentBracket = input.charAt(index);

            // checks if there is a {, (, [ bracket
            if(currentBracket == '{' || currentBracket == '[' || currentBracket == '('){
                openBracketsStack.push(currentBracket);
            }
            // checks if there is a }, ), ] bracket
            else if(currentBracket == '}' || currentBracket == ']' || currentBracket == ')'){

                if(openBracketsStack.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char lastOpen = openBracketsStack.pop(); // last open bracket

                // check if current closed bracket matches with the last open bracket
                if(currentBracket == '}' && lastOpen == '{') areBalanced = true;
                else if(currentBracket == ']' && lastOpen == '[') areBalanced = true;
                else if(currentBracket == ')' && lastOpen == '(') areBalanced = true;
                else{
                    areBalanced = false;
                    break;
                }
            }
        }
        if(areBalanced)System.out.println("YES");
        else System.out.println("NO");
    }
}
