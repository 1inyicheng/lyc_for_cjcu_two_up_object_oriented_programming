//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
class ArgumentOutOfBound extends Exception{}
class Prime
{
    boolean prime(int n) throws ArgumentOutOfBound
    {
        boolean flag=true;
        if(n<1 || n==1)
            throw new ArgumentOutOfBound();
        if(n==2 || n==3 || n==5 || n==7 || n==11 || n==13 || n==17 || n==19 || n==23)
            return true;
        else
        {
            for(int i=2;i<n;i++)
                if(n%i==0)
                    return false;
        }
        if(flag)
            return true;
        else
            return false;
    }
}
public class Ex13_19
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            //BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            Prime pr = new Prime();
            //int a = Integer.parseInt(bfr.readLine());
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            sc.close();
            if(pr.prime(a))
                //System.out.println(a+" is a prime number");
                System.out.println(true);
            else
                //System.out.println(a+" is not a prime number");
                System.out.println(false);
        }
        catch(ArgumentOutOfBound ex)
        {
            System.out.println(ex);
        }
        /*catch(IOException ex)
        {
            System.out.println(ex);
        }*/
    }
}