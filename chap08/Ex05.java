class CBox
{
    int length;
    int width;
    int height;
    void volume()
    {
        System.out.println(length*width*height);
    }
    void surfaceArea()
    {
        System.out.println(2*(length*width+width*height+height*length));
    }
    void showData()
    {
        System.out.println(length+" "+width+" "+height);
    }
    void showAll()
    {
        showData();
        surfaceArea();
        volume();
    }
}
public class Ex05
{
        public static void main(String[] args)
    {
        CBox box = new CBox();
        box.length=1;
        box.width=1;
        box.height=1;
        /*
        box.volume();
        box.surfaceArea();
        box.showData();
        box.showAll();
        */
    }  
}