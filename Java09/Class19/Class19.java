class Data
{
    private String name;
    private Test score;
    Data(String na, int eg, int ma)
    {
        name=na;
        score=new Test(eg,ma);
    }
    class Test
    {
        int english;
        int math;
            Test(int eng,int m)
        {
            english=eng;
            math=m;
        }
        double avg()
        {
            return (english+math)*1.0/2*1.0;
        }
    }
    void show()
    {
        System.out.println("學生姓名:"+name);
        System.out.println("英文成績:"+score.english);
        System.out.println("數學成績:"+score.math);
        System.out.println("平均成績:"+score.avg());
    }
}
public class Class19
{
    public static void main(String[] args)
    {
        Data stu=new Data("Annie",85,92);
        stu.show();
    }
}