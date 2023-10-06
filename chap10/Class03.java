//hw10_1, 繼承的練習
class Caaa
{
    public int num1;
    public int num2;
    Caaa()
    {
        num1=1;
        num2=1;
    }
    Caaa(int a, int b)
    {
        num1=a;
        num2=b;
    }
}
//請於此處設計子類別Cbbb
class Cbbb extends Caaa
{
    void set_num(int i,int j)
    {
        num1=i;
        num2=j;
    }
    void show()
    {
        System.out.println(num1+" "+num2);
    }
    Cbbb(int a, int b)
    {
        super(a,b);
    }
}
public class hw10_1
{
    public static void main(String args[])
    {
        Caaa a=new Caaa();
        System.out.println(a.num1+" "+a.num2);
        Caaa b=new Caaa(3,4);
        System.out.println(b.num1+" "+b.num2);
        Cbbb c=new Cbbb(5,6);
        System.out.println(c.num1+" "+c.num2);
    }
}