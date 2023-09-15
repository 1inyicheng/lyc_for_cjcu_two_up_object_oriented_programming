// hw8_12,視窗類別
class Cwin
{
    int width;
    int height;
    String name;

    void setW(int w) // 設定寬度的函數
    {
        // 請在此處填上程式碼
        width=w;
    }
    void setH(int h)// 設定高度的函數
    {
        // 請在此處填上程式碼
        height=h;
    }
    void setName(String s)// 設定視窗名稱的函數
    {
        name=s;
    }

    public void show()
    {
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="+height);
    }
    void setWindows(int w, int h)
    {
        width=w;
        height=h;
    }
    void setWindows(int w, int h, String s)
    {
        width=w;
        height=h;
        name=s;
    }
}

public class hw8_12
{
    public static void main(String args[])
    {
        Cwin cw=new Cwin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();
        cw.setWindows(2,4);
        cw.show();
        cw.setWindows(6,8,"Your Windows");
        cw.show();
    }
}