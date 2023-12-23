class Sub implements Runnable{
    private int n;
    private int sum=1;
    public Sub(int a){
        n=a;
    }
    public void run()
    {
        for(int i=1;i<=n;i++)
            sum*=i;
        System.out.println(sum);
    }
}
public class Ex15_6
{
    public static void main(String[] args)
    {
        Sub sub1 = new Sub(5);
        Sub sub2 = new Sub(10);
        Thread t1=new Thread(sub1);
        Thread t2=new Thread(sub2);
        t1.start();
        t2.start();
    }
}