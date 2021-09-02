class Example
{
    int x = 10, y = 20;

    void addNumbers()
    {
        System.out.println(x + y);
    }

    int subNumbers()
    {
        return x - y;
    }

    void multiplyNumbers(int a, int b)
    {
        
    }

    public static void main(String[] args)
    {
        Example ex = new Example();
        //System.out.println("Hello world!");
        //System.out.println(ex.x);
        //System.out.println(ex.y);
        ex.addNumbers();
        int output1 = ex.subNumbers();

        Example ex2 = new Example();
        ex2.x = 100;
        //System.out.println(ex2.x);
        ex2.addNumbers();
        int output2 = ex2.subNumbers();
    }
}