package za.ac.cput.kristen.week5.BehaviouralPatterns.InterpreterPattern;

/**
 * Created by kris on 3/12/15.
 */
public class Context
{
    IInterpret interpret;

    public Context(String inter)
    {
        if (inter == "A")
            interpret = new InterpretA();

        else
            interpret = new InterpretB();
    }

    public String interpretThing(String words)
    {
        return interpret.word(words);
    }
}
