package JAVA;
class Human
{
    private String name;
    private int age;

    // public void SetAge(int age, Human obj)
    // {
    //     Human obj1 = new Human();
    //     obj1 = obj;
    //     obj.age = age;
    // }
    public void SetAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
public class L13_0ThisKeyword {
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.SetName("Shatru");
        obj.SetAge(20);
        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}
