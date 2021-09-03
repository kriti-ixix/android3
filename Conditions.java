import java.util.Scanner;

class Conditions
{
    public static void main(String[] args)
    {
        //int age = 19;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        //New comment

        if (age > 17)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }

    }
}
