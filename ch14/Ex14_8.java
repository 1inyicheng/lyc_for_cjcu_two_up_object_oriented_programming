import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ex14_8
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("proverb.txt"));
        String str = br.readLine();
        br.skip(44);
        String str3 = br.readLine();
        System.out.println(str);
        System.out.println(str3);
        br.close();
    }
}