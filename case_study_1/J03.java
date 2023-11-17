class AllPC
{
    boolean isExpensive()
    {
        if(26600>20800) return true;
        else return false;
    }
}
public class J03
{
    public static void main(String[] args)
    {
        AllPC apc = new AllPC();
        if (apc.isExpensive())
        {
            System.out.println("Note15 is more expensive than PC");
        }
    }
}