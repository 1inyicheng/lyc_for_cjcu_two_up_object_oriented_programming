// Ex13_14
class NotTriangle extends Exception{}
class EquilateralTriangle extends Exception{}
class NotEquilateralTriangle extends Exception{}
class Triangle
{
    void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle
    {
        if((a+b)<c || (a+c)<b || (b+c)<a)
            throw new NotTriangle();
        else if(a==b && a==c && b==c)
            throw new EquilateralTriangle();
        else
            throw new NotEquilateralTriangle();
    }
}
public class Ex13_14{
    public static void main(String[] args){
        int a=3, b=3, c=3;
        /*if((a+b)<c || (a+c)<b || (b+c)<a)
            System.out.println("不構成三角形");
        else if(a==b && a==c && b==c)
            System.out.println("這是正三角形");
        else
            System.out.println("這不是正三角形");*/
        Triangle tri=new Triangle();
        try
        {
            tri.triangle(a,b,c);
        }
        catch(NotTriangle ex)
            {System.out.println("不構成三角形");}
        catch(EquilateralTriangle ex)
            {System.out.println("這是正三角形");}
        catch(NotEquilateralTriangle ex)
            {System.out.println("這不是正三角形");}
    }
}