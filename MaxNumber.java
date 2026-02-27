import java.util.Scanner;

public class MaxNumber {
    int a, b;   // member variables

    // Constructor to initialize values
    MaxNumber(int x, int y) {
        a = x;
        b = y;
    }

    // Member function to find maximum
    void findMax() {
        if (a > b) {
            System.out.println("Maximum is: " + a);
        } else if (b > a) {
            System.out.println("Maximum is: " + b);
        } else {
            System.out.println("Both numbers are equal: " + a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Create object and call member function
        MaxNumber obj = new MaxNumber(num1, num2);
        obj.findMax();

        sc.close();
    }
}
