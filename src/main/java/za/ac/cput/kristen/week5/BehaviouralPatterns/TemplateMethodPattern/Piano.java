package za.ac.cput.kristen.week5.BehaviouralPatterns.TemplateMethodPattern;

/**
 * Created by kris on 3/10/15.
 */
public class Piano implements IInstrument
{
    @Override
    public String play()
    {
        return "tickle the ivories";
    }
}
