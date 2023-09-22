// hw9_10, 分數類別的應用
class CRational //分數類別
{
    public int n;
    public int d;
    public void setN(int num) //設定分子
    {
        n=num;
    }
    public void setD(int num) //設定分母
    {
        d=num;
    }
    /*
    public void show()
    {
        System.out.println(n+"/"+d); //顯示分數
    }
    */
    public void setND(int num, int den)
    {
        setN(num);
        setD(den);
    }
}
public class hw9_10
{
    public static void show(CRational obje)
    {
        System.out.println(obje.n+"/"+obje.d); //顯示分數
    }
    public static void main(String args[])
    {
        CRational aaa=new CRational();
        aaa.setN(2);
        aaa.setD(5);
        show(aaa);
        aaa.setND(3, 7);
        show(aaa);
    }
}
