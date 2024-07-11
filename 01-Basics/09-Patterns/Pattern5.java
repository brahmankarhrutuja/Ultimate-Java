import java.util.Scanner;
class Pattern5
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Rows");
        int row = scan.nextInt();
        System.out.println("Enter coloumns");
        int coloumn = scan.nextInt();
        System.out.println("Enter Character");
        char ch = scan.next().charAt(0);
        for (int i=1; i<=row; i++)
        {
            for (int j=1; j<=coloumn; j++)
            {
                System.out.print(ch);
            }
          System.out.println();
        }
    }
}