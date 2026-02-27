import java.util.Scanner;

public class FibonacciSeries {
    int terms;   // member variable

    // Constructor to initialize number of terms
    FibonacciSeries(int n) {
        terms = n;
    }

    // Member function to generate Fibonacci series
    void generate() {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        FibonacciSeries obj = new FibonacciSeries(n);
        obj.generate();

        sc.close();
    }
}
