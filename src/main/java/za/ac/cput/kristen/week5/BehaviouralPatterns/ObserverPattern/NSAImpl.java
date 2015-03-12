package za.ac.cput.kristen.week5.BehaviouralPatterns.ObserverPattern;

/**
 * Created by kris on 3/11/15.
 */
public class NSAImpl implements INSA
{
    private Citizens citizens;
    private String name;

    public NSAImpl(Citizens cit, String name)
    {
        citizens = cit;
        this.name = name;
    }

    @Override
    public String update()
    {
        return String.format(name + " sees " + '"' + citizens.getState() + '"');
    }
}
