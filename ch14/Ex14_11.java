import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
public class Ex14_11
{
    public static void main(String[] args) throws IOException
    {
        writeData();
        cnt();
    }
    static void writeData() throws IOException
    {
        FileOutputStream fos = new FileOutputStream("rand99.txt");
        Random rd = new Random();
        for(int i = 1;i<=100;i++)
        {
            int a = rd.nextInt(26) + 97;
            fos.write((a));
        }
        fos.close();
    }
    static void cnt() throws IOException
    {
        FileInputStream fis = new FileInputStream("rand99.txt");
        byte ba[] = new byte[fis.available()];
        fis.read(ba);
        String countstr = new String(ba);
        int count = 0;
        for(int j = 0;j<=99;j++)
            if(countstr.charAt(j)=="a".charAt(0)||countstr.charAt(j)=="e".charAt(0)||countstr.charAt(j)=="i".charAt(0)||countstr.charAt(j)=="o".charAt(0)||countstr.charAt(j)=="u".charAt(0))
                count++;
        System.out.println(count);
        fis.close();
    }
}