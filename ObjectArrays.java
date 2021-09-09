import java.util.Scanner;

class ObjectArrays
{
    public static void main(String[] args)
    {
        //Student[] stdList = new Student[5];
        ArrayList<Student> stdList = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            Student std = new Student();
            System.out.print("Enter roll no: ");
            std.rollno = sc.nextInt();
            System.out.print("Enter name: ");
            std.name = sc.next();
            System.out.print("Enter marks: ");
            std.marks = sc.nextFloat();

            //stdList[i] = std;
            stdList.add(std);
        }

        for (Student std: stdList)
        {
            
        }
    }
}

class Student
{
    String name;
    float marks; 
    int rollno;
}