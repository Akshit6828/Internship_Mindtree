public class Queue {
    private int arr[];
    private int capacity;
    private int front;
    private int rear;

    Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return (rear == -1);
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public void push_elements(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = data;
    }

    public int pop_elements() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++)
            arr[i] = arr[i + 1];

        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println("inserting 1 in the queue");
        q.push_elements(1);
        System.out.println("inserting 2 in the queue");
        q.push_elements(2);

        System.out.println("removing the element (1) from front");
        q.pop_elements();
        System.out.println("removing the element (2) from front");
        q.pop_elements();

        System.out.println("inserting 3 in the queue");
        q.push_elements(3);

        System.out.println("inserting 4 in the queue");
        q.push_elements(4);

        System.out.println("The element in front is " + q.peek());

        System.out.println("removing the element (3) from front");
        q.pop_elements();
    }

}