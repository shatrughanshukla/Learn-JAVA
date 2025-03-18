package JAVA;
class Human
{
    int age;
    String name;

    Human()
    {
        System.out.println("This is default Constructor");
    }

    Human(int age, String name)
    {
        System.out.println("This is parameteric constructor");
        this.age = age;
        this.name = name;
    }
    void dispaly()
    {
        System.out.println(this.name + ": " + this.age);
    }
}

public class L14_0Constructor {
    public static void main(String[] args)
    {
        Human h1= new Human(20, "Rishav");
        h1.dispaly();
    }
}
