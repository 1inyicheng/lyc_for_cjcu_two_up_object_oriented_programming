class CRectangle
{
    protected int length;
    protected int width;

    public CRectangle(int l, int w)
    {
        length=l;
        width=w;
    }
    public String toString()//(a)
    {
        return "hello, world";
    }
    public String toString(int a, int b)
    {
        if(a>=b)
        {
            return super.toString();
        }
        else
        {
            return "Argument Error";
        }
    }
}
public class Class20
{
    public static void main(String[] args)
    {
        CRectangle rect = new CRectangle(2, 6);
        //System.out.println("length="+rect.length+", width="+rect.width+", area="+rect.length*rect.width);
        
        System.out.println(rect.toString());
        System.out.println(rect.toString(2,1));
        System.out.println(rect.toString(1,2));
    }
}
//(c) (a)是改寫、(a), (b)是多載。