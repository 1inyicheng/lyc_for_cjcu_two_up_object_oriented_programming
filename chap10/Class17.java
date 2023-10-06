class Car
{
    protected String owner;
    protected String id;

    final void show()
    {
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
    }
    CRectangle(String own, String s)//(a)試在Car類別裡加入一個有引數的建構元CRectangle(String own, String s)，它可以用來把owner設值為own，把id設值為s |(e)為什麼是CRectangle不是Car?
    {
        owner=own;
        id=s;
    }
}
class CColor extends Car
{
    String color;
    CColor(String own, String s)
    {
        super(own, s);
        color=cc;
    }
    public void show()
    {
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
        System.out.println("車身顏色"+color);
    }
} 
public class Class17
{
    public static void main(String[] args)
    {
        CColor mycar=new CColor("Riaan", "A1-2345", "Black");//(e)三個字串變數沒有辦法輸入。
        mycar.show();//(e)show()沒有辦法使用，因為父類別show方法是final，無法更改。
    }
}
//(e)Car建構元改名成Car，CColor()更改成可以輸入三個字串，把父類別show()的final刪掉。