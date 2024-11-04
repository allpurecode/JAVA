import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String received = sc.nextLine();
        int count = 0;
        int number = received.length() / 3;
        String original = "";
        for (int i = 0; i < number; i++) {
            original = original + "SOS";

        }
        System.out.println(original);
        for (int i = 0; i < received.length(); i++) {
            if (received.charAt(i) != original.charAt(i)) {
                count++;
            }

        }
        System.out.println(count);

    }


}
class CircularQueue {
    private int[] queue;     // Array to store queue elements
    private int front, rear; // Front and rear pointers
    private int size;        // Maximum size of the queue

    // Constructor to initialize the queue
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;   // Initially, queue is empty
        rear = -1;
    }

    // Method to insert an element into the circular queue (Enqueue)
    public void enqueue(int element) {
        // Check if the queue is full
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full (Overflow).");
            return;
        }

        // If the queue is empty, set both front and rear to 0
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            // Increment rear in a circular way
            rear = (rear + 1) % size;
        }

        // Insert the element at the rear position
        queue[rear] = element;
        System.out.println("Inserted " + element);
    }

    // Method to delete an element from the circular queue (Dequeue)
    public int dequeue() {
        // Check if the queue is empty
        if (front == -1) {
            System.out.println("Queue is empty (Underflow).");
            return -1;
        }

        // Retrieve the element at the front
        int element = queue[front];

        // If front equals rear, this was the last element, so reset both front and rear
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Increment front in a circular way
            front = (front + 1) % size;
        }

        System.out.println("Deleted " + element);
        return element;
    }

    // Method to display the current state of the queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

/*public class Mars {

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5); // Creating a circular queue of size 5

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display(); // Queue: 10 20 30

        cq.dequeue(); // Deleted 10
        cq.display(); // Queue: 20 30

        cq.enqueue(40);
        cq.enqueue(50);
        cq.display(); // Queue: 20 30 40 50

        cq.enqueue(60); // Should wrap around and insert at the front
        cq.display(); // Queue: 20 30 40 50 60

        cq.dequeue(); // Deleted 20
        cq.dequeue(); // Deleted 30
        cq.display(); // Queue: 40 50 60

        cq.enqueue(70); // Insert at the position freed by dequeuing 20 and 30
        cq.display(); // Queue: 40 50 60 70

    }
}
//---------------------------------------------------------------------------------------------------------------------


public class FibonacciGenerator {

    public static int[] generateFibonacci(int n) {
        // Handle the base cases
        if (n <= 0) {
            return new int[0];  // Return an empty array for non-positive N
        } else if (n == 1) {
            return new int[]{0};  // Return the first Fibonacci number
        } else if (n == 2) {
            return new int[]{0, 1};  // Return the first two Fibonacci numbers
        }

        // Initialize the array with the first two Fibonacci numbers
        int[] fibonacciNumbers = new int[n];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        // Generate Fibonacci numbers up to N
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];  // Next Fibonacci number
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        int N = 10;  // Change this value to generate more or fewer Fibonacci numbers
        int[] fibNumbers = generateFibonacci(N);
        System.out.println("The first " + N + " Fibonacci numbers are: " + Arrays.toString(fibNumbers));
    }
}
*/