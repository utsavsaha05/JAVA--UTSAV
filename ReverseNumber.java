import java.util.Scanner;

public class ReverseNumber {
    int num;   // member variable

    // Constructor to initialize number
    ReverseNumber(int n) {
        num = n;
    }

    // Member function to reverse the number
    void reverse() {
        int rev = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;   // extract last digit
            rev = rev * 10 + digit;  // build reversed number
            temp /= 10;              // remove last digit
        }
        System.out.println("Reversed number: " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        ReverseNumber obj = new ReverseNumber(n);
        obj.reverse();

        sc.close();
    }
}
