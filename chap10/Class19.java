class CRectangle
{
    protected int length;
    protected int width;

    CRectangle(int l, int w)
    {
        length=l;
        width=w;
    }
}
public class Class19
{
    public static void main(String[] args)
    {
        CRectangle rect = new CRectangle(2, 6);
        System.out.println("length="+rect.length+", width="+rect.width+", area="+rect.length*rect.width);
    }
}