package S08_Generics.exercises.genericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable>{
    // characteristics: list of elements
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (T element : elements) {
            // print {class full name}: {value}
            builder.append(String.format("%s: %s", element.getClass().getName(), element));
            builder.append("\n");
        }
        // String result = String.format("%s: %s", elements.getClass().getName(), elements);
        // return result;
        return builder.toString();
    }

    // swap -> firstIndex, secondIndex
    public void swap(int firstIndex, int secondIndex) {
        // get index
        T firstIndexElement = this.elements.get(firstIndex);
        T secondIndexElement = this.elements.get(secondIndex);

        this.elements.set(firstIndex, secondIndexElement);
        this.elements.set(secondIndex, firstIndexElement);
    }

    public int countGreaterThan(T element){
        int count = 0; // number of elements bigger than the given element
        for(T elementInList : this.elements){
            // 0  -> elementList == element
            // 1  -> elementList > element
            // -1 -> elementList < element
            if(elementInList.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }
}
