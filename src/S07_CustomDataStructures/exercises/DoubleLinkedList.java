package S07_CustomDataStructures.exercises;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    public void addLast(int element){

        if(isEmpty()){
            addFirst(element);
        } else {
            Node newNode = new Node(element);
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
            this.size++;
        }
    }

    public int get(int index){
        checkValidIndex(index);

        int result = 0;
        // index is in between the beginning and the middle
        if(index <= this.size / 2){
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            // element of given index
            result = currentNode.currentValue;
        }
        // index is in between the middle and the end
        else {
            Node currentNode = this.tail;
            for (int i = size - 1; i > index ; i--) {
                currentNode = currentNode.prev;
            }
        }
        return result;
    }

    /*
    public int removeFirst(){
        // if statement for empty list
        if(isEmpty()){
            throw new IllegalStateException("Error while removing empty element from the list!");
        }
        // if list contains only 1 element
        else if(this.size == 1) {
            this.head = this.tail;
        }
        //
        else {

        }
    }
    
     */

    private void checkValidIndex(int index) {
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("The index " + index + " is out of bounds!");
        }
    }

    /**
     * Checks if the list is empty
     * @return true if empty
     */
    public boolean isEmpty(){
        return this.size == 0;
    }

}
