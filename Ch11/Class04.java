// Ex11_4, 介面實作的範例
interface MyMath{
    public void show();
    public void add(int a, int b);  // 計算a+b
    public void sub(int a, int b);  // 計算a-b
    public void mul(int a, int b);  // 計算a*b
    public void div(int a, int b);  // 計算a/b
}
class Compute implements MyMath{
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
}

public class Ex11_4{
    public static void main(String args[]){
        Compute cp=new Compute();
        cp.mul(3,5); // 計算3*5
        cp.show();        //此行會回應"ans=15"字串
    }
}