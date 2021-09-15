class MyExceptions
{
    public static void main(String[] args)
    {
        try
        {
            int[] myArr = {1, 2, 3, 4, 5};
            System.out.println(myArr[0]);
            System.out.println(myArr[10]);
        }
        
        catch (ArrayIndexOutOfBoundsException ae) 
        {
            System.out.println("Uh oh wrong index");
        }

        catch (Exception e) 
        {
            System.out.println("Uh oh some error occured");
        }
    }
}