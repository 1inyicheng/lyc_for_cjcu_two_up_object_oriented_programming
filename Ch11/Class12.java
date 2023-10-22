// Ex11_12
interface iVolume{
    public void showData();
    public double vol();
}
abstract class Sphere implements iVolume{// (b) 因為Sphere類別是定義成抽象類別
    final double PI=3.14;
    protected int x;
    protected int y;
}
class Circle extends Sphere{
    // 請完成這個部分的程式碼
    int radius; // (a)
    Circle(int xx, int yy, int r)
    {
        x=xx;
        y=yy;
        radius=r;
    }
    public void showData()
    {
        System.out.println("球心:"+"("+x+","+y+")");
        System.out.println("半徑:"+radius);
        System.out.printf("球體積:%.2f\n",+vol());
    }
    public double vol()
    {
        return ((4.0/3.0)*PI)*(Math.pow((radius*1.0), 3.0));
    }
}

public class Ex11_12{
    public static void main(String[] args){
        Circle c1=new Circle(8,6,2);
        c1.showData();
    }
}