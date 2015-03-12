package za.ac.cput.kristen.week5.StructuralPatterns.FlyweightPattern;

/**
 * Created by kris on 3/9/15.
 */
public class Cake implements iCake
{
    private String type, icingColor;

    public void makeCake(String type, String icing)
    {
        this.type = type;
        icingColor = icing;
    }

    public String toString()
    {
        return String.format(icingColor + " " + type + " cake");
    }
}
