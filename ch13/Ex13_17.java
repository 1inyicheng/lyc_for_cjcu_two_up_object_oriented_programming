import java.util.Scanner;
class IntegerlessThanZero extends Exception{}
class IntegerGreatetThanZero extends Exception{}
class IntegerEqualToZero extends Exception{}
public class Ex13_17
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            sc.close();
            if(a<0)
                throw new IntegerlessThanZero();
            else if(a>0)
                throw new IntegerGreatetThanZero();
            else
                throw new IntegerEqualToZero();
        }
        catch(IntegerlessThanZero ex)
            {System.out.println("您輸入的整數的值小於0");}
        catch(IntegerGreatetThanZero ex)
            {System.out.println("您輸入的整數的值大於0");}
        catch(IntegerEqualToZero ex)
            {System.out.println("您輸入的整數的值為0");}
    }
}