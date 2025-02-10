package JAVA;

public class L8_2Jaggedn3DArray {
    public static void main(String[] args)
    {
        int num[][] = new int[3][];
        num[0] = new int[4];
        num[1] = new int[8];
        num[2] = new int[2];

        for(int i = 0; i <num.length; i++)
        {
            for(int j = 0; j < num[i].length; j++)
            {
                num[i][j] = (int)(Math.random() * 10);
            }
        }
        // // The Beauty of using enhanced for loop is u don't need to mention the size anywhere it will automatically detect where the values are..
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
