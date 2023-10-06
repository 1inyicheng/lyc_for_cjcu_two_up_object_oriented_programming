//hw10_1, 繼承的練習
class Caaa
{
    public int num1;
    public int num2;
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
}
public class hw10_1
{
    public static void main(String args[])
    {
        Cbbb bb=new Cbbb();
        bb.set_num(5,10);
        bb.show();
    }
}