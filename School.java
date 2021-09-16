class School
{
    public static void main(String[] args)
    {
        Exams1 e1 = new Exams1();
        e1.rollno = 5;
        e1.name = "Student1";
        e1.gender = 'm';
        e1.subject = "JAVA";
        e1.marks = 20;
        //System.out.println(e1.name + " got " + e1.marks + " in " + e1.subject);
        //System.out.println(e1.x);
        e1.printX();
    }
}

class Student1
{
    int rollno; String name; char gender; String x = "Parent class";
}

class Exams1 extends Student1
{
    String subject; double marks; String x = "Child class"; 

    void printX()
    {
        System.out.println(x);
        System.out.println(super.x);
    }

}