import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex14_7
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("hello.txt",true);
        fw.write("Welcome!");
        fw.close();
        char data[]=new char[128];
        FileReader fr = new FileReader("hello.txt");
        int num = fr.read(data);
        String str = new String(data,0,num);
        System.out.println(str);
        fr.close();
    }
}