package JAVA;

class Computer
{
    public void runVS()
    {
        System.out.println("VS CODE Started");
    }

    public String typed(int a)
    {
        if(a < 5)
        return"Saved";

        return "stack overloaded";
    }
}

public class L6_0MethodsinJava {
    public static void main(String[] args)
    {
        Computer func = new Computer();
        func.runVS();
        String str = func.typed(4);
        System.out.println(str);
    }
}
