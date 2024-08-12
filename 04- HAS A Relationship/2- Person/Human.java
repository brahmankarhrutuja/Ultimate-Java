class Human
{
    void eat()
    {
        System.out.println("Human is eating");
    }

    void sleep()
        {
            System.out.println("Human is Sleeping Now");
        }
}

public class Brain extends Human
{
    String color;
    int weight;

    public void thinks()
    {
        System.out.println("Brain Thinks smartly.");
    }
}

public class Heart extends Human
{
    float heartBeat;
    int weight;

    void pumpBlood()
    {
        System.out.println("Heart is pumping the blood.");
    }
}

public class Book
{
    String authorName;
    String bookName;

    void userReads()
    {
        System.out.println("User is reading book.");
    }
}

public class Bike
{
    int engNo;
    String brand;

    void userRides()
    {
        System.out.println("User is riding the bike.");
    }
}

class person
{
    int id;
    String name;
    String gender;

    void eat()
    {
        System.out.println("Person is eating");
    }

    void walk()
    {
        System.out.println("Person is walking");
    }
}

public class PersonApp
{
    public static void main(String[] args) {
    Brain br = new Brain();
    br.color = "Brown";
    br.weight = 45;
    Heart hr = new Heart();
    hr.heartbeat = 5.5;
    hr.weight = 10;
    }
}