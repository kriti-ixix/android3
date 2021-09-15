class MyConstructors
{
    public static void main(String[] args)
    {
        StudentInfo s1 = new StudentInfo("ABC", 10, 45.0);
        StudentInfo s2 = new StudentInfo();
        System.out.println(s1.marks);
        System.out.println(s2.marks);
    }
}

class StudentInfo
{
    String name; int rollno; double marks;

    StudentInfo()
    {
        marks = 100.0;
        System.out.println("Constructor is called");
    }

    StudentInfo(String n, int rn, double m)
    {
        this.name = n;
        this.rollno = rn;
        this.marks = m;
    }
}