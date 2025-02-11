package JAVA;
class Mobile
{
    String Brand;
    static String name;
    int price;
    public Mobile()
    {
        Brand = "";
        price = 200;
        System.out.println("IN CONSTRUCTOR");
    }

    static
    {
        name = "Phone";
        System.out.println("IN STATIC BLOCK");
    }

    public void show()
    {
        System.out.println(Brand + " " + name + " " + price);
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.Brand + " " + name + " " + obj.price);

    }

}

public class L11_2StaticBlock

{
    public static void main(String[] args) throws ClassNotFoundException // // if we don't use throwit will give class not found exception.
    {
        Class.forName("Mobile");  // // to make sure class is loaded !
    // Mobile obj1 = new Mobile();
    // obj1.Brand = "Apple";
    // obj1.price = 50000;
    // Mobile obj2 = new Mobile();
    /* Gives Output :
        IN STATIC BLOCK
        IN CONSTRUCTOR
        IN CONSTRUCTOR
        Static Block is instantialised one time and constructor is loaded the times object is created;
     */
    }
}
// // static block is intatntialised when class is loaded.