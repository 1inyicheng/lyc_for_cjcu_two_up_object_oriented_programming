class CCalculator
{
    int a;
    int b;
    int c;
    void set_value(int x, int y,int z)
    {
        x=25;
        y=3;
        z=7;
    }
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
    void add()
    {
        System.out.println(a+b+c);
    }
    void sub()
    {
        System.out.println(a-b-c);
    }
    void mul()
    {
        System.out.println(a*b*c);
    }
    void avg()
    {
        System.out.println((a*1.0+b*1.0+c*1.0)/3.0);
    }
}
/*
public class Ex09
{
    public static void main(String[] args)
    {
        CCalculator c = new CCalculator();
        c.a=25;
        c.b=3;
        c.c=7;
        c.show();
        c.add();
        c.sub();
        c.mul();
        c.avg();
    }
}
*/