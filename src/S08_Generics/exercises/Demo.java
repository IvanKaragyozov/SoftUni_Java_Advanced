package S08_Generics.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        System.out.println(getElementAtIndex(numbers, 1));

    }

    public static <T> T getElementAtIndex(List<T> list, int index){
        T element = list.get(index);
        return element;
    }

    public static String getAtIndex(List<String> list, int index){
        String element = list.get(index);
        return element;
    }

    public static int getIntAtIndex(List<Integer> list, int index){
        int numberAtIndex = list.get(index);
        return numberAtIndex;
    }

}
