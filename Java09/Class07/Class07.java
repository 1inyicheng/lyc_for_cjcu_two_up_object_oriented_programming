public class Class07
{
    static void power(int x,int n)
    {
        int sum=1;
        for(int i=1;i<=n;i++)
        {
            sum*=x;
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        power(2,5);
        power(3,2);
    }
}