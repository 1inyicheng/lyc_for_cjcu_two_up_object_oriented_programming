class CCount
{
    static int cnt=0;//(d)類別變數，因為才會把所有曾經有創一個新的物件計算在內，否則用實例變數會只計算一次
    CCount()
    {
        cnt++;
    }
    void count()//(e)都可以
    {
        System.out.println(cnt);
    }
    void setZero()
    {
        cnt=0;
    }
    void setValue(int n)
    {
        cnt=n;
    }
}
public class Class05
{
    public static void main(String[] args)
    {
        CCount c = new CCount();
        CCount d = new CCount();
        c.count();
        c.setZero();
        c.count();
        c.setValue(5);
        c.count();
    }
}