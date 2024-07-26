class Student
{
    //Data Members
    int roll;
    String name;
    int age;

    //Member function
    void study()
    {
        System.out.println("Studying");
    }
    void eat()
    {
        System.out.println("Eating");
    }
}
class StudentApp
{
    public static void main(String [] args)
    {
        //Creating Objects
        Student S1= new Student();
        Student S2= new Student();

        //Accessing Data members of S1
        S1.roll=21;
        S1.name="Hrutuja";
        S1.age=24;

        //Calling Member Function of S1
        S1.eat();

        //Accessing Data members of S2
        S2.roll=68;
        S2.name="Sohail";
        S2.age=22;

        //Calling Member Function of S2
        S2.study();
    }
}