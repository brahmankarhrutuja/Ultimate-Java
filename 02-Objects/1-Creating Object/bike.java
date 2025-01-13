class Bike
{
    int engNo;
    String color;
    String brand;

    void start()
    {
        System.out.println("Bike has start");
    }
    void move()
    {
        System.out.println("Bike has Started Moving");
    }
    void Stop()
    {
        System.out.println("Bike Stopped");
    }
}

class BikeApp
{
    public static void main(String [] args)
    {
        Bike b1= new Bike();
        b1.engNo = 5864759;
        b1.color= "black";
        b1.brand="Honda";
        b1.start();
        b1.move();
        b1.Stop();
    }
}