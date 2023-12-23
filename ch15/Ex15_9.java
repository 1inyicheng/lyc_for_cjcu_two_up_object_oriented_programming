class Pig implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("小豬看到大野狼在爬煙囪");
            System.out.println("就在壁爐上煮了一鍋水");
            System.out.println("2分鐘 4分鐘 6分鐘 8分鐘 10分鐘");
            System.out.println("一鍋煮沸的熱水煮好了");
        }
        catch(InterruptedException ex)
        {

        }
        finally
        {

        }
    }
}
class Wolf implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("大野狼對著第三隻小豬的房子吹氣");
            System.out.println("牠不停地吹氣又吹氣");
            System.out.println("還是不能把房子吹倒");
            System.out.println("大野狼非常的生氣");
            System.out.println("牠決定要從煙囪爬進小豬的家裡");
            Thread.sleep(1500);
        }
        catch(InterruptedException ex){}
        finally
        {
            System.out.println("3分鐘 6分鐘 9分鐘 12分鐘 15分鐘");
            System.out.println("大野狼爬上煙囪了");
        }
    }
}
public class Ex15_9
{
    public static void main(String[] args)
    {
        Pig pig = new Pig();
        Wolf wolf = new Wolf();
        Thread pigt = new Thread(pig);
        Thread wolft = new Thread(wolf);
        try
        {
            wolft.start();
            pigt.start();
            Thread.sleep(2000);
        }
        catch(Exception ex){}
        System.out.println("大野狼從煙囪滑進房子裡");
        System.out.println("就被小豬煮好的水燙死了");
    }
}
/* output-----------------------------------
大野狼對著第三隻小豬的房子吹氣
牠不停地吹氣又吹氣
還是不能把房子吹倒
大野狼非常的生氣
牠決定要從煙囪爬進小豬的家裡
小豬看到大野狼在爬煙囪
就在壁爐上煮了一鍋水
2分鐘 4分鐘 6分鐘 8分鐘 10分鐘
一鍋煮沸的熱水煮好了
3分鐘 6分鐘 9分鐘 12分鐘 15分鐘
大野狼爬上煙囪了
大野狼從煙囪滑進房子裡
就被小豬煮好的水燙死了
-----------------------------------*/