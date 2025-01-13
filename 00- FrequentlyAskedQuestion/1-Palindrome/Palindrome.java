import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int num = scan.nextInt();
        int org_num = num;
        int rev = 0;
        while (num != 0){
            rev = rev*10 + num % 10;
            num = num/10;
        }

        if (org_num == rev) {
            System.out.println(org_num + "Number is palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}