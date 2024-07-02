import java.util.Scanner;
class SimpleIf1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int marks = scan.nextInt();
        if (marks>=35)
        {
            System.out.println("Student is passed");
        }
    }
}