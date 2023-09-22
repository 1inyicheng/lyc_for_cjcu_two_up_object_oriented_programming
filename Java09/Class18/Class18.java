// hw9_18,
public class Class18
{
    public static void main(String args[])
    {
        /*請在此撰寫CCircle的匿名內部類別，並用它呼叫
                            show()函數來顯示出圓面積*/
        (
            new CCircle(2)
            {
                void show(double d)
                {
                    System.out.println(radius*radius*pi);
                }
            }
        ).show(2);
    }
    static class CCircle
    {
        public double pi=3.14;
        public double radius;

        public CCircle(double r)
        {
            radius=r;
        }
    }
}