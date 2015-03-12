package za.ac.cput.kristen.week5.BehaviouralPatterns.ChainOfResponsibilityPattern;

/**
 * Created by kris on 3/10/15.
 */
public class Area1 extends Switchboard
{
    @Override
    public String handleCall(int areaCode)
    {
        if (areaCode == 1)
            return "Area 1 handled";
        else
            return board.handleCall(areaCode);
    }
}
