public class Ex12_19
{
    public static void main(String[] args)
    {
        f(5);
    }
    static void f(int n)
    {
        double a=0;
        for(int i=1;i<=n;i++)
            a+=Math.sqrt((i*1.0));
        System.out.println(a);
    }
}