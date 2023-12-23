class hi_bye implements Runnable
{
    String name;
    public hi_bye(String str)
    {
        name=str;
    }
    public void run()
    {
        if(name.equals("hi"))
            for(int i=1;i<=5;i++)
                try
                {
                    System.out.println("Hello "+i);
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex){}
                
        else
            for(int j=1;j<=5;j++)
                try
                {
                    System.out.println("Good bye "+j);
                    Thread.sleep(2500);
                }
                catch(InterruptedException ex){}
    }
}
public class Ex15_10
{
    public static void main(String[] args)
    {
        hi_bye hi_ = new hi_bye("hi");
        hi_bye bye_ = new hi_bye("bye");
        Thread hi = new Thread(hi_);
        Thread bye = new Thread(bye_);
        hi.start();
        bye.start();
    }
}