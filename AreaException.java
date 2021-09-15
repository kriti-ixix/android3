import java.util.Scanner;

class AreaException
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length: ");
            int length = sc.nextInt();
            System.out.print("Enter breadth: ");
            int breadth = sc.nextInt();

            if ((length < 0) || (breadth < 0))
            {
                throw new ArithmeticException("Length or breadth cant be negative");
            }

            int area = length * breadth;
            System.out.println("Area is " + area);
        }

        catch (ArithmeticException e)
        {
            //System.out.println("ArithmeticException");
            e.printStackTrace();
        }

    }
}