interface MyInterface
{
    void calArea();
    void calPerimeter();
}

class Square implements MyInterface
{
    public void calArea()
    {
        int s = 10;
        System.out.println("Area of square: " + s*s);
    }

    public void calPerimeter()
    {}
}

class Rectangle implements MyInterface
{
    public void calArea()
    {
        int l = 50, b = 60;
        System.out.println("Area of rectangle: " + l*b);
    }

    public void calPerimeter()
    {}
}

class Mensuration
{
    public static void main(String[] args)
    {
        Square s = new Square();
        Rectangle r = new Rectangle();
        s.calArea();
        r.calArea();
    }
}