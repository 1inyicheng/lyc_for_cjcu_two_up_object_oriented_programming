//hw10_11, 利用父類別變數存取子類別成員的練習(一)
class CShape //父類別CShape
{
    double r;
    double pi=3.14;
    double p;
    double base;
    double height;
    public double area()
    {
        return 0.0;
    }
    static void largest(CShape[] obj)
    {
        double big_num=0.0;
        for(int i=0;i<=5;i++)
        {
            if(obj[i].area()>big_num) big_num=obj[i].area();
        }
        System.out.println("max area is "+big_num);
    }
}
class CCircle extends CShape
{
    CCircle(double a)
    {
        r=a;
    }
    public double area()
    {
        return r*r*pi;
    }
}
class CSquare extends CShape
{
    CSquare(double a)
    {
        p=a;
    }
    public double area()
    {
        return p*p;
    }
}
class CTriangle extends CShape
{
    CTriangle(double a, double b)
    {
        base=a;
        height=b;
    }
    public double area()
    {
        return base*height/2;
    }
}
public class Class11
{
    public static void main(String[] args)
    {
        CShape c1=new CCircle(1);
        CShape c2=new CCircle(2);
        CShape s1=new CSquare(3);
        CShape s2=new CSquare(4);
        CShape t1=new CTriangle(5,6);
        CShape t2=new CTriangle(7,8);
        CShape[] cs = {c1,c2,s1,s2,t1,t2};
        CShape.largest(cs);
    }
}