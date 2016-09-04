package lesson12.homework;


import lesson12.LinkedDeque;

public class Arraystack implements Stack {
    int arr[];
    int size;
    int top;

    public Arraystack(int size) {
        this.arr = new int [size];
        this.size = size;
        this.top = top = -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.append("]").toString();
    }


    @Override
    public boolean push(int element) {
        if (top < size) {
            int i = ++top;
            arr[i] = element;
            return true;
        } return false;
    }

    @Override
    public Integer pop() {
        if (!isEmpty()){
            System.out.println(top);
            int i = arr[top];
             top--;
            return arr [i]  ;
        }
        return null;
    }

    @Override
    public Integer take() {
        return null;
    }

    @Override
    public int size() {

        return top;
    }

    @Override
    public boolean isEmpty() {
        if (arr.length == 0) return true;
        else {
           return false;
        }
    }
    public class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
  Arraystack arraystack = new Arraystack(10);
        arraystack.push(1);
        arraystack.push(2);
        arraystack.push(3);
        arraystack.push(4);
        arraystack.pop();
        System.out.println(arraystack.toString());
        int i =arraystack.pop();
        System.out.println(i);
        System.out.println(arraystack.toString());
    }
}


