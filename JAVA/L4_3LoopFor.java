package JAVA;
public class L4_3LoopFor {
    public static void main(String[] args)
    {
        for (int i = 0; i <= 7; i++)
        {
            System.out.println("Day " + i);
            for (int j = 0; j <= 9; j++ )
            {
                System.out.println(" " + (j+8) + "-" + (j+9));
            }   
        }
    }
}