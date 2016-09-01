package lesson12;

/**
 * Created by Note on 01.09.2016.
 */
public class LinkedDeque implements Deque {

   private Node first;
    private Node prev;
    private int size;


    @Override
    public boolean pushFirst(int elem) {
        if (size == 0) {
            Node n = new Node(elem);
            Node temp = n.next;
            return false;


        } else {

            return false;
        }
    }
    @Override
    public boolean pushLast(int elem) {


        return false;
    }

    @Override
    public Integer popFirst() {
        return null;
    }

    @Override
    public Integer popLast() {
        return null;
    }

    @Override
    public Integer takeFirst() {
        return null;
    }

    @Override
    public Integer takeLast() {
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

    //nested class; из нестед класса можно нарушая инкапсуляцию можно обращатся напрямую в инер классе тоже только больше приколов

    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

    }
}
