class CWin
{
    static int cnt=0;//(f)類別變數，因為用實例變數只會每次cnt都是1
    String color;
    int width;
    int height;
    CWin()
    {
        cnt++;
        color="Red";
        width=2;
        height=2;
    }
    void count()//(g)兩者都可以
    {
        System.out.println(cnt);
    }
    void Cwin(String str, int w,int h)//原本是寫Cwin
    {
        color=str;
        width=w;
        height=h;
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
public class Class08
{
    public static void main(String[] args)
    {
        CWin w = new CWin();
        CWin x = new CWin();
        w.count();
        System.out.println(w.color+" "+w.width+" "+w.height);
        w.Cwin("White",3,4);
        System.out.println(w.color+" "+w.width+" "+w.height);
        w.setZero();
        w.count();
        w.setValue(5);
        w.count();
    }
}