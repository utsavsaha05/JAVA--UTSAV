import java.util.*;
public class constructor{
    constructor(int n){
        if(n < 0) System.out.println("It is negative");
        else System.out.println("It is positive");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        constructor obj = new constructor(n);
        
    }
}