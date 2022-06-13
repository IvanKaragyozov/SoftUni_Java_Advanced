package S01_StacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"5 2 13" -> split(" ") -> ["5", "2", "13"]
        int n = scanner.nextInt(); //брой на числата за добавяне -> push
        int s = scanner.nextInt(); //брой на числата за премахване -> pop
        int x = scanner.nextInt(); //числото, което трябва да проверя дали го има

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //добавяне -> n на брой пъти
        for (int count = 1; count <= n; count++) {
            stack.push(scanner.nextInt());
        }

        //премахване -> s на брой пъти
        for (int count = 1; count <= s; count++) {
            stack.pop();
        }

        //проверка дали х го има в стека
        if (stack.contains(x)) { //x го има в стека
            System.out.println("true");
        } else {//x го няма в стека
            //има елементи в стека -> минималния елемент
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            } else {     //няма елементи в стека -> 0
                System.out.println(0);
            }
        }

    }
}
