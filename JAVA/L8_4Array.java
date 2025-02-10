// Arrays of Objects
package JAVA;

class Student
{
    String name;
    int rollno;
    int marks;
    String subject;
}
public class L8_4Array 
{
    public static void main(String[] args)
    {
        Student S1 = new Student();
        S1.name = "Shatrughan";
        S1.rollno = 391;
        S1.subject = "DLD";
        S1.marks = 14;
        Student S2 = new Student();
        S2.name = "Shivam";
        S2.rollno = 395;
        S2.subject = "DLD";
        S2.marks = 31;
        Student S3 = new Student();
        S3.name = "Shikhar";
        S3.rollno = 392;
        S3.subject = "DLD";
        S3.marks = 34;

        Student student[] = new Student[3];
        student[0] = S1;
        student[1] = S2;
        student[2] = S3;

        for(int i = 0; i < student.length; i++)
        {
            System.out.println(student[i].name + " : " + student[i].rollno + " - " + student[i].subject +  " - " + student[i].marks);
        }
    }
}


    // public static void main(String[] args)
    // {
        //     int num[] = new int[6];
    //     num[0] = 3;
    //     num[1] = 4;
    //     num[2] = 5;
    //     num[3] = 6;
    //     for(int i = 0; i < num.length; i++)
    //     {
    //         System.out.println(num[i]);
    //     }
    // }
