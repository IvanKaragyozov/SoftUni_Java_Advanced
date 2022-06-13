package S08_Generics.exercises.customList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> elements;

    public CustomList(){
        this.elements = new ArrayList<>();
    }

    /**
     * Adds new element to the list
     * @param element element to be added
     */
    public void add(T element){
        this.elements.add(element);
    }

    /**
     * Removes an element from the list of given index
     * @param index index to be removed
     * @return removed index
     */
    public T remove(int index){
        if(index >= 0 && index <= this.elements.size() - 1) {
            return this.elements.remove(index);
        }
        throw new IndexOutOfBoundsException("Invalid index");
    }

    /**
     * Checks if given element is already in the list
     * @param element element to be checked
     * @return checked element
     */
    public boolean contains(T element){
        return this.elements.contains(element);
    }

    /**
     * Swap two given indices
     * @param firstIndex
     * @param secondIndex
     */
    public void swap(int firstIndex, int secondIndex) {
        if(firstIndex >= 0 && firstIndex <= this.elements.size() - 1
        && secondIndex >= 0 && secondIndex <= this.elements.size() - 1) {
            // get both indices
            T firstIndexElement = this.elements.get(firstIndex);
            T secondIndexElement = this.elements.get(secondIndex);

            this.elements.set(firstIndex, secondIndexElement);
            this.elements.set(secondIndex, firstIndexElement);
        } else throw new IndexOutOfBoundsException("Invalid index");
    }

    /**
     * Counts /the ascii table/ elements that are greater than the given element and prints their count
     * @param element element to be checked
     * @return count of elements
     */
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
    
    /**
     * Gets the greatest element from list in ascending order
     * @return value of greatest element
     */
    public T getMax(){
        return Collections.max(this.elements);
    }

    /**
     * Gets the smallest element from list in ascending order
     * @return value of smallest element
     */
    public T getMin(){
        return Collections.min(this.elements);
    }

    /**
     * Prints every element from the list
     */
    public void print(){
        for(T element : elements){
            System.out.println(element);
        }
    }

    /**
     * Sorts elements in reversed order
     */
    public void sort(){
        // Collections.sort(elements);
        this.elements.sort(Comparator.naturalOrder());
    }
}
