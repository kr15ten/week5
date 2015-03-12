package za.ac.cput.kristen.week5.BehaviouralPatterns.MementoPattern;

import java.sql.Savepoint;

/**
 * Created by kris on 3/12/15.
 */
public class Task
{
    private Object saved;

    public void saveState(Progress prog)
    {
        saved = prog.save();
    }

    public void restoreState(Progress prog)
    {
        prog.restore(saved);
    }
}
