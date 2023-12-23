import java.util.Random;
class PrePaid extends Thread
{
    int sum=200;
    public void run()
    {
        Random rd = new Random();
        while(sum>10)
        {
            if(sum<0 || sum<10)
                break;
            int fee = -1;
            if(sum>99)
                fee = rd.nextInt(0,100);
            else
                fee = rd.nextInt(0,sum+1);
            talk(fee);
        }
    }
    public void talk(int n)
    {
        try
        {
            Thread.sleep(0);
        }
        catch(InterruptedException ex){}
        sum-=n;
        System.out.println("打了"+n+"元"+"，餘額"+sum+"元");
    }
}
public class Ex15_12
{
    public static void main(String[] args)
    {
        PrePaid phone1=new PrePaid();
        PrePaid phone2=new PrePaid();
        PrePaid phone3=new PrePaid();
        phone1.start();
        phone2.start();
        phone3.start();
    }
}