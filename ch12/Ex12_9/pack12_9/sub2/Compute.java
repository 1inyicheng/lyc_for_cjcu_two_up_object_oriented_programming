package pack12_9.sub2;
import pack12_9.sub1.MyMath;
public class Compute extends MyMath
{
    public void add(int a,int b)
    {
        ans=a+b;
    }
    public void sub(int a,int b)
    {
        ans=a-b;
    }
    public void mul(int a,int b)
    {
        ans=a*b;
    }
    public void div(int a,int b)
    {
        ans=a/b;
    }
    int ans;
    public void show()
    {
        System.out.println("ans="+ans);
    }
}