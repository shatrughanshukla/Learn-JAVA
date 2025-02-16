package JAVA;
class Human
{
    private String name;
    private int age;

    public void SetAge(int a)
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }
    public void SetName(String s)
    {
        name = s;
    }
    public String getName()
    {
        return name;
    }
}
public class L12_Encapsulaton {
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.SetName("Shatru");
        obj.SetAge(20);
        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}
