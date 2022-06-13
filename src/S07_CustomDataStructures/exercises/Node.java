package S07_CustomDataStructures.exercises;

public class Node {

    public int currentValue;
    public Node next;
    public Node prev;

    public Node(int currentValue){
        this.currentValue = currentValue;
    }

    // node (element) -> String
    @Override
    public String toString(){
        return this.currentValue + "";
    }
}
