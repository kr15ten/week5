package za.ac.cput.kristen.week5.StructuralPatterns.BridgePattern;

/**
 * Created by kris on 3/10/15.
 */
public class Abstr
{
    private IHide hide;

    public Abstr()
    {
        hide = new Brendan();
    }

    public String types()
    {
        return hide.types();
    }
}
