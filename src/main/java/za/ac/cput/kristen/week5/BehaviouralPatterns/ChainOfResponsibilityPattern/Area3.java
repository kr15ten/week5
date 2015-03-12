package za.ac.cput.kristen.week5.BehaviouralPatterns.ChainOfResponsibilityPattern;

/**
 * Created by kris on 3/10/15.
 */
public class Area3 extends Switchboard
{
    @Override
    public String handleCall(int areaCode)
    {
        if (areaCode == 3)
            return "Area 3 handled";

        else
            return board.handleCall(areaCode);
    }
}
