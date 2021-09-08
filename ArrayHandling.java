import java.util.Scanner;

class ArrayHandling
{
    public static void main(String[] args)
    {
        //int[] arr = {10, 20, 30, 40, 50, 60};
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter the values: ");
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int x : arr)
        {
            System.out.println(x);
        }
    }
}