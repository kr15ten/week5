package za.ac.cput.kristen.week5.BehaviouralPatterns.StrategyPattern;

/**
 * Created by kris on 3/11/15.
 */
public class Laptop implements ICommunicate
{
    @Override
    public String talk() {
        return "type on the keyboard";
    }
}
