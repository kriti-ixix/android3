import java.util.Scanner;

class ObjectArrays
{
    public static void main(String[] args)
    {
        Student[] students = new Student[5];
        Scanner sc = new Scanner(System.in);

        // Student s1 = new Student();
        // s1.rollno = 1; s1.name = "ABC";
        // s1.marks = 45.5; s1.subject = "JAVA";

        // students[0] = s1;

        for (int i = 0; i < students.length; i++) 
        {
            Student std = new Student();

            std.rollno = sc.nextInt();
            std.name = sc.next();
            std.marks = sc.nextFloat();
            std.subject = sc.next();
            
            students[i] = std;
        }
    }
}

class Student
{
   int rollno;
   String name;
   float marks;
   String subject; 
}