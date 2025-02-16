package JAVA;
class Mobile
{
    String Brand;
    static String name;
    int price;

public void show()
{
    System.out.println(Brand + " " + name + " " + price);
}
public static void show1(Mobile obj)
{
    System.out.println(obj.Brand + " " + name + " " + obj.price);

}

}

public class L11_1StaticVariablenMethods
{
    public static void main(String[] args)
    {
    Mobile obj1 = new Mobile();
    // obj1.name = "15Pro"; // The static field Mobile.name should be accessed in a static way.
    obj1.Brand = "Apple";
    obj1.price = 50000;
    Mobile obj2 = new Mobile();
    // obj2.name = "A6";
    obj2.Brand = "Snmsung";
    obj2.price = 30000;
    obj1.show();
    obj2.show();
    Mobile.name = "smartphone";
    obj1.show();
    obj2.show();
    // Mobile.show() Cannot make a static reference to the non-static method show() from the type Mobile.
    Mobile.show1(obj1);

    }
}