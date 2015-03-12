package za.ac.cput.kristen.week5.BehaviouralPatterns.InterpreterPattern;

/**
 * Created by kris on 3/12/15.
 */
public class InterpretA implements IInterpret
{
    @Override
    public String word(String word) {
        return word + 'A';
    }
}
