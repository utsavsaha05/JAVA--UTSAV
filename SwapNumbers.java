import java.util.Scanner;

public class SwapNumbers {
    int a, b;   // member variables

    // Constructor to initialize values
    SwapNumbers(int x, int y) {
        a = x;
        b = y;
    }

    // Member function to swap values between two objects
    void swap(SwapNumbers other) {
        int temp = this.a;
        this.a = other.a;
        other.a = temp;

        temp = this.b;
        this.b = other.b;
        other.b = temp;
    }

    // Display values
    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First object
        System.out.print("Enter two numbers for object1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        SwapNumbers obj1 = new SwapNumbers(x1, y1);

        // Second object
        System.out.print("Enter two numbers for object2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        SwapNumbers obj2 = new SwapNumbers(x2, y2);

        System.out.println("\nBefore swapping:");
        System.out.print("Object1 -> "); obj1.display();
        System.out.print("Object2 -> "); obj2.display();

        // Swap values
        obj1.swap(obj2);

        System.out.println("\nAfter swapping:");
        System.out.print("Object1 -> "); obj1.display();
        System.out.print("Object2 -> "); obj2.display();

        sc.close();
    }
}
