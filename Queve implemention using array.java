public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        QueueArray q = new QueueArray(size);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();   // 10 20 30

        System.out.println("First element: " + q.peek());

        int removed = q.dequeue();
        System.out.println("Removed: " + removed);

        System.out.println("First element now: " + q.peek());

        q.display();   // 20 30
    }
}
import java.util.Scanner;

class QueueArray {
    int[] arr;
    int front;
    int rear;
    int size;

    // Constructor
    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    // isEmpty
    boolean isEmpty() {
        return front > rear;
    }

    // isFull
    boolean isFull() {
        return rear == size - 1;
    }

    // Enqueue
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            arr[++rear] = value;
        }
    }

    // Dequeue (remove & return value)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int removedValue = arr[front];
            front++;
            return removedValue;
        }
    }

    // ⭐ Reading first element (Peek)
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // Display
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
