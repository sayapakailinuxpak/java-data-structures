package Linear;

//linked list is chain of data that link together through node 
// node in linked list is data + reference to next node

public class SingleLinkedList{
    Node start; //every linked list has start node

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.start = new Node(5); //start node with value in it

        // inserting value
        singleLinkedList.insert(2);
        singleLinkedList.insert(7);
        singleLinkedList.insert(9);
        singleLinkedList.insert(3);

        //print all the node with value
        singleLinkedList.printValue();
        
    }

    public void insert(int value){
        Node current = start;

        while(current.next != null){
            current = current.next;
        }

        Node newNode = new Node(value);
        current.next = newNode;
    }

    public void printValue(){
        Node current = start;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void deleteNode(int value){
        //there are 3 possibilites when delete node. 1st: delete start node, 2nd: delete middle node, 3rd: delete last node;
        
    }


}

class Node{
    int value; // data (can be any datatype i.e int, String, double, etc);
    Node next; //reference to node

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}
