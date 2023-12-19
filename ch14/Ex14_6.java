import java.io.FileWriter;
import java.io.IOException;
public class Ex14_6
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("hello.txt");
        char hi[]={'H','e','l','l','o',' ','J','a','v','a','!','\r','\n'};
        fw.write(hi);
        
        fw.close();
    }
}