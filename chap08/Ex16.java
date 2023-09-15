class CSphere
{
    private int x;       //圓心的x座標
    private int y;       //圓心的y座標
    private int z;       //圓心的z座標
    private int radius;  //圓球的半徑
    void setLocation()
    {
        x=3;
        y=4;
        z=5;
    }
    void setRadius()
    {
        radius=1;
    }
    void surfaceArea()
    {
        System.out.println(4*3.14*Math.pow(radius,2));
    }
    void volume()
    {
        System.out.println((4.0/3.0)*3.14*Math.pow(radius,3));
    }
    void showCenter()
    {
        System.out.println(x+" "+y+" "+z);
    }
}
/*
public class Ex16
{
    public static void main(String[] args)
    {
        CSphere s=new CSphere();
        s.setLocation();
        s.setRadius();
        s.surfaceArea();
        s.volume();
        s.showCenter();
    }
}
*/