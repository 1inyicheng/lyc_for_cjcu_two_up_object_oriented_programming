class CTriangle
{
    protected int base;
    protected int height;
    
    protected void show()
    {
        System.out.println("base="+base+", height="+height);
    }
}
class CData extends CTriangle
{
    CData(int a, int b)
    {
        base=a;
        height=b;
    }
    void area()
    {
        show();
        System.out.println("area="+(base*1.0)*(height*1.0)/2.0);
    }
}
public class Class06
{
    public static void main(String[] args)
    {
        CData obj=new CData(3,8);
        obj.area();
    }
}