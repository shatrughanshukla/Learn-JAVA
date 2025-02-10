package JAVA;
//package JAVA;

public class L10_1StringBuffernStringBuilder {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Shatrughan");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Shukla");
        System.out.println(sb);
        sb.insert(3, "HEHEHE");
        System.out.println(sb);
        sb.setLength(40);
        System.out.println(sb.length());
        sb.ensureCapacity(99);
        System.out.println(sb.capacity());
    }
}
// string buffer is thread safe while string builder isn't.