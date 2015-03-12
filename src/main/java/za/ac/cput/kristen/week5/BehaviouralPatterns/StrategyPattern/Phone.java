package za.ac.cput.kristen.week5.BehaviouralPatterns.StrategyPattern;

/**
 * Created by kris on 3/11/15.
 */
public class Phone implements ICommunicate
{
    @Override
    public String talk()
    {
        return "chat on the phone";
    }
}
