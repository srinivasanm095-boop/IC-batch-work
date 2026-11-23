class cirlce extends Shape
{
    public void CalculateArea()
    {
        double radius=5.0;
        double area=3.14*radius*radius;
        System.out.println("Area of Circle is:"+area);
    }
}
class rectangle extends Shape
{
    public void CalculateArea()
    {
        double length=10.0;
        double width=5.0;
        double area=length*width;
        System.out.println("Area of Rectangle is:"+area);
    }
}
public class Shape {
    public static void main(String[] args)
    {
        cirlce c=new cirlce();
        c.CalculateArea();
        rectangle r=new rectangle();
        r.CalculateArea();
    }
}