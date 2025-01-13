import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: ");
        System.out.println("First number: " +a);
        System.out.println("Second number: " +b);
    }
}