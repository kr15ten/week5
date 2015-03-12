package za.ac.cput.kristen.week5.BehaviouralPatterns.ChainOfResponsibilityPattern;

/**
 * Created by kris on 3/10/15.
 */
public class Area2 extends Switchboard
{
    @Override
    public String handleCall(int areaCode)
    {
        if (areaCode == 2)
            return "Area 2 handled";

        else
            return board.handleCall(areaCode);
    }
}
