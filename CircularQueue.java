public class CircularQueue {
    private final int[] queueArray;
    private int front;
    private int rear;
    private final int capacity;
    public CircularQueue(int size) {
        this.capacity = size;
        this.queueArray = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }
    public boolean isEmpty() {
        return front == -1;
    }
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full. Cannot enqueue " + item);
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        System.out.println("ENQUEUE(" + item + ")");
        display();
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty. Cannot dequeue.");
            return -1;
        }

        int item = queueArray[front];
        System.out.println("DEQUEUE()");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        display();
        return item;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue elements: []");
            return;
        }

        System.out.print("Queue elements: [");
        int i = front;
        while (i != rear) {
            System.out.print(queueArray[i] + ", ");
            i = (i + 1) % capacity;
        }
        System.out.print(queueArray[rear]);
        System.out.println("]");
    }
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        System.out.println("--- Circular Queue Test Scenario (Capacity 5) ---");

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.enqueue(40);
        queue.enqueue(60);
        queue.dequeue();
        queue.enqueue(70);
    }
}