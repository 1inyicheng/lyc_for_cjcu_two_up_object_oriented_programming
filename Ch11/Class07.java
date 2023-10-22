// Ex11_7, 多重繼承的練習
interface MyMath{
    void show();
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}
interface AdvancedMath{
    public void mod(int a, int b); //計算a%b
    public void fac(int a);        //計算a!
    public void pow(int a, int b); //計算a^b
}
class Compute implements MyMath, AdvancedMath{
      // 請完成這個部分的程式碼
    int ans;
    public void show()
    {
        System.out.println("ans="+ans);
    }
    public void add(int a, int b)
    {
        ans=a+b;
    }
    public void sub(int a, int b)
    {
        ans=a-b;
    }
    public void mul(int a, int b)
    {
        ans=a*b;
    }
    public void div(int a, int b)
    {
        ans=a/b;
    }
    public void mod(int a, int b)
    {
        ans=a%b;
    }
    public void fac(int a)
    {
        ans=1;
        for(int i=1;i<=a;i++)
            ans*=i;
    }
    public void pow(int a, int b)
    {
        ans=(int)Math.pow((a*1.0), (b*1.0));
    }
}

public class Ex11_7{
    public static void main(String[] args){
        Compute cp=new Compute();
        cp.mul(3,5);
        cp.show();        // 此行會回應"ans=15"字串
        cp.mod(14,5);
        cp.show();        // 此行會回應"ans=4"字串
        cp.fac(5);
        cp.show();        // 此行會回應"ans=120"字串
    }
}