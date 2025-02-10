package JAVA;

public class L10_0String {
    public static void main(String[] args)
    {
        String name = new String("Shatrughan");
        //name = name + new String("Shukla");
        name = name + "Shukla";
        System.out.println("Hello " + name);

        String s1 = "shatrughan";
        String s2 = "shatrughan";
        System.out.println(s1==s2);
    }
}
