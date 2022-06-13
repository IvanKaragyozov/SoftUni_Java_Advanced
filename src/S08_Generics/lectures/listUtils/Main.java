package S08_Generics.lectures.listUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(16);
        list.add(11);
        list.add(150);
        list.add(-150);

        System.out.println(ListUtils.getMin(list));
        System.out.println(ListUtils.getMax(list));
    }
}
