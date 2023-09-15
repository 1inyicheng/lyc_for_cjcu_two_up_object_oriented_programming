class CTest
{
    void test(int a)
    {
        if(a%2!=0)
        {
            System.out.println("此數為奇數");
        }
        else if(a==0)
        {
            System.out.println("此數為0");
        }
        else if(a%2==0)
        {
            System.out.println("此數為偶數");
        }
    }
}
/*
public class Ex07
{
    public static void main(String[] args)
    {
        CTest t = new CTest();
        t.test(3);
        t.test(8);
        t.test(0);
    }
}
*/