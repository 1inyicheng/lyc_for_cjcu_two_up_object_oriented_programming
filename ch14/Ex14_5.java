import java.io.FileReader;
import java.io.IOException;
public class Ex14_5
{
    public static void main(String[] args) throws IOException
    {
        char data[]=new char[7];
        FileReader fr = new FileReader("donkey.txt");
        
        int num = fr.read(data);

        String str = new String(data,0,num);
        System.out.println(str);
        //System.out.println(num);
        fr.close();
    }
}