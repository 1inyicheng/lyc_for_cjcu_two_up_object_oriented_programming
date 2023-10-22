// Ex11_8, 多重繼承的練習
interface Data{
    public void showData();
}
interface Test{
    public void showScore();
    public double calcu();
}

// 請完成這個部分的程式
class Stu implements Data, Test{
    protected String id;    //學號
    protected String name;  //姓名
    protected int mid;      //期中考成績
    protected int finl;     //期末考成績
    protected int common;   //平時成績
    Stu(String i, String n, int m, int f, int c)
    {
        id=i;
        name=n;
        mid=m;
        finl=f;
        common=c;
    }
    public void showData()
    {
        System.out.println(id+" "+name);
    }
    public void showScore()
    {
        System.out.println(mid+" "+finl+" "+common);
    }
    public double calcu()
    {
        return (mid*1.0)*0.3+(finl*1.0)*0.3+(common*1.0)*0.4;
    }
    void show()
    {
        showData();
        showScore();
        System.out.println(calcu());
    }
}
public class Ex11_8{
    public static void main(String args[]){
        Stu stu=new Stu("940001","Fiona",90,92,85);
        stu.show();
    }
}