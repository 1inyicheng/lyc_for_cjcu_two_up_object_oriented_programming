import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex14_3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buf;
        String str;

        buf=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a string: ");
        str=buf.readLine(); // 將輸入的文字指定給字串變數str存放
        int a = Integer.parseInt(str);
        System.out.println("string="+(1+a)*(a)/2); // 印出字串
    }
}