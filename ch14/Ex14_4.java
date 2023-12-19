import java.io.FileReader;
import java.io.IOException;
public class Ex14_4
{
    public static void main(String[] args) throws IOException
    {
        char data[]=new char[128];
        FileReader fr = new FileReader("donkey.txt");
        
        int num = fr.read(data);

        String str = new String(data,0,num);
        System.out.println(str);
        System.out.println(num); // 28
        // 因為28是在第一、二行時，有\r\n.
        fr.close();
    }
}