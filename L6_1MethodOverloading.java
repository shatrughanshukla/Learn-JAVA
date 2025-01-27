package JAVA;

    class Calc
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
    public int add(int n1 , int n2 , int n3)
    {
        return n1 + n2 + n3;
    }
}

public class L6_1MethodOverloading {
    public static void main(String[] args)
    {
        int num1 = 45;
        int num2 = 23;
        int num3 = 29;

        Calc calc = new Calc();
        int result1 = calc.add(num1, num2);
        int result2 = calc.add(num1, num2, num3);

        System.out.println(result1);
        System.out.println(result2);

    }
}