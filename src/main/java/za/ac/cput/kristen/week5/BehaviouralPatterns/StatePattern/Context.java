package za.ac.cput.kristen.week5.BehaviouralPatterns.StatePattern;

/**
 * Created by kris on 3/11/15.
 */
public class Context
{
    private IState state;

    public Context(IState state)
    {
        this.state = state;
    }

    public String requestHandle()
    {
        return state.doThing();
    }
}
