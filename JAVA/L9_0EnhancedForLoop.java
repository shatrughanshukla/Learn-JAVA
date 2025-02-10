package JAVA;

class Student
{
    String name;
    int rollno;
    int marks;
    String subject;
}

public class L9_0EnhancedForLoop 
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

        for(Student stud : student) // for each or enhanced loop
        {
            System.out.println(stud.name + " : " + stud.rollno + " - " + stud.subject +  " - " + stud.marks);
        }
    }
}
