class CRectangle
{
    int width;
    int height;
    public CRectangle(int w, int h)
    {
        width=w;
        height=h;
    }
    /*
    CRectangle()
    {
        width=10;
        height=8;
    }
    */

    public CRectangle()
    {
        this(10,8);
    }

}
public class Class01
{
    public static void main(String[] args)
    {
        CRectangle r = new CRectangle();
        System.out.println(r.width+" "+r.height);
    }
}