public class Main {
    public static void main(String[] args) {

        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);

        q.display();   // 5 10 15

        System.out.println("First element: " + q.peek());

        int removed = q.dequeue();
        System.out.println("Removed: " + removed);

        System.out.println("First element now: " + q.peek());
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class QueueLinkedList {
    Node front;
    Node rear;

    QueueLinkedList() {
        front = null;
        rear = null;
    }

    // isEmpty
    boolean isEmpty() {
        return front == null;
    }

    // Enqueue
    void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue (remove & return)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedValue = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return removedValue;
    }

    // ⭐ Reading first element (Peek)
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // Display
    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
