import java.util.*;

class MyArrayList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        String input = "";

        // nameList.add("ABC");
        // nameList.add("XYZ");
        // nameList.add("PQR");

        // for (int i = 0; i < nameList.size(); i++)
        // {
        //     System.out.println(nameList.get(i));
        // }

        while (true)
        {
            System.out.print("Enter the name or enter q to quit: ");
            input = sc.next();

            if (input.equalsIgnoreCase("q"))
            {
                break;
            }

            nameList.add(input);

        }
    }
}