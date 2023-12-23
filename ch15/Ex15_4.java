class Add implements Runnable{
    private int n;
    private int sum=0;
    public Add(int a){
        n=a;
    }
    public void run()
    {
        sum = (1+n)*(n)/2;
        System.out.println(sum);
    }
}
public class Ex15_4
{
    public static void main(String[] args)
    {
        Add add1=new Add(5);
        Add add2=new Add(10);
        Thread t1=new Thread(add1);
        Thread t2=new Thread(add2);
        t1.start();
        t2.start();
    }
}