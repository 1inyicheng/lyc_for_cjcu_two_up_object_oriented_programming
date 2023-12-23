class tr implements Runnable
{
    int name;
    public tr(int n)
    {
        name=n;
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                if(name==1)
                    Thread.sleep(1000);
                else
                    Thread.sleep(2500);
            }
            catch(InterruptedException ex){}
            finally
            {
                System.out.println("Thread "+name+" is running");
            }
        }
    }
}
public class Ex15_7
{
    public static void main(String[] args)
    {
        tr th1 = new tr(1);
        tr th2 = new tr(2);
        th1.run();
        th2.run();
    }
}