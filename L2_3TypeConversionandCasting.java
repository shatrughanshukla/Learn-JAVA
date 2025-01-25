//package JAVA;

public class L2_3TypeConversionandCasting 
{
    public static void main(String[] args)
    {
        // byte b = 127;
        int  a = 257;
        byte k = (byte)a; // modulo 257/256 = 1
        
        float f = 10.34f;
        int t = (int)f;
        System.out.println(k);
        System.out.println(t);

        // Type Promotion
        byte b1 = 12;
        byte b2 = 13;

        int result = b1 * b2; // b1 and b2 are promoted to int
        System.out.println(result);
    }
}
