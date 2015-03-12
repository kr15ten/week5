package za.ac.cput.kristen.week5.BehaviouralPatterns.CommandPattern;

/**
 * Created by kris on 3/11/15.
 */
public class Test
{
    private int marks;


    public Test(int attempt)
    {
        marks = attempt;
    }

    public int getMarked()
    {
        return marks;
    }
}
