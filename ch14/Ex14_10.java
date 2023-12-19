import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Data{
    private String name;
    private int english;
    private int math;
    Data(String str, int e, int m)
    {
        name = str;
        english = e;
        math = m;
    }
    void writeData() throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt", true));
        bw.write("姓名:"+name);
        bw.write("\n英文成績:"+english);
        bw.write("\n數學成績:"+math);
        bw.write("\n平均:"+(((english*1.0)+(math*1.0))/2.0));
        bw.close();
    }
    void show()
    {
        System.out.println(name+" "+english+" "+math+" "+(((english*1.0)+(math*1.0))/2.0));
    }
}
public class Ex14_10
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bwnewline = new BufferedWriter(new FileWriter("student.txt", true));
        Data stu1=new Data("Ariel",92,85);
        Data stu2=new Data("Fiona",67,89);
        stu1.writeData();
        bwnewline.write("\n");
        bwnewline.write("\n");
        bwnewline.close();
        stu2.writeData();
        stu1.show();
        stu2.show();
    }
    static void readData()
    {
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        System.out.println(br.readLine()+ "\n" +br.readLine()+ "\n" +br.readLine()+ "\n" +br.readLine()+ "\n" +br.readLine()+ "\n" +br.readLine()+ "\n" +br.readLine()+ "\n" +br.readLine()+ "\n" +br.readLine());
        br.close();
    }
    
}