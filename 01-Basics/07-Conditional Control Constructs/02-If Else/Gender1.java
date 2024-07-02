import java.util.Scanner;
class Gender1
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your gender");
        char gender = scan.next().charAt(0);
        if(gender == "M" )
        {
            System.out.println("Male");
        }
        else
        {
            System.out.println("Female");
        }
    }
}