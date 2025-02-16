package JAVA;

public class L8_1MultiDimensional_Array {
    public static void main(String[] args)
    {
        int num[][] = new int[3][4];
        for(int i = 0; i <3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                num[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i = 0; i <3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // // enhanced for loop:
        for(int n[] : num)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
