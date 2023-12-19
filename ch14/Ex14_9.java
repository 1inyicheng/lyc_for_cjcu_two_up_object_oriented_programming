import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
public class Ex14_9
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader braaa = new BufferedReader(new FileReader("aaa.txt"));
        BufferedReader brbbb = new BufferedReader(new FileReader("bbb.txt"));
        FileWriter fwccc = new FileWriter("ccc.txt");
        String straaa = braaa.readLine();
        braaa.close();
        System.out.println(straaa);
        String strbbb = brbbb.readLine();
        brbbb.close();
        System.out.println(strbbb);
        String strccc = straaa + "\n" + strbbb;
        fwccc.write(strccc);
        fwccc.close();
        BufferedReader brccc = new BufferedReader(new FileReader("ccc.txt"));
        System.out.println(brccc.readLine());
        System.out.println(brccc.readLine());
        brccc.close();
    }
}