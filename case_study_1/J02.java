class PC
{
    double cpup = 11000.0;
    double hdp = 2800.0;

    double getCost()
    {
        return (cpup+hdp)+500;
    }
    double getPrice()
    {
        return (cpup+hdp)*1.8;
    }
}
class MultiPC
{
    double cpup = 11000.0;
    double hdp = 2800.0;

    double getCost(double b, double c)
    {
        return (cpup*b+hdp*c)*1.2;
    }
    double getPrice(double b, double c)
    {
        return (cpup*b+hdp*c)*1.8;
    }
}
public class J02
{
    public static void main(String[] args)
    {
        PC pc = new PC();
        MultiPC mpc1 = new MultiPC();
        MultiPC mpc2 = new MultiPC();
        System.out.println("PC cost:"+pc.getCost()+", price:"+pc.getPrice());
        System.out.println("MultiPC: 2CPU, 4HD, cost:"+mpc1.getCost(2, 4)+", price:"+mpc1.getPrice(2, 4));
        System.out.println("MultiPC: 4CPU, 8HD, cost:"+mpc2.getCost(4, 8)+", price:"+mpc2.getPrice(4, 8));
    }
}