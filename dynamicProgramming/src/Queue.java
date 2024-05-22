public class Queue {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data){
            this.data = data;
        }
    }

    private Node head; // remove from the head
    private Node tail; // add things to the tail

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.data;
    }

    public void add(int data){
        Node node = new Node(data); // create a new node
        if(tail != null){
            tail.next = node;
        }
        tail = node; // update the tail

        if(head == null){
            head = node;
        }

    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = head.data;
        head = head.next;

        if(head == null){
            tail = null; // update
        }

        return data;

    }
}
