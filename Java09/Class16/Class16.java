// app9_12, 建立物件陣列
class CCircle // 定義類別CCircle
{
    private static double pi=3.14;
    private double radius;

    public CCircle(double r) // CCircle建構元
    {
        radius=r;
    }
    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }
}
public class app9_12
{
    public static void main(String args[])
    {
        /*
        CCircle cir[];
        cir=new CCircle[3];
        cir[0]=new CCircle(1.0);
        cir[1]=new CCircle(4.0);
        cir[2]=new CCircle(2.0);

        cir[0].show();
        cir[1].show();
        cir[2].show();
        */
        CCircle cir[] = new CCircle[6];
        for(int i=0;i<=5;i++)
            cir[i] = new CCircle(i);
        for(int i=0;i<=5;i++)
            cir[i].show();
    }
}