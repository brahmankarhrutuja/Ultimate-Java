import java.util.Scanner;
class Pattern3
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = scan.nextInt();
        for (int i=1; i<=n; i++)
        {
            System.out.println("*");
        }
    }
}