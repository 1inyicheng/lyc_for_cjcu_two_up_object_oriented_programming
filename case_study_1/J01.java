class LCD
{
    int in(int a)
    {
        if(a==10) return 2000;
        else if(a==15) return 2500;
        else if(a==17) return 3000;
        else return -1;
    }
}
class CPU
{
    int in(double a)
    {
        if(a==1.66) return 6000;
        else if(a==2.2) return 8000;
        else if(a==2.4) return 11000;
        else return -1;
    }
}
class HD
{
    int in(int a)
    {
        if(a==120) return 2400;
        else if(a==160) return 2800;
        else return -1;
    }
}
class MiniNote
{
    LCD lcd = new LCD();
    int lcdp  = lcd.in(10);
    CPU cpu = new CPU();
    int cpup = cpu.in(1.66);
    HD hd = new HD();
    int hdp = hd.in(120);
    
    double getCost()
    {
        return ((lcdp*1.0)+(cpup*1.0)+(hdp*1.0))*1.4;
    }
    int getPrice()
    {
        return (lcdp+cpup+hdp)*2;
    }
}
class Note15
{
    LCD lcd = new LCD();
    int lcdp  = lcd.in(15);
    CPU cpu = new CPU();
    int cpup = cpu.in(2.2);
    HD hd = new HD();
    int hdp = hd.in(160);

    double getCost()
    {
        return ((lcdp*1.0)+(cpup*1.0)+(hdp*1.0))*1.4;
    }
    int getPrice()
    {
        return (lcdp+cpup+hdp)*2;
    }
}
public class J01
{
    public static void main(String[] args)
    {
        MiniNote mn = new MiniNote();
        Note15 n = new Note15();
        System.out.println("MiniNote cost:"+mn.getCost()+", price:"+mn.getPrice());
        System.out.println("Note15 cost:"+n.getCost()+", price:"+n.getPrice());
    }
}