// hw10_5,簡單的繼承範例
class Caaa
{
    private int num;

    public Caaa(int n)
    {
        num=n;
    }
    public int get()
    {
        return num;
    }
    void display()
    {
        System.out.println("printed from Caaa class");
    }
}
class Cbbb extends Caaa //因為會用到父類別的方法，且尚未建構父類別，所以會發生錯誤。
{
    Cbbb()
    {
        super(0);
    }
    void show()
    {
        System.out.println("num="+get());
    }
    void display()
    {
        System.out.println("printed from Cbbb class");
    }
}
public class hw10_5
{
    public static void main(String args[])
    {
        Caaa bb=new Cbbb();
        bb.display();//會從子類別呼叫。
        //bb.show();
    }
}