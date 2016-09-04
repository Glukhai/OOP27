package lesson12.homework;

/**
 * Created by Note on 04.09.2016.
 */
public class Linkedstack implements Stack {
    int size;
    Node tail;


    public Linkedstack() {
        this.size =0;

    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{");
      // for ()


        return super.toString();
    }

    @Override
    public boolean push(int element) {
        if (size == 0) {
            Node node = new Node(element);
            node.next = tail;
            tail = node;
            size++;
            return true;

        }
        return false;
    }
    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Integer take() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    public class Node {
        int value;
        Node next;
        Node tail;

        public Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Linkedstack linkedstack = new Linkedstack();
        linkedstack.push(10);
        linkedstack.push(30);
        linkedstack.push(40);
        linkedstack.push(50);
        System.out.println(linkedstack.toString());
    }
}
