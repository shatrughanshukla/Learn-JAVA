package JAVA;
class CalcuLator{
    int num = 5;
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}
public class L7_0StacknHeap {
   int  data = 10;
   public static void main(String[] args)
   {
        CalcuLator calc0 = new CalcuLator();
        CalcuLator calc1 = new CalcuLator();
        int r1 = calc0.add(5, 6);
        System.out.println(r1);
        System.out.println(calc0.num);
        System.out.println(calc1.num);
        calc1.num = 8;
        System.out.println(calc0.num);
        System.out.println(calc1.num);
   } 
}
