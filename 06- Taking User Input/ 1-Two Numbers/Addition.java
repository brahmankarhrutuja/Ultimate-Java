import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        System.out.println("Result: "+ c);
     }
}