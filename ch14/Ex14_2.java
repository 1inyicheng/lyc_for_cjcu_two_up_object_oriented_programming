import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex14_2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buf;
        String str;

        buf=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a string: ");
        str=buf.readLine(); // 將輸入的文字指定給字串變數str存放

        System.out.println("string="+str.toUpperCase()); // 印出字串
    }
}