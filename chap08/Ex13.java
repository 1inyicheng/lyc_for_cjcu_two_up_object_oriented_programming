class CCircle
{
    double area(double r)
    {
        return r*r*3.14;
    }
    float area(float r)
    {
        return (float)(r*r*3.14);
    }
    double area(int r)
    {
        return r*r*3.14;
    }
}
public class Ex13
{
    public static void main(String[] args)
    {
        CCircle c=new CCircle();
        System.out.println(c.area(2));
        System.out.println(c.area(2.2f));
        System.out.println(c.area(2.2));
    }
}