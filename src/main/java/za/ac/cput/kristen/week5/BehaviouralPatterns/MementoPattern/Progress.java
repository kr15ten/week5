package za.ac.cput.kristen.week5.BehaviouralPatterns.MementoPattern;

/**
 * Created by kris on 3/12/15.
 */
public class Progress
{
    String projectName;
    int percentage;

    public Progress(String name, int perc)
    {
        projectName = name;
        percentage = perc;
    }

    public String toString()
    {
        return "Project " + projectName + " at " + percentage + "%";
    }

    public void setNameAndPercentage(String name, int perc)
    {
        projectName = name;
        percentage = perc;
    }

    public Savepoint save()
    {
        return new Savepoint(projectName, percentage);
    }

    public void restore(Object objSaved)
    {
        Savepoint savedProgress = (Savepoint)objSaved;
        projectName = savedProgress.savedProjectName;
        percentage = savedProgress.savedPercentage;
    }

    private class Savepoint
    {
        String savedProjectName;
        int savedPercentage;

        public Savepoint(String name, int perc)
        {
            savedProjectName = name;
            savedPercentage = perc;
        }
    }
}
