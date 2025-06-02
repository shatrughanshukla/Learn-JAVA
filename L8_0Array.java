package JAVA;

public class L8_0Array {
    public static void main(String[] args)
    {
        int num[] = new int[4];
        num[0] = 3;
        num[1] = 4;
        num[2] = 5;
        num[3] = 6;
        for(int i = 0; i < 4; i++)
        {
            System.out.println(num[i]);
        }
    }
}

/*
 * 💡 Java Arrays Are Objects
In Java, everything except primitive types (int, char, etc.) is an object.

When you write this:

int[] arr;
You’re declaring a reference variable named arr that can point to an object of type int array. But right now, it points to nothing (i.e., it's null).

Then you write:

arr = new int[5];
Now this does 2 things:

Allocates memory for 5 integers (all set to 0 by default).

Creates an object in heap memory — like:
new int[]{0, 0, 0, 0, 0}

Sets arr to refer to that object.

✅ So now arr points to a real array object in memory.


 */