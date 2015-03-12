package za.ac.cput.kristen.week5.BehaviouralPatterns.ChainOfResponsibilityPattern;

/**
 * Created by kris on 3/10/15.
 */
public abstract class Switchboard
{
    Switchboard board;

    public void setSuccessor(Switchboard board)
    {
        this.board = board;
    }

    public abstract String handleCall(int areaCode);
}
