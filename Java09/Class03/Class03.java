// hw9_3, 從某一建構元呼叫另一建構元
class Caaa // 定義類別Caaa //(c)不可以，因為會與第18行public class hw9_3衝突
{
    private int value;//(d)不會有影響，因為value變數只改變在自己的類別裡面

    public Caaa()
    {
        //試填寫此處的程式碼，使得呼叫此建構元時，value的值會被設為10
        value=10;
        System.out.println("value="+value);
    }
    public Caaa(int i)
    {
        value=i;
        System.out.println("value="+value);
    }
}
public class hw9_3
{
    public static void main(String args[])
    {
        Caaa obj1=new Caaa();//(b)第6行會被呼叫
        Caaa obj2=new Caaa(12);//(b)第12行會被呼叫
    }
}