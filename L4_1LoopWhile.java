package JAVA;
public class L4_1LoopWhile
{
    public static void main(String[] args)
    {
        int i = 1;
        while (i<=4)
        {
            System.out.print("I'm Groot" + i);
            int j = 1;
            while (j <= 3)
            {
                System.out.print(" Shut Up ! ");
                j++;
            }
                System.out.println();
            i++;
        }
        System.out.println("THE END" + i);
    }
}