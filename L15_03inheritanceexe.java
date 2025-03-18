package JAVA;
import java.util.Scanner;
public class L15_03inheritanceexe {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {   
            int n1 = sc.nextInt();
           int n2 = sc.nextInt();
           L15_02inheritanceveryadvcalc obj = new L15_02inheritanceveryadvcalc();
            int sum = obj.add(n1, n2);
            int sub = obj.sub(n1, n2);
            int multi = obj.multi(n1, n2);
            float div = obj.div(n1, n2);
            double power = obj.power(n1, n2);
            System.out.println("The sum is: " +  sum);
            System.out.println("The sub is: " +  sub);
            System.out.println("The multi is: " +  multi);
            System.out.println("The div is: " +  div);
            System.out.println("The power of n2 over n1 is: " +  power);
        }finally{
            sc.close();
        }
    }
}
/*
 * The issue arises because you are performing integer division, which truncates the decimal part and results in an integer. In Java, when both operands of the division are integers, the result is also an integer. To get a floating-point result, at least one of the operands must be a floating-point number.

You can cast one of the integers to a float before performing the division. Here's how you can modify the div method call to ensure floating-point division:

Alternatively, you can modify the div method in the L15_01inheritanceadvcalc class to cast the integers to floats before performing the division. Here's an example of how you might do that:
public float div(int a, int b) {
    return (float) a / b;
}
   This ensures that the division operation is performed in floating-point arithmetic, giving you the expected result of 2.5 when n1 is 5 and n2 is 2. 
 */