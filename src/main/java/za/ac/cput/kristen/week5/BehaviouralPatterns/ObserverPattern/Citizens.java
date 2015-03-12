package za.ac.cput.kristen.week5.BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kris on 3/11/15.
 */
public class Citizens
{
    private static Citizens cit = null;
    private List<INSA> observer;
    private String state;

    private Citizens()
    {
        observer = new ArrayList<INSA>();
    }

    public static Citizens getInstance()
    {
        if (cit == null)
        {
            cit = new Citizens();
        }

        return cit;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public void addWatcher(INSA watcher)
    {
        observer.add(watcher);
    }

    public String notifyWatcher()
    {
        //for (int a = 0; a < observer.size(); a++)
        //{
        //    observer.get(a).update();
        //}

        return observer.get(0).update();
    }

}
